package spring.springbootserver.server;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import spring.springbootserver.FrontController;

import java.io.File;

public class TomcatServer {

    public static void servetStart() throws LifecycleException {

        String webappDir = "src/main/resources/";

        Tomcat tomcat = new Tomcat();
        String port = System.getenv("PORT");
        if(port == null || port.isEmpty()){
            port = "8080";
        }
        tomcat.setPort(Integer.parseInt(port));

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webappDir).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDir).getAbsolutePath());

        // Declare an alternative location for your "WEB-INF/classes" dir
        // Servlet 3.0 annotation will work
        File additionWebInfClasses = new File("target/classes");
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
                additionWebInfClasses.getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start();
        tomcat.getConnector();
        tomcat.getServer().await();
    }

}
