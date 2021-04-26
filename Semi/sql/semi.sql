-- 프로젝트용 semi 계정 생성
--create user semi
--identified by semi
--default tablespace users;

--connect, resource를 부여
--grant connect, resource to semi;

--semi
drop trigger trig_blackList;
drop trigger trig_auto_participation;
drop table meeting_chat;
drop table blackList;
drop table faq;
drop table pwd_certification;
drop table admin_board;
drop table user_board_comment;
drop table user_board;
drop table participation;
drop table attachment;
drop table meeting;
drop table member;
drop table category;
drop table location;

drop sequence seq_meeting_chat;
drop sequence seq_blackList;
drop sequence seq_faq;
drop sequence seq_pwd_certification;
drop sequence seq_admin_board;
drop sequence seq_user_board_comment;
drop sequence seq_user_board;
drop sequence seq_participation;
drop sequence seq_attachment;
drop sequence seq_meeting;

--지역 테이블
create table location(
    lcode varchar2(10),
    lname varchar2(30),
    constraint pk_location_code primary key(lcode)
);

insert into location values('L1', '서울');
insert into location values('L2', '경기');
insert into location values('L3', '인천');
insert into location values('L4', '대전·충청');
insert into location values('L5', '대구·경북');
insert into location values('L6', '부산·경남');
insert into location values('L7', '울산');
insert into location values('L8', '광주');

--카테고리 테이블
create table category(
    ccode varchar2(10),
    cname varchar2(20),
    constraint pk_category_code primary key(ccode)
);

insert into category values('C1', '음악');
insert into category values('C2', '게임');
insert into category values('C3', '운동');
insert into category values('C4', '요리');
insert into category values('C5', '독서');
insert into category values('C6', '재테크');
insert into category values('C7', '자동차');

--회원 테이블
create table member(
    member_id varchar2(50),
    password varchar2(100) not null,
    name varchar2(100) not null,
    email varchar2(100) not null,
    phone varchar2(11) not null,
    event1 varchar2(2),
    event2 varchar2(2),
    enroll_date date default sysdate,
    member_role varchar2(2) default 'U' not null,
    constraint pk_member_id primary key(member_id),
    constraint ck_member_event1 check(event1 in ('T','F')),
    constraint ck_member_event2 check(event2 in ('T','F')),
    constraint ck_member_role check(member_role in ('U','A'))
);


--미팅 테이블
create table meeting(
    meeting_no number,
    title varchar2(500) not null,
    writer varchar2(50),
    content clob not null,
    --첨부파일도
    reg_date date default sysdate,
    place varchar2(100),
    time date,
    max_people number,
    cost number,
    category_code varchar2(10),
    location_code varchar2(10),
    constraint pk_meeting_no primary key(meeting_no),
    constraint fk_meeting_writer foreign key(writer) references member(member_id) on delete cascade,
    constraint fk_meeting_category foreign key(category_code) references category(ccode),
    constraint fk_meeting_location foreign key(location_code) references location(lcode)
    
);


--미팅 시퀀스
create sequence seq_meeting;

--첨부파일테이블 생성
create table attachment (
    attach_no number primary key,
    meeting_no number not null,
    original_filename varchar2(255) not null,
    renamed_filename varchar2(255) not null,
    status char(1) default 'Y',
    constraint fk_attach_board_no foreign key(meeting_no) references meeting(meeting_no) on delete cascade,
	constraint ck_status check(status in ('Y','N'))
);
--첨부파일 시퀀스
create sequence seq_attachment;


--미팅 참가자 테이블
create table participation(
    partici_no number primary key,
    meeting_no number,
    partici_id varchar2(50),
    reg_date date default sysdate,
    status char(1) default 'Y',
    constraint fk_partici_meeting_no foreign key(meeting_no) references meeting(meeting_no) on delete cascade,
    constraint fk_partici_id foreign key(partici_id) references member(member_id) on delete cascade,
    constraint ck_partici_status check(status in ('Y','N'))
);



--참가자 테이블 시퀀스
create sequence seq_participation;

--미팅 테이블에 insert시(= 모임게시글 작성시) 작성자는 참가자테이블에 자동 등록 되는 트리거 생성
create or replace trigger trig_auto_participation
    after
    insert on meeting
    for each row
