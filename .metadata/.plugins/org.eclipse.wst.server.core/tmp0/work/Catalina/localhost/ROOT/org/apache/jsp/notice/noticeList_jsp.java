/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2023-12-13 03:48:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class noticeList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/include/gym_footer.jsp", Long.valueOf(1701408962000L));
    _jspx_dependants.put("/include/gym_header.jsp", Long.valueOf(1702437700000L));
    _jspx_dependants.put("/common/bootstrap_common.jsp", Long.valueOf(1701407588000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

//noticeList_jsp.java -> noticeList_jsp.class
	//서블릿(FrontMVC)을 경유[NoticeController-> NoticeLogic]하고 
	//select한 결과를 돌려(List<Map>) 받아서 request객체에 담아 두었다
	//                                                    req.setAttribute("xList", nList);
	int size = 0;//전체 레코드 수
	List<Map<String,Object>> nList = (List)request.getAttribute("nList");
	if(nList !=null){
		size = nList.size();
	}
	out.print(size);
	//테스트 링크
	//http://localhost:8000/notice/noticeList.gd - FrontMVC경유하는 경우
	//http://localhost:8000/notice/noticeList.jsp - FrontMVC경유하지 않는다.

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>공지사항{webapp}</title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"> \r\n");
      out.write("<script src=\"	https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>");
      out.write("\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"/css/notice.css\">\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    	function searchEnter(){\r\n");
      out.write("    		console.log('searchEnter')\r\n");
      out.write("    	}\r\n");
      out.write("		\r\n");
      out.write("		function noticeSearch(){\r\n");
      out.write("			console.log('noticeSearch');\r\n");
      out.write("			const gubun = document.querySelector(\"#gubun\").value;\r\n");
      out.write("			const keyword = document.querySelector(\"#keyword\").value;\r\n");
      out.write("			console.log(`");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gubun}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`);\r\n");
      out.write("			location.href=\"/notice/noticeList.gd?gubun=\"+gubun+\"&keyword=\"+keyword;\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <!-- 공지사항 목록 처리할 코드 작성해 보기 -->\r\n");
      out.write("	<!-- header start -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-light navbar-light\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"\">여기내GYM</a>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\">\r\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">로그인</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("        <!-- \r\n");
      out.write("        확장자가 jsp이면 서블릿을 경유하지 않는다. - 목록에 보여줄 데이터가 없다?\r\n");
      out.write("        조회버튼 -> /notice/noticeList.gd요청하자 -  오라클 서버를 경유함\r\n");
      out.write("        확장자가 .gd이면 오라클 서버를 경유하니까 조회결과를 쥐고 있다.\r\n");
      out.write("        쥔다 - request.setAttribute() - 화면 출력하기\r\n");
      out.write("         -->\r\n");
      out.write("          <a class=\"nav-link active\" href=\"/notice/noticeList.gd\">공지사항</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("           <a class=\"nav-link\" href=\"/board/boardList.jsp\">게시판</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">회원관리</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">QnA게시판</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<!-- header end -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"page-header\">\r\n");
      out.write("			<h2>공지사항 <small>공지목록</small></h2>\r\n");
      out.write("			<hr />\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- 검색기 시작 -->\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-3\">\r\n");
      out.write("		    	<select id=\"gubun\" class=\"form-select\" aria-label=\"분류선택\">\r\n");
      out.write("		      		<option value=\"none\">분류선택</option>\r\n");
      out.write("		      		<option value=\"n_title\">제목</option>\r\n");
      out.write("		      		<option value=\"n_writer\">작성자</option>\r\n");
      out.write("		      		<option value=\"n_content\">내용</option>\r\n");
      out.write("		    	</select>			\r\n");
      out.write("		  	</div>\r\n");
      out.write("			<div class=\"col-6\">\r\n");
      out.write("		 		<input type=\"text\" id=\"keyword\" class=\"form-control\" placeholder=\"검색어를 입력하세요\" \r\n");
      out.write("		           aria-label=\"검색어를 입력하세요\" aria-describedby=\"btn_search\" onkeyup=\"searchEnter()\"/>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-3\">\r\n");
      out.write("		 		<button id=\"btn_search\" class=\"btn btn-danger\" onClick=\"noticeSearch()\">검색</button>\r\n");
      out.write("		 	</div>\r\n");
      out.write("		</div>		\r\n");
      out.write("		<!-- 검색기 끝 -->\r\n");
      out.write("		\r\n");
      out.write("		<!-- 회원목록 시작 -->\r\n");
      out.write("		<div class='notice-list'>\r\n");
      out.write("			<table class=\"table table-hover\">\r\n");
      out.write("		    	<thead>\r\n");
      out.write("		      		<tr>\r\n");
      out.write("		        		<th width=\"10%\">#</th>\r\n");
      out.write("		        		<th width=\"50%\">제목</th>\r\n");
      out.write("		        		<th width=\"20%\">작성자</th>\r\n");
      out.write("		      		</tr>\r\n");
      out.write("		    	</thead>\r\n");
      out.write("		    	<tbody>	      	\r\n");

	//스크립틀릿 - 지변이다, 메소드 선언불가, 생성자 선언불가, 실행문
	//n건을 조회하는 경우이지만 resultType에는 map이나 vo패턴을 주는게 맞다
	//주의사항 - 자동으로 키값을 생성함 - 디폴트가 대문자이다
	//myBatis연동시 resultType=map{한행}으로 줌 -> selectList("noticeList", pMap)
	for(int i=0;i<size;i++){
		Map<String,Object> rmap = nList.get(i);

      out.write("					\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>");
      out.print(rmap.get("N_NO") );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(rmap.get("N_TITLE") );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(rmap.get("N_WRITER") );
      out.write("</td>\r\n");
      out.write("					</tr>					\r\n");

	}

      out.write("\r\n");
      out.write("		    	</tbody>\r\n");
      out.write("			</table> \r\n");
      out.write("    \r\n");
      out.write("<!-- [[ 페이징 처리  구간  ]] -->\r\n");
      out.write("			<div style=\"display:flex; justify-content:center;\">\r\n");
      out.write("				<ul class=\"pagination\">[1] [2] [3]</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("<!-- [[ 페이징 처리  구간  ]] -->		\r\n");
      out.write("	  \r\n");
      out.write("		  	<div class='notice-footer'>\r\n");
      out.write("		    	<button class=\"btn btn-warning\" onclick=\"noticeList()\">\r\n");
      out.write("		      		전체조회\r\n");
      out.write("		    	</button>&nbsp; \r\n");
      out.write("			    <button type=\"button\" class=\"btn btn-success\" data-bs-toggle=\"modal\" data-bs-target=\"#noticeForm\">\r\n");
      out.write("			    글쓰기\r\n");
      out.write("			    </button>\r\n");
      out.write("		    </div>\r\n");
      out.write("		</div>		\r\n");
      out.write("		<!-- 회원목록   끝  -->		\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- body end       -->\r\n");
      out.write("	<!-- footer start -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write(" <div class=\"navbar navbar-expand-sm bg-dark justify-content-center\">\r\n");
      out.write("    <a class=\"navbar-brand\"  style=\"color:white\"  href=\"#\">여기내GYM Copyright &copy; 2023</a>\r\n");
      out.write(" </div>");
      out.write("\r\n");
      out.write("	<!-- footer end    -->	\r\n");
      out.write("	<!-- ========================== [[ 공지사항 Modal ]] ========================== -->\r\n");
      out.write("	<div class=\"modal\" id=\"noticeForm\">\r\n");
      out.write("	  <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("	    <div class=\"modal-content\">\r\n");
      out.write("	\r\n");
      out.write("	      <!-- Modal Header -->\r\n");
      out.write("	      <div class=\"modal-header\">\r\n");
      out.write("	        <h4 class=\"modal-title\">공지사항</h4>\r\n");
      out.write("	        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\r\n");
      out.write("	      </div>\r\n");
      out.write("	      <!-- Modal body -->\r\n");
      out.write("	      <div class=\"modal-body\">\r\n");
      out.write("	      	<form id=\"f_notice\" method=\"get\" action=\"./noticeInsert.pj1\">\r\n");
      out.write("	      	  <input type=\"hidden\" name=\"method\" value=\"memberInsert\">\r\n");
      out.write("	          <div class=\"form-floating mb-3 mt-3\">\r\n");
      out.write("	            <input type=\"text\"  class=\"form-control\" id=\"n_title\" name=\"n_title\" placeholder=\"Enter 제목\" />\r\n");
      out.write("	            <label for=\"n_title\">제목</label>\r\n");
      out.write("	          </div>	      	\r\n");
      out.write("	          <div class=\"form-floating mb-3 mt-3\">\r\n");
      out.write("	            <input type=\"text\"  class=\"form-control\" id=\"n_writer\" name=\"n_writer\" placeholder=\"Enter 작성자\" />\r\n");
      out.write("	            <label for=\"n_writer\">작성자</label>\r\n");
      out.write("	          </div>	      	\r\n");
      out.write("	          <div class=\"form-floating mb-3 mt-3\">\r\n");
      out.write("	            <textarea rows=\"5\" class=\"form-control h-25\" aria-label=\"With textarea\" id=\"n_content\" name=\"n_content\"></textarea>\r\n");
      out.write("	          </div>	      	\r\n");
      out.write("	      	</form>\r\n");
      out.write("	      </div>	\r\n");
      out.write("	      <div class=\"modal-footer\">\r\n");
      out.write("	        <input type=\"button\" class=\"btn btn-warning\" data-bs-dismiss=\"modal\" onclick=\"noticeInsert()\"  value=\"저장\">\r\n");
      out.write("	        <input type=\"button\" class=\"btn btn-danger\" data-bs-dismiss=\"modal\" value=\"닫기\">\r\n");
      out.write("	      </div>\r\n");
      out.write("	\r\n");
      out.write("	    </div>\r\n");
      out.write("	  </div>\r\n");
      out.write("	</div>\r\n");
      out.write("    <!-- ========================== [[ 공지사항 Modal ]] ========================== -->\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("<!-- \r\n");
      out.write("	M : margin -  외부여백\r\n");
      out.write("	P : padding  - 안쪽 여백\r\n");
      out.write("	\r\n");
      out.write("	t: top\r\n");
      out.write("	b: bottom\r\n");
      out.write("	l: left\r\n");
      out.write("	r:right\r\n");
      out.write("	x: x축 -> left, right\r\n");
      out.write("	y: y축 -> top, bottom\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	- 0, 1, 2, 3,4 5, auto\r\n");
      out.write("	1: .25 rem(font-size가 16px이면 4px)\r\n");
      out.write("	2. : 0.5\r\n");
      out.write("	3: 1rem\r\n");
      out.write("	4: 1.5rem\r\n");
      out.write("	5: 3rem\r\n");
      out.write(" -->\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
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