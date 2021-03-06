package yewer.springbootservletreg;

import java.io.BufferedOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedOutputStream bis = new BufferedOutputStream(resp.getOutputStream());
        bis.write("<h1>hwllo word</h1>".getBytes());
        bis.flush();
        bis.close();
    }

}
