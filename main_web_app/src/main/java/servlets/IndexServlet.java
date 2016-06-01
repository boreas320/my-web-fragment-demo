package servlets;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by shuai.xiang@renren-inc.com on 5/20/16.
 */
public class IndexServlet implements Servlet {
    public void init(ServletConfig config) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        res.getWriter().print("Hello World!");
        res.getWriter().flush();


    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
