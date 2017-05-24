package com.sri.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ApplicationPath("/rest")
public class MyApplication extends Application {
	private Set<Object> singleton;
	private Set<Class<?>> classes;

	@SuppressWarnings("resource")
	public MyApplication() {
		ApplicationContext applicationContext = null;

		System.out.println("mickey");
		
		this.singleton = new HashSet<Object>();
		this.classes = new HashSet<Class<?>>();

		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		singleton.add(applicationContext.getBean("bookInfoResource"));
	}

	@Override
	public Set<Object> getSingletons() {
		return singleton;
	}
	
	
}
