package in.raj.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig con = getServletConfig();
        String msg = con.getInitParameter("msg");

        ServletContext context = req.getServletContext();
        String website = context.getInitParameter("website");

        PrintWriter writer = resp.getWriter();
        writer.append("First Servlet" + msg + " ---  " + website);
    }
}
