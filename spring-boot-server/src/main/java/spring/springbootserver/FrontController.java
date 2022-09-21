package spring.springbootserver;

import spring.springbootserver.servlet.HelloServlet;
import spring.springbootserver.servlet.IndexServlet;
import spring.springbootserver.servlet.TestServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class FrontController extends HttpServlet {

    private final String templatePath = "templates/";

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        System.out.println("url = " + url);
        System.out.println("contextPath = " + contextPath);

        try{

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

            String[] path = testServlet.getPath().split(":/");

            if(path[0].equals("forward")){
                RequestDispatcher requestDispatcher = req.getRequestDispatcher(templatePath + path[1]);
                requestDispatcher.forward(req, resp);
            }else{
                resp.sendRedirect(path[1]);
            }

            System.out.println("requestDispatcher end");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}

