/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-23 23:18:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import member.model.service.MemberService;
import member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1619184460358L));
    _jspx_dependants.put("/WEB-INF/views/common/header0.jsp", Long.valueOf(1619219346470L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.service.MemberService");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String msg = (String) session.getAttribute("msg");
	if (msg != null)
	session.removeAttribute("msg");
	Member loginMember = (Member) session.getAttribute("loginMember");
	//사용자 쿠키처리
	String saveId = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie c : cookies) {
			String name = c.getName();
			String value = c.getValue();
			System.out.println(name + " : " + value);
			if ("saveId".equals(name))
		saveId = value;
		}
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\" id=\"ho_html\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("\r\n");
      out.write("<title>미플</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/css/header0.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"ho_body\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<header id=\"ho_header\">\r\n");
      out.write("\t<div id=\"header_total_wrapper\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"icon1\" class=\"icon\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon.png\" id=\"icon1_image\" class=\"icon_image\"/></div>\r\n");
      out.write("\t<div id=\"icon2\" class=\"icon\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon.png\" id=\"icon2_image\" class=\"icon_image\"/></div>\r\n");
      out.write("\t<div id=\"icon3\" class=\"icon\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon.png\" id=\"icon3_image\" class=\"icon_image\"/></div>\r\n");
      out.write("\t<div id=\"icon4\" class=\"icon\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon.png\" id=\"icon4_image\" class=\"icon_image\"/></div>\r\n");
      out.write("\t<div id=\"icon5\" class=\"icon\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon.png\" id=\"icon5_image\" class=\"icon_image\"/></div>\r\n");
      out.write("\t<div id=\"icon6\" class=\"icon\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon.png\" id=\"icon6_image\" class=\"icon_image\"/></div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"background_image_wrapper_ho\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/backgroundimage.png\" id=\"ho_header_background\"/>\r\n");
      out.write("\t<div id=\"airplane_icon\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/airplane.png\" id=\"airplane_icon_image\"/></div></div>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/\" id=\"ho_header_logo_a\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/Logo.png\" id=\"ho_Logo\"/></a>\r\n");
      out.write("\t<div class=\"ho_login\">\r\n");
      out.write("\t\t\t");

				if (loginMember == null) {
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"로그인\" id=\"login_button\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"회원가입\" id=\"signup_button\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/enroll';\">\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<table id=\"ho_login\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(loginMember.getName());
      out.write("님, 안녕하세요.</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"button\" value=\"mypage\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/mypage';\" class=\"loginbtn\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"logout\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/logout';\" class=\"loginbtn\"/>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"ment_header2\">너와 나의 연결 고리! 취미 생활 크루 찾기!</div>\r\n");
      out.write("\t\t\t<div id=\"ment_header\">\r\n");
      out.write("\t\t\t\tNo.1 취미모임 앱, 미플\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"ho_boxContainer\">\r\n");
      out.write("\t\t\t\t<table class=\"ho_elementsContainer\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"ho_searchKeyword\" type=\"text\" placeholder=\"Search\" class=\"ho_search\" onkeyup=\"enterkey();\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"ho_material-icons\" src=\"");
      out.print(request.getContextPath() );
      out.write("/images/baseline_search_black_24dp.png\"  onclick=\"search();\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"ho_loginEnd\"></div>\r\n");
      out.write("\t\t<div id=\"login_frame_wrapper\" >\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<!-- Loginframe 평소에 hide -->\r\n");
      out.write("\t\t<div id=\"login_frame_div\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<div id=\"information_in_image1_wrapper\">\r\n");
      out.write("\t\t\t<h1 id=\"information_in_image1\">지금 바로 원하는 지역의 모임 </h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h1 id=\"information_in_image2\">미플 </h1>\r\n");
      out.write("\t\t\t<h1 id=\"login_count1\" class=\"background_ment\">현재 <a id=\"memberCount\" class=\"background_ment\"></a>명의 회원이 미플과 함께하고 있어요.</h1>\r\n");
      out.write("\t\t\t<h1 id=\"login_count2\" class=\"background_ment\"><a id=\"meetingCount\" class=\"background_ment\"></a>개의 모임에 지금 바로참여하세요  :)</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/meet.jpg\" id=\"login_image\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 로그인 포지션-->\r\n");
      out.write("\t\t\t<form id=\"login_form\"\r\n");
      out.write("\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/member/login\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" id=\"login_closeBtn\" value=\"X\" style=\"float:right;\"/>\r\n");
      out.write("\t\t\t\t\t<h1 style=\"clear:both;\">로그인</h1>\r\n");
      out.write("\t\t\t\t\t<br> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"id_input\" id=\"id_input\" placeholder=\"아이디를 입력해주세요.\"");
      out.print(saveId != null ? "value='" + saveId + "'" : "");
      out.write("> <br>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password_input\" id=\"password_input\" placeholder=\"비밀번호를 입력해주세요.\"> <br> \r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"login_submit\" id=\"login_submit\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div id=\"checkbox_findbox_wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"checkbox_wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"saveid\" id=\"saveid\" ");
      out.print(saveId != null ? "checked" : "");
      out.write(" /> \r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"saveid\" id=\"saveidlabel\">로그인 유지하기</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/member/find\"><span id=\"find_span\">아이디+비밀번호 찾기</span></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t<div class=\"enroll_div\" id=\"enroll_div\"  onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/enroll';\" style=\"clear:both\";>\r\n");
      out.write("\t\t\t\t\t\t미플 회원가입하기\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<ol>\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/all.png\" id=\"li_all_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList\">전체</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C1';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/music.png\" id=\"li_music_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C1\">음악</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C2';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/game.png\" id=\"li_game_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C2\">게임</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C3';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/gym.png\" id=\"li_gym_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C3\">운동</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C4';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/cook.png\" id=\"li_cook_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C4\">요리</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C5';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/book.png\" id=\"li_book_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C5\">독서</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C6';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/finantial.png\" id=\"li_financial _image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C6\">재테크</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C7';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/car.png\" id=\"li_car_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C7\">자동차</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/board/boardList';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/board.png\" id=\"li_board_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/board/boardList\">자유게시판</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/board/adminBoardList';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/notice.png\" id=\"li_notice_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/board/adminBoardList\">공지사항</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
if(loginMember!=null && loginMember.getMemberRole().equals(MemberService.ADMIN_ROLE)) { 
      out.write("\r\n");
      out.write("\t\t\t<li class=\"header_title_li\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/admin/memberList';\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/manage.png\" id=\"li_manage_image\" class=\"li_image\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/memberList\">회원관리</a></li>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t");
if(msg!=null){
      out.write("\r\n");
      out.write("\t\t\t\talert(\"");
      out.print(msg);
      out.write("\");\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
if(loginMember == null){
      out.write("\r\n");
      out.write("\t\t\t$(signup_button).click(function(){\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/member/enroll\";\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(login_button).click(function() {\r\n");
      out.write("\t\t\t\tvar top = screen.availHeight / 2 - 300;\r\n");
      out.write("\t\t\t\t$(\"#login_frame_div\").attr('style', 'display:flex; top:'+top+'px;');\r\n");
      out.write("\t\t\t\t$(\"#login_frame_wrapper\").attr('style', 'display:flex; top:'+top+'px;');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(id_input.value.length==0){\r\n");
      out.write("\t\t\t\t\t$('#id_input').focus();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$('#password_input').focus();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(login_closeBtn).click(function(){\r\n");
      out.write("\t\t\t\t$(\"#login_frame_div\").attr('style', 'display:none;');\r\n");
      out.write("\t\t\t\t$(\"#login_frame_wrapper\").attr('style', 'display:none;');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(login_frame_wrapper).click(function(){\r\n");
      out.write("\t\t\t\t$(\"#login_frame_div\").attr('style', 'display:none;');\r\n");
      out.write("\t\t\t\t$(\"#login_frame_wrapper\").attr('style', 'display:none;');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\t//총인원과 총모임 ajax\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:\"");
      out.print( request.getContextPath());
      out.write("/member/count\",\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t/* 총인원수 저장 */\r\n");
      out.write("\t\t\t\t\t\tvar memberCount=data;\r\n");
      out.write("\t\t\t\t\t\t$(\"#memberCount\").html(memberCount);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror:function(xhr, status, error){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(xhr, status, error);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:\"");
      out.print( request.getContextPath());
      out.write("/member/count\",\r\n");
      out.write("\t\t\t\t\tmethod: \"POST\",\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\tvar meetingCount=data;\r\n");
      out.write("\t\t\t\t\t\t$(\"#meetingCount\").html(meetingCount);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror:function(xhr, status, error){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(xhr, status, error);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//검색창 엔터\r\n");
      out.write("\t\t\tfunction enterkey() {\r\n");
      out.write("\t\t        if (window.event.keyCode == 13) {\r\n");
      out.write("\t\t        \tsearch();\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction search(){\r\n");
      out.write("\t\t\t\tvar $keyword = $(\"#ho_searchKeyword\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(/^.{1,}$/.test($keyword)==false){\r\n");
      out.write("\t\t\t\t\t$(\"#ho_searchKeyword\").focus();\r\n");
      out.write("\t\t\t\t\talert(\"검색 키워드를 1글자 이상 입력해주세요\");\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?search=\"+$keyword;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</header>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<section id=\"ho_section\">");
      out.write("\r\n");
      out.write("\t<!-- 지역별 -->\r\n");
      out.write("\t<div class=\"titleWrapper\">\r\n");
      out.write("\t\t<h4>지역　　</h4> <div onclick=\"left1()\">&lt</div><div onclick=\"right1()\">&gt</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"locationList\" class=\"boxWrapper\">\r\n");
      out.write("\t\t\t");
 	
				List<String> list = new ArrayList<>();
				list.add("L1");
				list.add("/images/location/L1.png");
				list.add("서울");
				list.add("L2");
				list.add("/images/location/L2.png");
				list.add("경기");
				list.add("L3");
				list.add("/images/location/L3.png");
				list.add("인천");
 				list.add("L4");
				list.add("/images/location/L4.png");
				list.add("대전·충청");
				list.add("L5");
				list.add("/images/location/L5.png");
				list.add("대구·경북");
				list.add("L6");
				list.add("/images/location/L6.png");
				list.add("부산·경남");
				list.add("L7");
				list.add("/images/location/L7.png");
				list.add("울산");
				list.add("L8");
				list.add("/images/location/L8.png");
				list.add("광주");
				
				for(int i=0; i<list.size(); ){
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"boxContents\">\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath()+"/meeting/meetingList?location="+list.get(i++));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.print(list.get(i++));
      out.write("\" width=220px height=150px/>\r\n");
      out.write("\t\t\t\t\t\t<span>");
      out.print(list.get(i++));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 카테고리별 -->\r\n");
      out.write("\t<div class=\"titleWrapper\">\r\n");
      out.write("\t\t<h4>카테고리</h4> <div onclick=\"left2()\">&lt</div><div onclick=\"right2()\">&gt</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"categoryList\" class=\"boxWrapper\">\r\n");
      out.write("\t\t");
 	
				list = new ArrayList<>();
				list.add("C1");
				list.add("/images/category/C1.png");
				list.add("음악");
				list.add("C2");
				list.add("/images/category/C2.png");
				list.add("게임");
				list.add("C3");
				list.add("/images/category/C3.png");
				list.add("운동");
				list.add("C4");
				list.add("/images/category/C4.png");
				list.add("요리");
				list.add("C5");
				list.add("/images/category/C5.png");
				list.add("독서");
				list.add("C6");
				list.add("/images/category/C6.png");
				list.add("재테크");
				list.add("C7");
				list.add("/images/category/C7.png");
				list.add("자동차");
				
				for(int i=0; i<list.size(); ){
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"boxContents\">\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath()+"/meeting/meetingList?category="+list.get(i++));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.print(list.get(i++));
      out.write("\" width=220px height=150px/>\r\n");
      out.write("\t\t\t\t\t\t<span>");
      out.print(list.get(i++));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 최근생성된 모음 10개 할거임 -->\r\n");
      out.write("\t<div class=\"titleWrapper\">\r\n");
      out.write("\t\t<h4>최근생성</h4> <div onclick=\"left3()\">&lt</div><div onclick=\"right3()\">&gt</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"recent\" class=\"boxWrapper\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 게시판 영역 -->\r\n");
      out.write("\t<div class=\"boardWrapper\">\r\n");
      out.write("\t\t<div class=\"board\" id=\"board_index\">\r\n");
      out.write("\t\t\t<h3>자유게시판</h3>\r\n");
      out.write("\t\t\t<div id=\"userBoard\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"board\" id=\"notice_index\">\r\n");
      out.write("\t\t\t<h3>공지사항</h3>\r\n");
      out.write("\t\t\t<div id=\"adminBoard\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t//최근 생성 모임 불러오기\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:\"");
      out.print( request.getContextPath());
      out.write("/meeting/indexRecentMeeting\",\r\n");
      out.write("\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t$(\"#recent\").html(data);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror:function(xhr, status, error){\r\n");
      out.write("\t\t\t\t\tconsole.log(xhr, status, error);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//자유게시판 불러오기\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: \"");
      out.print( request.getContextPath() );
      out.write("/board/indexUserBoard\",\r\n");
      out.write("\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t$(\"#userBoard\").html(data);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror: function(xhr, status, error){\r\n");
      out.write("\t\t\t\t\tconsole.log(\"error call!\");\r\n");
      out.write("\t\t\t\t\tconsole.log(xhr, status, error);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//공지사항 불러오기\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: \"");
      out.print( request.getContextPath() );
      out.write("/board/indexAdminBoard\",\r\n");
      out.write("\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t$(\"#adminBoard\").html(data);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror: function(xhr, status, error){\r\n");
      out.write("\t\t\t\t\tconsole.log(\"error call!\");\r\n");
      out.write("\t\t\t\t\tconsole.log(xhr, status, error);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t//#locationList 좌우 움직이는 스크립트\r\n");
      out.write("\t\tvar move1 = 1;\r\n");
      out.write("\t\tfunction right1(){\r\n");
      out.write("\t\t\tif(move1 >= 1 && move1 <= 3 ){\r\n");
      out.write("\t\t\t\t$(\"#locationList\").attr(\"style\",\"transform:translateX(\"+(-240)*(move1++)+\"px);\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction left1(){\r\n");
      out.write("\t\t\tif(move1 >= 2 && move1 <= 4 ){\r\n");
      out.write("\t\t\t\t$(\"#locationList\").attr(\"style\",\"transform:translateX(\"+(-240)*(--move1-1)+\"px);\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//#locationList 좌우 움직이는 스크립트\r\n");
      out.write("\t\tvar move2 = 1;\r\n");
      out.write("\t\tfunction right2(){\r\n");
      out.write("\t\t\tif(move2 >= 1 && move2 <= 2 ){\r\n");
      out.write("\t\t\t\t$(\"#categoryList\").attr(\"style\",\"transform:translateX(\"+(-240)*(move2++)+\"px);\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction left2(){\r\n");
      out.write("\t\t\tif(move2 >= 2 && move2 <= 3 ){\r\n");
      out.write("\t\t\t\t$(\"#categoryList\").attr(\"style\",\"transform:translateX(\"+(-240)*(--move2-1)+\"px);\")\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//#recent 좌우 움직이는 스크립트(AJax동적생성)\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/css/footer.css\" />\r\n");
      out.write("</section>\r\n");
      out.write("<hr style=\"margin-top:40px\" />\r\n");
      out.write("<footer>\r\n");
      out.write("        <div class=\"meeple-footer container\">\r\n");
      out.write("        <div class=\"infofooter\">\r\n");
      out.write("            <h1>MeetPeople 제작 정보</h1>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <p>MeetPeople</p>\r\n");
      out.write("            <p>소속 : KH정보교육원 | 서울특별시 강남구 역삼동 823-25</p>\r\n");
      out.write("            <p>팀장 : 김윤수</p>\r\n");
      out.write("            <p>팀원 : 천호현 강종성 박요한 이승우 최한성</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"etc\">\r\n");
      out.write("            <h1>관련 사이트</h1>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <p>김윤수 : <a href=\"https://github.com/kimdia200\" target=\"_blank\">https://github.com/kimdia200 <i class=\"fas fa-external-link-alt\"></i></a></p>\r\n");
      out.write("            <p>강종성 : <a href=\"https://github.com/bellcastle88\" target=\"_blank\">https://github.com/bellcastle88 <i class=\"fas fa-external-link-alt\"></i></a></p>\r\n");
      out.write("            <p>박요한 : <a href=\"https://github.com/dygksqkr12\" target=\"_blank\">https://github.com/dygksqkr12 <i class=\"fas fa-external-link-alt\"></i></a></p>\r\n");
      out.write("            <p>이승우 : <a href=\"https://github.com/onreverse01\" target=\"_blank\">https://github.com/onreverse01 <i class=\"fas fa-external-link-alt\"></i></a></p>\r\n");
      out.write("            <p>천호현 : <a href=\"https://github.com/hohyuncheon\" target=\"_blank\">https://github.com/hohyuncheon <i class=\"fas fa-external-link-alt\"></i></a></p>\r\n");
      out.write("            <p>최한성 : <a href=\"https://github.com/HSdover\" target=\"_blank\">https://github.com/HSdover <i class=\"fas fa-external-link-alt\"></i></a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"contact\">\r\n");
      out.write("            <h1>고객센터</h1>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath() );
      out.write("/claim/claimMenu\">문의하기 <i class=\"fas fa-external-link-alt\"></i></a>\r\n");
      out.write("            <p>Tel : 010-6353-4583 (평일 09:00 ~ 18:00)</p>\r\n");
      out.write("            <p>Mail : meetpeople_kh@gmail.com</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script \r\n");
      out.write("     src=\"https://kit.fontawesome.com/39a2f80180.js\"\r\n");
      out.write("     crossorigin=\"anonymous\"\r\n");
      out.write("     ></script>\r\n");
      out.write("</footer>\r\n");
      out.write("        <hr style=\"margin-top:40px; width:100%;\">\r\n");
      out.write("        <h2 id=\"last\">Copyright 2021. &lt; KH-SEMI-PROJECT &gt; all rights reserved.</h2>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
