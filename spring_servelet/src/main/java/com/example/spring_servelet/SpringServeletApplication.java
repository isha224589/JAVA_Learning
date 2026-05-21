package com.example.spring_servelet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


@SpringBootApplication
public class SpringServeletApplication {

	public static void main(String[] args) throws LifecycleException{
		System.out.println("Hello");
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8081);

		// File docBase;
		// try {
		// 	docBase = Files.createTempDirectory("tomcat-docbase").toFile();
		// 	docBase.deleteOnExit();
		// } catch (IOException e) {
		// 	throw new IllegalStateException("Failed to create Tomcat docBase directory", e);
		// }

		// Context context = tomcat.addContext("", docBase.getAbsolutePath());
		
		Context context = tomcat.addContext("", null);

		Tomcat.addServlet(context, "Servlet", new Servlet());
		context.addServletMappingDecoded("/hello", "Servlet");
		tomcat.getConnector();
		tomcat.start();
		tomcat.getServer().await();
	}

}
