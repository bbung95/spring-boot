package spring.springbootserver;

import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import spring.springbootserver.server.TomcatServer;

//@SpringBootApplication
//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
public class SpringBootServerApplication {

//	public static void main(String[] args) {
//			SpringApplication.run(SpringBootServerApplication.class, args);
//	}

    public static void main(String[] args) throws LifecycleException, InterruptedException {
		TomcatServer.servetStart();
    }

}
