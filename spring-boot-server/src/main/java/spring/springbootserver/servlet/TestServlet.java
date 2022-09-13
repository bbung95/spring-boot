package spring.springbootserver.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface TestServlet {

    public void excute(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