begin
    insert into participation
    values (seq_participation.nextval, :new.meeting_no, :new.writer, sysdate, 'Y');
end;
/

--자유게시판 테이블
create table user_board(
    board_no number, 
    title varchar2(50), 
    writer varchar2(15),
    content clob, 
    reg_date date default sysdate, 
    read_cnt number default 0,
    --vo에서는 Comment_count추가할것
    constraint pk_user_board_no primary key(board_no),
    constraint fk_writer foreign key(writer) references member(member_id) on delete set null
);
--자유게시판 시퀀스
create sequence seq_user_board;

--댓글 테이블
create table user_board_comment(
  comment_no number,
  comment_level number default 1,
  writer varchar2(15), --member참조
  content varchar2(2000),
  board_no number, --board 참조
  comment_ref number, --현재 테이블의 no참조
  reg_date date default sysdate,
  constraint pk_board_comment_no primary key(comment_no),
  constraint fk_board_comment_writer foreign key(writer) REFERENCES member(member_id) on delete set null,
  constraint fk_board_comment_board_no foreign key(board_no) REFERENCES user_board(board_no) on delete set null,
  constraint fk_board_comment_ref foreign key(comment_ref) REFERENCES user_board_comment(comment_no) on delete set null
);

--댓글 시퀀스
create sequence seq_user_board_comment;

--공지사항 게시판 테이블
create table admin_board(
    board_no number, 
    title varchar2(50), 
    writer varchar2(15),
    content clob, 
    reg_date date default sysdate,
    read_cnt number default 0,
    constraint pk_admin_board_no primary key(board_no),
    constraint fk_admin_writer foreign key(writer) references member(member_id) on delete set null
);
--공지사항 시퀀스
create sequence seq_admin_board;

--비밀번호변경 인증값 테이블
create table pwd_certification(
  no number,
  id varchar2(15),
  certification_code varchar2(100),
  constraint pk_pwd_certification_no primary key(no),
  constraint fk_pwd_certification_id foreign key(id) references member(member_id) on delete cascade
);

create sequence seq_pwd_certification;

--FAQ
create table faq(
    no number,
    title varchar2(200),
    content varchar2(4000),
    constraint pk_faq_no primary key(no)
);

create sequence seq_faq;


--블랙리스트 테이블
create table blackList(
    no number,
    email varchar2(100)
);
create sequence seq_blackList;

--블랙리스트 테이블에 insert시 자동으로 member테이블에서는 제외 될수있도록
create or replace trigger trig_blackList
    after
    insert on blackList
    for each row
begin
    delete member where email= :new.email;
end;
/

--meeting테이블에 추가적으로 달아줄 실시간채팅테이블
create table meeting_chat(
    no number,
    meeting_no number,
    writer varchar2(100),
    contents varchar2(2000),
    reg_date date default sysdate,
    constraint pk_meeting_chat_no primary key(no),
    constraint fk_meeting_chat_mNo foreign key(meeting_no) references meeting(meeting_no) on delete cascade,
    constraint fk_meeting_chat_writer foreign key(writer) references member(member_id) on delete cascade
);
--시퀀스 생성
create sequence seq_meeting_chat;










insert into faq values(seq_faq.nextval, '제목제목제목제목제목10','1');
select * from faq;

commit;








insert into meeting values(seq_meeting.nextval, '피아노 배우실분13', 'admin', '피아노 배우실분구합니다.', sysdate, '홍대','2021/05/05', 6, 10000, 'C1', 'L1');
commit;
select * from meeting;
rollback;





















--게시판 내용 추가 실험
insert into member values('user', '1234', '유저', 'ㅇㅇㅇ@.com','01011111111','T','T',sysdate,'U');
select * from member;
insert into user_board(board_no, title, writer, content) values(seq_user_board.nextval, '제목1', 'admin', '내용1'); --11개 넣음
commit;

select * from (select rownum rnum, b.* from (select * from user_board order by board_no desc) b) where rnum between 6 and 10;

rollback;
select * from user_board;

insert into user_board_comment
values(seq_user_board_comment.nextval, 1, 'admin', '잘봤어요', 16, null, sysdate);
commit;

select * from user_board_comment;
select count(*) from user_board_comment where board_no=16;

select * from member;

update user_board set title = '제목테스트~', content = '내용내용내용' where board_no = 2;

update member set enroll_date = sysdate where member_id = 'test1';

