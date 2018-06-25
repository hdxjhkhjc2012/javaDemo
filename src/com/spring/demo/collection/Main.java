package com.spring.demo.collection;

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
		/*Person p = (Person) ct.getBean("person3");*/
		/*NewPerson n = (NewPerson) ct.getBean("newPerson");
		System.out.println(n.toString());*/
		
		
		DataSource d = (DataSource) ct.getBean("datasource");
		System.out.println(d.getProperties());
				
	}
}
