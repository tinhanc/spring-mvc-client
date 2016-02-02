package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Omise TMN Wallet</title>\n");
      out.write("\n");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bootstrapCss}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coreCss}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">MEMOWallet</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container centered\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12 col-md-4\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\">\n");
      out.write("                        Payment Details\n");
      out.write("                    </h3>\n");
      out.write("                    <div class=\"checkbox pull-right\">\n");
      out.write("                        <label>\n");
      out.write("                            <input type=\"checkbox\" />\n");
      out.write("                            Remember\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form role=\"form\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"cardNumber\">\n");
      out.write("                            CARD NUMBER</label>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"cardNumber\" maxlength=\"16\" placeholder=\"Valid Card Number\"\n");
      out.write("                                required autofocus />\n");
      out.write("                            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-lock\"></span></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                      <!-- Name -->\n");
      out.write("          <div class=\"control-group\">\n");
      out.write("            <label class=\"control-label\"  for=\"username\">CARD HOLDER'S NAME</label>\n");
      out.write("            <div class=\"controls\">\n");
      out.write("                 <input type=\"text\" class=\"form-control\" id=\"cardNumber\" placeholder=\"\"\n");
      out.write("                                required  />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-7 col-md-7\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"expityMonth\">\n");
      out.write("                                    EXPIRY DATE</label>\n");
      out.write("                                <div class=\"col-xs-6 col-lg-6 pl-ziro\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"expityMonth\" placeholder=\"MM\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-6 col-lg-6 pl-ziro\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"expityYear\" placeholder=\"YY\" required /></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-5 col-md-5 pull-right\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"cvCode\">\n");
      out.write("                                    CVV2 CODE</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"cvCode\" placeholder=\"CVV2\" required />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                <li class=\"active\"><a href=\"#\"><span class=\"badge pull-right\"><span class=\"glyphicon glyphicon-usd\"></span>4200</span> Invoice Total</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <br/>\n");
      out.write("            <a href=\"#\" class=\"btn btn-success btn-lg btn-block\" id=\"learn-more\" role=\"button\">Pay</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.omise.co/omise.js\"></script>\n");
      out.write("<script>\n");
      out.write("  Omise.setPublicKey(\"pkey_test_515sxqadnwjpwawmus6\");\n");
      out.write("\n");
      out.write("  $(document).ready(function(){\n");
      out.write("      $(\"#learn-more\").click(function(){\n");
      out.write("        var card = {\n");
      out.write("          \"name\": $('#cardNumber').val(),\n");
      out.write("          \"number\": $('#cardNumber').val(),\n");
      out.write("          \"expiration_month\": $('#expityMonth').val(),\n");
      out.write("          \"expiration_year\": $('#expityYear').val(),\n");
      out.write("          \"security_code\": $('#cvCode').val()\n");
      out.write("        };\n");
      out.write("\n");
      out.write("\n");
      out.write("        Omise.createToken(\"card\", card, function (statusCode, response) {\n");
      out.write("          if (statusCode == 200) {\n");
      out.write("           \t\t console.log(statusCode);\n");
      out.write("\t\t\t\t console.log(response);\n");
      out.write("          } else {\n");
      out.write("\t\t\t\t console.log(response);\n");
      out.write("\t\t\t\t console.log(statusCode);\n");
      out.write("          };\n");
      out.write("        });\n");
      out.write("\n");
      out.write("      });\n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("/resources/core/css/hello.css");
    _jspx_th_spring_url_0.setVar("coreCss");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setValue("/resources/core/css/bootstrap.min.css");
    _jspx_th_spring_url_1.setVar("bootstrapCss");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_var_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }
}
