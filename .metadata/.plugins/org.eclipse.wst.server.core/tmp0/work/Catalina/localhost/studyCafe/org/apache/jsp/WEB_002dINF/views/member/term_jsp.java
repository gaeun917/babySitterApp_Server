/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-09-03 07:12:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class term_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/Users/gaeunlee/Documents/baby/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/studyCafe/WEB-INF/lib/spring-webmvc-4.2.6.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1462487332000L));
    _jspx_dependants.put("jar:file:/Users/gaeunlee/Documents/baby/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/studyCafe/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.2.6.RELEASE.jar", Long.valueOf(1463178289000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1463059995000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\r\n");
      out.write("\t<title>Terms of Use and Privacy Policy</title>\r\n");
      out.write("<!-- \t<link rel=\"Stylesheet\" href=\"/studyCafe/resources/styles/default.css\" />\r\n");
      out.write("\t<link rel=\"Stylesheet\" href=\"/studyCafe/resources/styles/input.css\" /> -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("\t<link rel=\"Stylesheet\" href=\"/studyCafe/resources/bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("\t<link rel=\"Stylesheet\" href=\"/studyCafe/resources/bootstrap/js/bootstrap.min.js\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("// 약관 동의에 체크 해야 넘어가는 기능 \r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar accepted = false;\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t$('#chkAccept').on('click', function(event) {\r\n");
      out.write("\t\t\t\taccepted = !accepted;\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('#btnNext').on('click', function(event) {\t\t\t\t\r\n");
      out.write("\t\t\t\t//if (accepted) {\r\n");
      out.write("\t\t\t\tif($('#chkAccept').is(':checked')) {\r\n");
      out.write("\t\t\t\t\tlocation.href ='register.action';\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\talert('약관에 동의하지 않았습니다.')\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"pageContainer\">\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"inputcontent\">\r\n");
      out.write("\t\t\t<br /><br />\r\n");
      out.write("\t\t    <div class=\"jumbotron\">\r\n");
      out.write("\t\t        <div class=\"container\">\r\n");
      out.write("\t\t        <h2>Terms of Use and Privacy Policy</h2>\r\n");
      out.write("\t\t         <br/><br/>\r\n");
      out.write("\t\t        <!-- term에 동의하면 register.action으로 넘어감  -->\r\n");
      out.write("\t\t        <form action=\"register.action\" method=\"GET\"/><!-- 상대경로표시 -->\r\n");
      out.write("\r\n");
      out.write("\t\t        \t <p> 약관 내용\r\n");
      out.write("\t\t        \t Terms of Use and Privacy PolicyTerms of Use and Privacy \r\n");
      out.write("\t\t        \t Terms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy Policy\r\n");
      out.write("\t\t        \t Terms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy Policy\r\n");
      out.write("\t\t        \t Terms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy Policy\r\n");
      out.write("\t\t        \t Terms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy Policy\r\n");
      out.write("\t\t        \t Terms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy PolicyTerms of Use and Privacy Policy\r\n");
      out.write("\t\t        \t PolicyTerms of Use and Privacy Policy\r\n");
      out.write("\t\t        \t \t\t\t\t\t </p>\r\n");
      out.write("\t\t         <br/><br/>\r\n");
      out.write("\t\t\t    <div class=\"chkterm\" align=\"center\">\r\n");
      out.write("\t\t\t        <label class=\"radio-inline\">\r\n");
      out.write("\t\t\t        \t<input type=\"checkbox\" id=\"chkAccept\"/>약관에 동의함\r\n");
      out.write("\t\t\t        </label>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        <label class=\"radio-inline\">\r\n");
      out.write("\t\t\t            <input type=\"checkbox\" disabled/>약관에 동의하지 않음  \r\n");
      out.write("\t\t\t        </label>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    <br/><br/><br/>    \r\n");
      out.write("\t\t\t    <div class=\"button\" align=\"center\">\r\n");
      out.write("\t\t\t        <button type=\"button\" id=\"btnNext\" class=\"btn btn-info center\" value=\"등록\" >등록</button>\r\n");
      out.write("\t\t\t       <button type=\"button\" class=\"btn btn-info center\" value=\"취소\">취소</button>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        \t<!-- location.href='path' : path로 이동하는 javascript 명령 -->\r\n");
      out.write("\t\t        </div>\t\t  \r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>   \t\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent(null);
    // /WEB-INF/views/member/term.jsp(45,2) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("/WEB-INF/views/include/header2.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
    }
    return false;
  }
}
