package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//1.spring初始化ioc容器对象
		//ApplicationContext 代表Ioc 容器
		//ClassPathXmlApplicationContext是ApplicationContext接口的实现类
		ApplicationContext ct = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		//2.从Ioc容器中获取Bean实例
		//利用id定位Ioc容器中的bean
		User user = (User) ct.getBean("user");
		//利用类型返回Ioc容器中的bean，但要求Ioc容器中必须只能有一个该类型的bean
		/*User user1 = ct.getBean(User.class);
		user1.say();*/
	
		Car car = (Car) ct.getBean("car");
		System.out.println(car.toString());
		
		Person p = (Person) ct.getBean("person");
		System.out.println(p.toString());
				
	}
}
