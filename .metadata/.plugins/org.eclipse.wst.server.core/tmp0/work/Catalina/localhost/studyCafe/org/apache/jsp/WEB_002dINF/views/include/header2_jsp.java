/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-09-03 07:12:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.studycafe.model.dto.Member;

public final class header2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/gaeunlee/Documents/baby/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/studyCafe/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1463059995000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.studycafe.model.dto.Member");
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("  \r\n");
      out.write("  <!-- 헤더에서는 제이쿼리 부트스트랩을 쓰지 않음  -->\r\n");
      out.write("<!-- \r\n");
      out.write("<link href=\"/studyCafe/resources/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/studyCafe/resources/bootstrap/js/bootstrap.min.js\"></script> -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\t$('#mystudyroom').on('click', function(event) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/studyCafe/account/pageList.action',\r\n");
      out.write("\t\t\ttype : 'get',\r\n");
      out.write("\t\t\tcontentType: \"application/x-www-form-urlencoded; charset=UTF-8\", \r\n");
      out.write("\t\t\tdata : {},\r\n");
      out.write("\t\t\tsuccess : function(data, status, xhr) {\r\n");
      out.write("\t\t\t\tshowResult(data);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("\tfunction showResult(data) {\r\n");
      out.write("\t\tif (data.length == 0)\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t$('#dspan').html(data);\r\n");
      out.write("\t}\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("<body data-spy=\"scroll\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 헤더 사용 설명서!!! 헤더는 반드시 <BODY> \"바로 밑에\"   -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  -----------------------HEADER STARTS--------------------------------- -->\r\n");
      out.write("<!--  -----------------------HEADER STARTS--------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<header id=\"header\" >\r\n");
      out.write("\t\t  <nav class=\"navbar navbar-default\"  role=\"navigation\">\r\n");
      out.write("\t\t    <div class=\"a\">\r\n");
      out.write("\t\t      <div class=\"navbar-header\">\r\n");
      out.write("\t\t      <!-- <a><img class=\"icon\" style=\"margin-left: 30px; margin-top:10px; border: medium;\" src=\"/studyCafe/resources/image/Bus.png\" height=\"40px\" width=\"40px\" alt=\"Icon\"></a> -->\r\n");
      out.write("\t\t         <a class=\"navbar-brand\" href=\"/studyCafe/home.action\" style=\"font-weight: bolder; font-float:none; font-size: 150%;\">&nbsp;&nbsp;스터디 카페</a>\r\n");
      out.write("\t\t        </div>       \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t\t$('#mystudyroom').on('click', function(event) {\r\n");
      out.write("\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\turl : '/studyCafe/account/pageList.action',\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'get',\r\n");
      out.write("\t\t\t\t\t\t\tcontentType: \"application/x-www-form-urlencoded; charset=UTF-8\", \r\n");
      out.write("\t\t\t\t\t\t\tdata : {},\r\n");
      out.write("\t\t\t\t\t\t\tsuccess : function(data, status, xhr) {\r\n");
      out.write("\t\t\t\t\t\t\t\tshowResult(data);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\tfunction showResult(data) {\r\n");
      out.write("\t\t\t\t\t\tif (data.length == 0)\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t$('#dspan').html(data);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t        <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t          <li><a href=\"/studyCafe/board/write.action\"><span class=\"glyphicon glyphicon-pushpin\"></span>&nbsp;&nbsp;스터디 등록</a></li>\r\n");
      out.write("\t\t          <li><a href=\"/studyCafe/board/list.action\"><span class=\"glyphicon glyphicon-tree-deciduous\"></span>&nbsp;&nbsp;스터디 참여</a></li>\r\n");
      out.write("\t\t          <li class=\"dropdown\">\r\n");
      out.write("\t\t          <a id=\"mystudyroom\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"javascript:window.open('/studyCafe/page/board/list.action?menuno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagemenu.menuNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ userpage.getName() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("', 'width=1000, height=1200, toolbar=no, menubar=no, scrollbars=no, resizable=yes');\">\r\n");
      out.write("\t\t\t      <span class=\"glyphicon glyphicon-lamp\"></span>&nbsp;&nbsp;내 공부방 가기<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t      <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t              <span id=\"dspan\"><li>등록된 방이 없습니다.<li></span>\r\n");
      out.write("            \t  </ul>\r\n");
      out.write("\t\t\t      </li>\r\n");
      out.write("\t\t          <!-- <li><a href=\"/studyCafe/calendar/list.action\">캘린더</a></li> -->\r\n");
      out.write("\t\t          <li><a href=\"#\"></a></li>\r\n");
      out.write("\t\t          ");
      out.write("\r\n");
      out.write("\t\t\t\t\t <li><a href=\"#\"></a></li>\r\n");
      out.write("     \t\t      </ul>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t\t$('#pettype').css('display', \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empty loginuser ? 'none' : 'block' }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\");\r\n");
      out.write("\t\t\t\t\t$('#btnLogin1').css('display', \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ not empty loginuser ? 'none' : 'block' }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\");\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t    </div><!-- container -->\r\n");
      out.write("\t\t  </nav>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\r\n");
      out.write("<!--  -----------------------HEADER ENDS--------------------------------- -->\r\n");
      out.write("<!--  -----------------------HEADER ENDS--------------------------------- -->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
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
