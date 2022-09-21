package spring.springbootserver.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class TestServlet {

    private String path;

    public abstract void excute(HttpServletRequest request, HttpServletResponse response) throws IOException;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
