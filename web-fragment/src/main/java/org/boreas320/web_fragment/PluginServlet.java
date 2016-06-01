package org.boreas320.web_fragment;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by shuai.xiang@renren-inc.com on 16/6/2.
 */
public class PluginServlet extends HttpServlet {


    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();
        writer.println("Im fragment");
        writer.flush();
        writer.close();
    }


}
