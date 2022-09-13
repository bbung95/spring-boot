package spring.springbootserver.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class IndexServlet implements TestServlet {

    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        writer.println("<h1>index</h1>");
        writer.println("<div><a href=\"/hello\">hello</a></div>");
    }

}
