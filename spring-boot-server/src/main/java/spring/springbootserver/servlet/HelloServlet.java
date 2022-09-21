package spring.springbootserver.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends TestServlet {

    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) throws IOException {


        setPath("forward:/forward.jsp");
    }

}
