package spring.springbootserver.server;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import spring.springbootserver.FrontController;

public class TomcatServer {

    public static void servetStart() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);

        Context context = tomcat.addContext("/", "/");

        tomcat.addServlet("/", "frontController", new FrontController());
        context.addServletMappingDecoded("/", "frontController");

        tomcat.start();
        tomcat.getConnector();
        tomcat.getServer().await();
    }

}
