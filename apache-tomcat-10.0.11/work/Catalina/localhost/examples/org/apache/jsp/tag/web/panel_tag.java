/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.11
 * Generated at: 2021-09-23 12:28:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class panel_tag
    extends jakarta.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private jakarta.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(jakarta.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public jakarta.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String color;
  private java.lang.String bgcolor;
  private java.lang.String title;

  public java.lang.String getColor() {
    return this.color;
  }

  public void setColor(java.lang.String color) {
    this.color = color;
    jspContext.setAttribute("color", color);
  }

  public java.lang.String getBgcolor() {
    return this.bgcolor;
  }

  public void setBgcolor(java.lang.String bgcolor) {
    this.bgcolor = bgcolor;
    jspContext.setAttribute("bgcolor", bgcolor);
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
    jspContext.setAttribute("title", title);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(jakarta.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws jakarta.servlet.jsp.JspException, java.io.IOException {
    jakarta.servlet.jsp.PageContext _jspx_page_context = (jakarta.servlet.jsp.PageContext)jspContext;
    jakarta.servlet.http.HttpServletRequest request = (jakarta.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    jakarta.servlet.http.HttpServletResponse response = (jakarta.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    jakarta.servlet.http.HttpSession session = _jspx_page_context.getSession();
    jakarta.servlet.ServletContext application = _jspx_page_context.getServletContext();
    jakarta.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    jakarta.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(jakarta.servlet.jsp.JspContext.class,jspContext);
    if( getColor() != null ) 
      _jspx_page_context.setAttribute("color", getColor());
    if( getBgcolor() != null ) 
      _jspx_page_context.setAttribute("bgcolor", getBgcolor());
    if( getTitle() != null ) 
      _jspx_page_context.setAttribute("title", getTitle());

    try {
      out.write("<!--\r\n");
      out.write(" Licensed to the Apache Software Foundation (ASF) under one or more\r\n");
      out.write("  contributor license agreements.  See the NOTICE file distributed with\r\n");
      out.write("  this work for additional information regarding copyright ownership.\r\n");
      out.write("  The ASF licenses this file to You under the Apache License, Version 2.0\r\n");
      out.write("  (the \"License\"); you may not use this file except in compliance with\r\n");
      out.write("  the License.  You may obtain a copy of the License at\r\n");
      out.write("\r\n");
      out.write("      http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write("\r\n");
      out.write("  Unless required by applicable law or agreed to in writing, software\r\n");
      out.write("  distributed under the License is distributed on an \"AS IS\" BASIS,\r\n");
      out.write("  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\n");
      out.write("  See the License for the specific language governing permissions and\r\n");
      out.write("  limitations under the License.\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=\"1\" bgcolor=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("</b></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bgcolor}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\">\r\n");
      out.write("      ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(jakarta.servlet.jsp.JspContext.class,getJspContext());
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
    } catch( java.lang.Throwable t ) {
      if( t instanceof jakarta.servlet.jsp.SkipPageException )
          throw (jakarta.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof jakarta.servlet.jsp.JspException )
          throw (jakarta.servlet.jsp.JspException) t;
      throw new jakarta.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(jakarta.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}