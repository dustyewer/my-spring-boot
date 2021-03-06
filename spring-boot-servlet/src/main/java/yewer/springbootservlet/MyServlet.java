package yewer.springbootservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "myservlet", urlPatterns = "/myservlet")
public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
        rsp.getWriter().write("hello ");
    }

}
