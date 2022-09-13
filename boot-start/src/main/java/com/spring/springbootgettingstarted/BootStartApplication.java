package com.spring.springbootgettingstarted;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BootStartApplication {

//	public static void main(String[] args) {
////
////		SpringApplication application = new SpringApplication(BootStartApplication.class);
////		application.setWebApplicationType(WebApplicationType.NONE);
////		application.run(args);
//
//		SpringApplication.run(BootStartApplication.class, args);
//	}

	public static void main(String[] args) throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		Context context = tomcat.addContext("/", "/");

//		HttpServlet servlet = new HttpServlet() {
//			@Override
//			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//				PrintWriter writer = resp.getWriter();
//				writer.println("<html><head><title>Hey, Tomcat</title></head>");
//				writer.println("<body><h1>Hello Tomcat</h1></body>");
//				writer.println("</body></html>");
//			}
//		};
//
//		String servletName = "helloServlet";
//		tomcat.addServlet("/", servletName, servlet);
//		context.addServletMappingDecoded("/hello", servletName);
//
//		System.out.println("servletName = " + servletName);

		tomcat.start();
		tomcat.getServer().await();
	}
}
