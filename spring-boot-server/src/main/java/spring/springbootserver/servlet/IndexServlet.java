package spring.springbootserver.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class IndexServlet extends TestServlet {

    @Override
    public void excute(HttpServletRequest request, HttpServletResponse response) throws IOException {


        setPath("forward:/index.jsp");
    }

}
