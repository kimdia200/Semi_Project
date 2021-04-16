/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-04-16 11:40:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.model.vo.BoardComment;
import java.util.List;
import member.model.service.MemberService;
import board.model.vo.Board;
import member.model.vo.Member;

public final class adminBoardView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1618572477978L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1618244998397L));
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
    _jspx_imports_classes.add("board.model.vo.BoardComment");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("board.model.vo.Board");
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
      out.write("    \r\n");
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/css/index.css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/Logo.png\" id=\"Logo\"/>\r\n");
      out.write("\t\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t");

				if (loginMember == null) {
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"로그인\" id=\"login_button\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"회원가입\" id=\"signup_button\">\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<table id=\"login\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(loginMember.getName());
      out.write("님, 안녕하세요.</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"button\" value=\"mypage\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/memberView';\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"logout\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/logout';\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"loginEnd\"></div>\r\n");
      out.write("\t\t<!-- Loginframe 평소에 hide -->\r\n");
      out.write("\t\t<div id=\"login_frame_div\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/city1.png\" id=\"login_image\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 로그인 포지션-->\r\n");
      out.write("\t\t\t<form id=\"login_form\"\r\n");
      out.write("\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/member/login\" method=\"POST\">\r\n");
      out.write("\t\t\t\t<div id=\"login_div\">\r\n");
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
      out.write("\t\t\t\t\t\t\t<label for=\"saveid\">로그인 유지하기</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span id=\"find_span\" onclick=\"find_span()\">아이디+비밀번호 찾기</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t<div class=\"enroll_div\" id=\"enroll_div\" onclick=\"enroll_span()\" style=\"clear:both\";>\r\n");
      out.write("\t\t\t\t\t\t미플 회원가입하기\r\n");
      out.write("\t\t\t\t\t\t<!-- 회원이 아니신가요? <span id=\"enroll_span\" onclick=\"enroll_span()\">회원가입</span> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<ol>\r\n");
      out.write("\t\t\t<li><a href=\"\">전체</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">음악</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">게임</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">운동</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">요리</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">독서</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">재테크</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">자동차</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/boardList\">자유게시판</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/board/adminBoardList\">공지사항</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"\">회원관리</a></li>\r\n");
      out.write("\t\t</ol>\r\n");
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
      out.write("\t\t\t$(signup_button).click(function(){\r\n");
      out.write("\t\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/member/enroll\";\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(login_button).click(function() {\r\n");
      out.write("\t\t\t\tvar top = screen.availHeight / 2 - 200;\r\n");
      out.write("\t\t\t\t$(\"#login_frame_div\").attr('style', 'display:flex; top:'+top+'px;');\r\n");
      out.write("\t\t\t\tif(id_input.value.length==0){\r\n");
      out.write("\t\t\t\t\t$('#id_input').focus();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$('#password_input').focus();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(login_closeBtn).click(function(){\r\n");
      out.write("\t\t\t\t$(\"#login_frame_div\").attr('style', 'display:none;');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<section>");
      out.write('\r');
      out.write('\n');
 
	Board b = (Board)request.getAttribute("board");
	Board prev = (Board)request.getAttribute("prev");
	Board next = (Board)request.getAttribute("next");
	int cPage = (int)request.getAttribute("cPage");
	boolean editable = loginMember != null && (loginMember.getMemberId().equals(b.getWriter()) || loginMember.getMemberRole().equals(MemberService.ADMIN_ROLE));

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath() );
      out.write("/css/board.css\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<h2>공지사항</h2>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t<!-- 게시글 번호, 제목 -->\r\n");
      out.write("\t<div id=\"boardViewDesc\">\r\n");
      out.write("\t\t<div><h4>");
      out.print(b.getBoardNo() );
      out.write('.');
      out.write(' ');
      out.print(b.getTitle() );
      out.write("</h4></div>\r\n");
      out.write("\t\t<hr />\r\n");
      out.write("\t\t<div><span id=\"boardViewWriter\">");
      out.print(b.getWriter() );
      out.write("</span> <br> <span id=\"boardViewRegDate\">");
      out.print(b.getRegDate() );
      out.write("</span></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 게시글 내용 -->\r\n");
      out.write("\t<div id=\"boardViewContent\">\r\n");
      out.write("\t\t");
      out.print(b.getContent() );
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t");
 if(editable){ 
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"수정\" id=\"boardViewBtnUpdate\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/board/adminBoardUpdate?boardNo=");
      out.print(b.getBoardNo());
      out.write("&cPage=");
      out.print(cPage);
      out.write("'\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"삭제\" id=\"boardViewBtnDelete\" onclick=\"deleteBoard();\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t<form action=\"");
      out.print( request.getContextPath());
      out.write("/board/adminBoardDelete\" id = \"boardDelFrm\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"no\" value=\"");
      out.print( b.getBoardNo());
      out.write("\"/>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"boardViewNav\">\r\n");
      out.write("\t\t");
 if(prev.getBoardNo()!=0){ 
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( request.getContextPath());
      out.write("/board/adminBoardView?no=");
      out.print(prev.getBoardNo());
      out.write("&cPage=");
      out.print(cPage);
      out.write("\">[이전 게시글] <strong>");
      out.print(prev.getTitle() );
      out.write("</strong></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t");
 if(next.getBoardNo()!=0){ 
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( request.getContextPath());
      out.write("/board/adminBoardView?no=");
      out.print(next.getBoardNo());
      out.write("&cPage=");
      out.print(cPage);
      out.write("\">[다음 게시글] <strong>");
      out.print(next.getTitle() );
      out.write("</strong>\tx</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<img id=\"boardViewImg\" src=\"");
      out.print(request.getContextPath() );
      out.write("/images/List_icon.png\" onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/board/adminBoardList?cPage=");
      out.print(cPage );
      out.write("'\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t//게시물 삭제\r\n");
      out.write("\t");
 if(editable){
      out.write("\r\n");
      out.write("\t\tfunction deleteBoard(){\r\n");
      out.write("\t\t\tif(confirm(\"정말 게시글을 삭제 하시겠습니까?\")){\r\n");
      out.write("\t\t\t\t$(\"#boardDelFrm\").submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("    <footer>footer</footer>\r\n");
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
