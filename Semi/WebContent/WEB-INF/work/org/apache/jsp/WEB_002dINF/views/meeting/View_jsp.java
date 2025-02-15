/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-27 14:52:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.meeting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;
import meeting.model.vo.Meeting;
import member.model.service.MemberService;
import member.model.vo.Member;

public final class View_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1619368507292L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1619516117329L));
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
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("meeting.model.vo.Meeting");
    _jspx_imports_classes.add("java.sql.Date");
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
 
	Meeting m = (Meeting)request.getAttribute("meeting");
	List<String> list = (List<String>)request.getAttribute("list");

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
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<title>미플</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/css/header.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t<div id=\"background_header_div\">\r\n");
      out.write("\t<div id=\"header_icon\"><img src=\"/semi/images/icon3.png\" id=\"icon4_image\" class=\"icon_image\"></div>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"boxContainer\">\r\n");
      out.write("\t\t\t\t<table class=\"elementsContainer\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"searchKeyword\" type=\"text\" placeholder=\"키워드를 입력해주세요\" class=\"search\" onkeyup=\"enterkey();\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"material-icons\" src=\"");
      out.print(request.getContextPath() );
      out.write("/images/baseline_search_black_24dp.png\"  onclick=\"search();\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/Logo.png\" id=\"Logo\"/></a>\r\n");
      out.write("\t\t\t<div class=\"login\">\r\n");
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
      out.write("\t\t\t<table id=\"login\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"header_td\">");
      out.print(loginMember.getName());
      out.write("님, 안녕하세요.</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"header_td\"><input type=\"button\" value=\"mypage\"\r\n");
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
      out.write("\t\t\t<div class=\"loginEnd\"></div>\r\n");
      out.write("\t\t<div id=\"login_frame_wrapper\" >\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<!-- Loginframe 평소에 hide -->\r\n");
      out.write("\t\t<div id=\"login_frame_div\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<div id=\"information_in_image1_wrapper\">\r\n");
      out.write("\t\t\t<h1 id=\"information_in_image1\">지금 바로 원하는 지역의 모임 </h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h1 id=\"information_in_image2\">미플 </h1>\r\n");
      out.write("\t\t\t<h1 id=\"login_count1\" class=\"background_ment\">현재 <a id=\"memberCount\"></a>명의 회원이 미플과 함께하고 있어요.</h1>\r\n");
      out.write("\t\t\t<h1 id=\"login_count2\" class=\"background_ment\"><a id=\"meetingCount\"></a>개의 모임에 지금 바로참여하세요  :)</h1>\r\n");
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
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList\" id=\"header_li1\">전체</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C1\" id=\"header_li2\">음악</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C2\" id=\"header_li3\">게임</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C3\" id=\"header_li4\">운동</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C4\" id=\"header_li5\">요리</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C5\" id=\"header_li6\">독서</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C6\" id=\"header_li7\">재테크</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingList?category=C7\" id=\"header_li8\">자동차</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/boardList\" id=\"header_li9\">자유게시판</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/adminBoardList\" id=\"header_li10\">공지사항</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
if(loginMember!=null && loginMember.getMemberRole().equals(MemberService.ADMIN_ROLE)) { 
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/memberList\" id=\"header_li11\">관리</a></li>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\t\t</div>\r\n");
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
if(loginMember==null){
      out.write("\r\n");
      out.write("\t\t\t\t$(signup_button).click(function(){\r\n");
      out.write("\t\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/member/enroll\";\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t$(login_button).click(function() {\r\n");
      out.write("\t\t\t\tvar top = screen.availHeight / 2 - 250;\r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\t//총인원과 총모임 ajax\r\n");
      out.write("\t\t\t\t");
if(loginMember==null){
      out.write("\r\n");
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
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//검색창 엔터\r\n");
      out.write("\t\t\tfunction enterkey() {\r\n");
      out.write("\t\t        if (window.event.keyCode == 13) {\r\n");
      out.write("\t\t        \tsearch();\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction search(){\r\n");
      out.write("\t\t\t\tvar $keyword = $(\"#searchKeyword\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(/^.{1,}$/.test($keyword)==false){\r\n");
      out.write("\t\t\t\t\t$(\"#searchKeyword\").focus();\r\n");
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
      out.write("\r\n");
      out.write("\t<section>");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/meetingView.css\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"meetingViewWrapper\">\r\n");
      out.write("\t\t<div id=\"meetingViewLeft\">\r\n");
      out.write("\t\t\t<div id=\"imgWrapper\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/upload/");
      out.print(m.getAttach().getRenamedFilename());
      out.write("\"/>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t<div id=\"contentWrapper\">\r\n");
      out.write("\t\t\t\t");
      out.print( m.getContent() );
      out.write("\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"meetingViewRight\">\r\n");
      out.write("\t\t\t<div id=\"description\">\r\n");
      out.write("\t\t\t\t<h2>");
      out.print( m.getTitle() );
      out.write("</h2>\r\n");
      out.write("\t\t\t\t<!-- 카테고리, 지역,             장소 시간 참가비용 인원 작성일자 -->\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>카테고리</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(m.getCategoryName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>지역</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( m.getLocationName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>장소</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( m.getPlace() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>일자</th>\r\n");
      out.write("\t\t\t\t\t\t");
 
							SimpleDateFormat sdf =  new SimpleDateFormat("yy-MM-dd HH:mm");
							SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( sdf.format(m.getTime()) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>참가비용</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( m.getCost() );
      out.write("원</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>인원</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(m.getCountParticipation() );
      out.write(' ');
      out.write('/');
      out.write(' ');
      out.print(m.getMaxPeople() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>등록일자</th>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( sdf2.format(m.getRegDate()) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<form id=\"meetingViewFrm\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"memberId\" value=\"");
      out.print(loginMember != null ? loginMember.getMemberId() : "");
      out.write("\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"meetingNo\" value=\"");
      out.print(m.getMeetingNo());
      out.write("\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<!-- 작성자 본인은 취소 불가, 신청시 디비추가 -->\r\n");
      out.write("\t\t\t");
if(loginMember!=null && (list.contains(loginMember.getMemberId()) && m.getTime().getTime() > new java.util.Date().getTime())) {
      out.write("\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"취소\" class=\"meetingViewBtn\" id=\"cancel\" onclick=\"cancel();\"/>\r\n");
      out.write("\t\t\t");
} else if(m.getTime().getTime()< new java.util.Date().getTime()
				 || m.getCountParticipation()>=m.getMaxPeople()
					){
      out.write("\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"마감\" class=\"meetingViewBtn\" id=\"deadline\"/>\r\n");
      out.write("\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"신청\" class=\"meetingViewBtn\" id=\"submit\" onclick=\"apply();\"/>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
if(loginMember!=null && (loginMember.getMemberId().equals(m.getWriter())||loginMember.getMemberRole().equals(MemberService.ADMIN_ROLE))) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"updateDeleteWrapper\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"수정\"  onclick=\"updatee();\" />\r\n");
      out.write("\t\t<input type=\"button\" value=\"삭제\"  onclick=\"deletee();\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction cancel(){\r\n");
      out.write("\t\t\t//취소버튼을 눌렀을때 모임 생성자이면 취소가 안되고 삭제를 안내해야함\r\n");
      out.write("\t\t\tif(");
      out.print(loginMember!=null && loginMember.getMemberId().equals(m.getWriter()));
      out.write("){\r\n");
      out.write("\t\t\t\talert(\"모임 주최자는 취소가 불가능 합니다.\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(confirm(\"모임참여를 취소하시겠습니까?\")){\r\n");
      out.write("\t\t\t\t$(\"#meetingViewFrm\").attr(\"action\",\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingCancel\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction apply(){\r\n");
      out.write("\t\t\t//신청 버튼 눌렀을때 로그인 안되어있으면 신청이 안되고 로그인 유도\r\n");
      out.write("\t\t\tif(");
      out.print(loginMember==null);
      out.write("){\r\n");
      out.write("\t\t\t\tloginAlert();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(confirm(\"모임에 참여 하시겠습니까?\")){\r\n");
      out.write("\t\t\t\t$(\"#meetingViewFrm\").attr(\"action\",\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingApply\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction loginAlert(){\r\n");
      out.write("\t\t\talert(\"로그인후 이용 하실수 있습니다.\");\r\n");
      out.write("\t\t\t$(\"#login_button\").click();\r\n");
      out.write("\t\t\t$(\"#password_input\").focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction updatee(){\r\n");
      out.write("\t\t\t$(\"#meetingViewFrm\").attr(\"action\",\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingUpdate\").attr(\"method\",\"get\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction deletee(){\r\n");
      out.write("\t\t\tif(confirm(\"모임을 삭제 하시겠습니까?\")){\r\n");
      out.write("\t\t\t\t$(\"#meetingViewFrm\").attr(\"action\",\"");
      out.print(request.getContextPath());
      out.write("/meeting/meetingDelete\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
if(loginMember!=null && (list.contains(loginMember.getMemberId()) || loginMember.getMemberRole().equals(MemberService.ADMIN_ROLE))){ 
      out.write("\r\n");
      out.write("\t<div id=\"section2\">\r\n");
      out.write("      <div id=\"messagnerWrapper\">\r\n");
      out.write("        <div id=\"openMsg\">\r\n");
      out.write("          <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/chatImg.png\" alt=\"\" onclick=\"openn();\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <input type=\"button\" id=\"closee\" value=\"X　\" onclick=\"closee()\" />\r\n");
      out.write("        <div id=\"backimg\">\r\n");
      out.write("          <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/massanger.png\" alt=\"\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"abss\">\r\n");
      out.write("          <div id=\"contextArea\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"ajaxx\">\r\n");
      out.write("\t            <div class=\"notme\">\r\n");
      out.write("\t              <p class=\"chatwriter\">운영자</p>\r\n");
      out.write("\t              <div class=\"chatNotMe\">\r\n");
      out.write("\t                <span>\r\n");
      out.write("\t                  \t\t대화를 시작해주세요!!\r\n");
      out.write("\t                </span>\r\n");
      out.write("\t              </div>\r\n");
      out.write("\t              <div style=\"clear: both\"></div>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div id=\"inputArea\" class=\"msgFrm\">\r\n");
      out.write("              <input type=\"text\" name=\"msgInput\" id=\"msgInput\" onkeyup=\"if(window.event.keyCode==13){inputSubmit()}\" />\r\n");
      out.write("              <input type=\"button\" value=\"전송\" onclick=\"inputSubmit();\" />\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("  <script>\r\n");
      out.write("  ");
if(loginMember!=null && (list.contains(loginMember.getMemberId()) || loginMember.getMemberRole().equals(MemberService.ADMIN_ROLE))){ 
      out.write("\r\n");
      out.write("  \tvar chat='';\r\n");
      out.write("  \r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("    \t//마지막 대화상자가 표시되게 스크롤 맨밑으로\r\n");
      out.write("    \tajaxx();\r\n");
      out.write("    \tsetInterval(function () {\r\n");
      out.write("            ajaxx();\r\n");
      out.write("          }, 1000);\r\n");
      out.write("    });\r\n");
      out.write("    function inputSubmit(){\r\n");
      out.write("    \tif(confirm(\"메시지를 전송 하시겠습니까?\")){\r\n");
      out.write("    \t\t$.ajax({\r\n");
      out.write("    \t\t\turl:\"");
      out.print( request.getContextPath());
      out.write("/meeting/chat\",\r\n");
      out.write("    \t\t\tmethod:\"post\",\r\n");
      out.write("    \t\t\tdata:{\r\n");
      out.write("    \t\t\t\tno:");
      out.print(m.getMeetingNo());
      out.write(",\r\n");
      out.write("    \t\t\t\tcontents:$(\"#msgInput\").val(),\r\n");
      out.write("    \t\t\t\twriter:'");
      out.print(loginMember.getMemberId());
      out.write("'\r\n");
      out.write("    \t\t\t},\r\n");
      out.write("    \t\t\tsuccess:function(data){\r\n");
      out.write("    \t\t\t\t//실패시 F, 성공시 T\r\n");
      out.write("    \t\t\t\t$(\"#msgInput\").val(\"\");\r\n");
      out.write("    \t\t\t\tajaxx();\r\n");
      out.write("    \t\t\t},\r\n");
      out.write("    \t\t\terror:function(xhr, status, error){\r\n");
      out.write("    \t\t\t\tconsole.log(xhr, status, error);\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t}\r\n");
      out.write("    }\r\n");
      out.write("    function ajaxx(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print( request.getContextPath());
      out.write("/meeting/chat\",\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\tno:");
      out.print(m.getMeetingNo());
      out.write(",\r\n");
      out.write("\t\t\t\tlogin:'");
      out.print(loginMember.getMemberId());
      out.write("'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(chat!=data){\r\n");
      out.write("\t\t\t\t\t$(\"#ajaxx\").html(data);\r\n");
      out.write("\t\t    \t\tsettingChat();\r\n");
      out.write("\t\t    \t\tchat=data;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(xhr, status, error){\r\n");
      out.write("\t\t\t\tconsole.log(xhr, status, error);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});    \t\r\n");
      out.write("    }\r\n");
      out.write("    function settingChat(){\r\n");
      out.write("    \t$(\"#contextArea\").scrollTop($(\"#contextArea\")[0].scrollHeight);\r\n");
      out.write("    }\r\n");
      out.write("    function closee() {\r\n");
      out.write("    \t//메신저 닫기\r\n");
      out.write("      $(\"#section2\").attr(\"style\", \"transform:translateY(0px);\");\r\n");
      out.write("      $(\"#openMsg\").attr(\"style\", \"visibility: visible;\");\r\n");
      out.write("    }\r\n");
      out.write("    function openn() {\r\n");
      out.write("    \t//메신저 열기\r\n");
      out.write("      $(\"#section2\").attr(\"style\", \"transform:translateY(-500px);\");\r\n");
      out.write("      $(\"#openMsg\").attr(\"style\", \"visibility: hidden;\");\r\n");
      out.write("    }\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("  </script>\r\n");
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
      out.write("/claim/claimEnroll\">문의하기 <i class=\"fas fa-external-link-alt\"></i></a>\r\n");
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
