package spring.springbootserver;

import spring.springbootserver.servlet.HelloServlet;
import spring.springbootserver.servlet.IndexServlet;
import spring.springbootserver.servlet.TestServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        String contextPath = req.getContextPath();

        try{
            System.out.println("url = " + url);
            System.out.println("contextPath = " + contextPath);

            TestServlet testServlet = null;

            if(url.equals("/hello")){
                testServlet = new HelloServlet();
            }else if(url.equals("/")){
                testServlet = new IndexServlet();
            }

            try {
                testServlet.excute(req, resp);
            }catch (NullPointerException e){
                resp.sendRedirect("/");
            }

            System.out.println("requestDispatcher end");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}

