/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.98
 * Generated at: 2025-02-20 11:17:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrationform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/base.jsp", Long.valueOf(1739355004647L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1738835884460L));
    _jspx_dependants.put("jar:file:/C:/Users/patel/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title> Registration Page </title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css\" integrity=\"sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-image: url('https://img.freepik.com/free-photo/blur-field-texture_1160-907.jpg?t=st=1739258428~exp=1739262028~hmac=d21a3fc98454b1382dade84d4d6347f363fab0b462f516f381f1d62478075075&w=740');\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-attachment: fixed;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            background: rgba(255, 255, 255, 0.9);\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            max-width: 900px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("        .preview-container {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .preview-img {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("            display: none;\r\n");
      out.write("            border: 2px solid #ddd;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function previewImage(event) {\r\n");
      out.write("            var preview = document.getElementById('imagePreview');\r\n");
      out.write("            var file = event.target.files[0];\r\n");
      out.write("\r\n");
      out.write("            if (file) {\r\n");
      out.write("                var reader = new FileReader();\r\n");
      out.write("                reader.onload = function (e) {\r\n");
      out.write("                    preview.src = e.target.result;\r\n");
      out.write("                    preview.style.display = 'block';\r\n");
      out.write("                };\r\n");
      out.write("                reader.readAsDataURL(file);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2 class=\"text-center\" style=\"\r\n");
      out.write("            font-size: 2rem;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("            background: #007bff;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            letter-spacing: 1px;\r\n");
      out.write("            text-shadow: 2px 2px 4px rgba(0, 123, 255, 0.3);\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        \">\r\n");
      out.write("             Registration Form\r\n");
      out.write("        </h2>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"registerUser\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!-- Left Column -->\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label style=\"font-weight: bold;\">Mobile</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"mobile\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mobile}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label style=\"font-weight: bold;\">Name</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Enter name\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label style=\"font-weight: bold;\">Email</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Enter your Email\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                   <div class=\"form-group\">\r\n");
      out.write("                       <label style=\"font-weight: bold;\">Gender</label>\r\n");
      out.write("                       <div style=\"display: flex; gap: 30px; align-items: center; margin-top: 10px;\">\r\n");
      out.write("                           <div>\r\n");
      out.write("                               <input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" required>\r\n");
      out.write("                               <label for=\"male\" style=\"margin-left: 8px; font-size: 16px;\">Male</label>\r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div>\r\n");
      out.write("                               <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\">\r\n");
      out.write("                               <label for=\"female\" style=\"margin-left: 8px; font-size: 16px;\">Female</label>\r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div>\r\n");
      out.write("                               <input type=\"radio\" id=\"other\" name=\"gender\" value=\"other\">\r\n");
      out.write("                               <label for=\"other\" style=\"margin-left: 8px; font-size: 16px;\">Other</label>\r\n");
      out.write("                           </div>\r\n");
      out.write("                       </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Right Column -->\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label style=\"font-weight: bold;\">City</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"city\" placeholder=\"Enter your city\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label style=\"font-weight: bold;\">State</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"state\" placeholder=\"Enter your state\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label style=\"font-weight: bold;\">Zip Code</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"zipCode\" placeholder=\"Enter zip code\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Image Upload Section -->\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label style=\"font-weight: bold;\">Upload Profile Image</label>\r\n");
      out.write("                        <input type=\"file\" class=\"form-control\" name=\"pImage\" accept=\"image/*\" onchange=\"previewImage(event)\" required>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Image Preview -->\r\n");
      out.write("                        <div class=\"preview-container\">\r\n");
      out.write("                            <img id=\"imagePreview\" class=\"preview-img\" alt=\"Profile Preview\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success btn-block mt-3\" style=\"font-size: 1.2rem; font-weight: bold;\">\r\n");
      out.write("                Register\r\n");
      out.write("            </button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
