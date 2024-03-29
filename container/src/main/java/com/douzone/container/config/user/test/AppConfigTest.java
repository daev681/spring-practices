package com.douzone.container.config.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.config.user.AppConfig01;
import com.douzone.container.user.User;

public class AppConfigTest {

	
	public static void main(String[] args){
		testAppconfig02();
	}

	
	// Java Config
	// 직접 설정 자바 클래스를 전달
	// 설정 클래스에 @Configuration 필요 없다
	private static void testAppconfig01() {
		ApplicationContext ac =  new AnnotationConfigApplicationContext(AppConfig01.class);
		
		User user = ac.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext)ac).close();
	}
	

	
	// java config02
	// 자바 설정 클래스가 있는 베이스 패키지를 전달
	// 설정 클래스에 @Configuration이 반드시 필요하다,.
	private static void testAppconfig02() {
		ApplicationContext ac =  new AnnotationConfigApplicationContext("com.douzone.container.config.user");
		
		User user = ac.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext)ac).close();
	}
}