desc user_board_comment;
select * from user_board_comment where board_no = 16 start with comment_level = 1 connect by prior comment_no = comment_ref order siblings by reg_date asc;

update user_board_comment set content = '감사합니다' where comment_level = 2;


select * from admin_board;

insert into admin_board(board_no, title, writer, content) values(seq_admin_board.nextval, '제목16', 'admin', '내용1');
commit;

select * from pwd_certification;

select * from meeting;

select * from meeting where location_code like '%%' and category_code like '%%' order by reg_date;

select rownum, l.* from location l where rownum between 1 and 10;

select * from meeting;

select * from (select rownum rnum, m.* from (select * from meeting order by meeting_no desc) m) where rnum between 1 and 10;

select * from meeting m left join category c on m.category_code = c.ccode left join location l on m.location_code = l.lcode order by m.meeting_no desc;

select * from attachment;
insert into attachment values(seq_attachment.nextval, 13, '샘플13', 'sample.png', 'Y');
commit;

select * from meeting;
select * from participation;
update participation set meeting_no=22 where partici_no = 15;
insert into participation values(seq_participation.nextval, 13, 'admin', sysdate, 'Y');
commit;
rollback;


select seq_meeting.currval from dual;
insert into meeting values(seq_meeting.nextval, '피아노 배우실분14', 'admin', '피아노 배우실분구합니다.', sysdate, '홍대','2021/05/05', 6, 10000, 'C1', 'L1');
insert into participation values(seq_participation.nextval, 7, 'dygks12', sysdate, 'Y');
commit;
select * from participation;
select * from member;


select * from meeting m left join location l on m.location_code = l.lcode left join category c on m.category_code = c.ccode
where m.category_code like '%%' and m.location_code like '%%' and m.title like '%%';



select * from participation;

select * from (select rownum rnum, m.* from (select * from meeting order by meeting_no desc) m) where rnum between 1 and 4;

select * from (select rownum, p.* from (select * from participation  where partici_id = 'admin' order by partici_no desc) p where rownum between 1 and 4) p left join meeting m on p.meeting_no = m.meeting_no;


delete participation where partici_no=22;
commit;


select * from user_board order by board_no desc;
update user_board set read_cnt=100 where board_no=103;
commit;

select * from attachment;
select * from meeting m left join category c on m.category_code = c.ccode left join location l on m.location_code = l.lcode where meeting_no = 23;
select * from participation order by partici_no desc;

select * from participation where meeting_no=23 and status='Y';

update meeting set title = ? ,content = ?, place = ?, time = ?, max_people = ?, cost = ?, category_code = ?, location_code = ? where meeting_no = ?;

select * from meeting order by meeting_no desc;
select * from participation;
select * from attachment;
commit;
rollback;


insert into attachment values(seq_attachment.nextval, 13, '11', '22', 'Y');

update meeting set content='게임 하실분?' where meeting_no = 42;

 
select * from member order by enroll_date desc;

select * from member;

update member set member_role='A' where member_id = 'kimdia2000';


select * from pwd_certification;


select * from member;

update member set email='kimdia200@naver.com' where member_id = 'finaltest';
commit;

select * from blacklist order by no asc;
insert into blacklist values(seq_blacklist.nextval, 'test@naver.com' || seq_blacklist.currval);
rollback;

select * from member;

update member set password = 'K74MSLkafRuKZ1Ooucvh2xa4Q3nz+R/hFWIShN96SPHNcem+uQ6mFMe9kkJQqp5EaoZnJeaFpl310TmlzRgNyQ==';
commit;
rollback;
select * from meeting order by meeting_no desc;
update meeting set time = '21/04/24 15:04' where meeting_no=61;

update member set password = '1234' where member_id='user2260';



select * from meeting_chat order by reg_date asc    ;
update meeting_chat set contents='~~~~시 까지 입니다.~~~~시 까지 입니다.~~~~시 까지 입니다.~~~~시 까지 입니다.~~~~시 까지 입니다.' where writer='dygks12';
commit;

select * from meeting order by reg_date desc;
update meeting set content ='dddd' where content='';

commit;

select * from tab;

select * from anw_board;
select * from claim_board;

select * from meeting order by meeting_no desc;

update meeting set content='동호회 모집!!!' where meeting_no = 146;
commit;