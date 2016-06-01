package servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shuai.xiang@renren-inc.com on 5/20/16.
 */
public class HahahaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hahaha", "test");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/hello.jsp");
        requestDispatcher.forward(req, resp);
    }
}
