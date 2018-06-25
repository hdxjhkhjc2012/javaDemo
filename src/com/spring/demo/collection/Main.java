package com.spring.demo.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//1.spring��ʼ��ioc��������
		//ApplicationContext ����Ioc ����
		//ClassPathXmlApplicationContext��ApplicationContext�ӿڵ�ʵ����
		ApplicationContext ct = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		//2.��Ioc�����л�ȡBeanʵ��
		//����id��λIoc�����е�bean
		/*Person p = (Person) ct.getBean("person3");*/
		/*NewPerson n = (NewPerson) ct.getBean("newPerson");
		System.out.println(n.toString());*/
		
		
		DataSource d = (DataSource) ct.getBean("datasource");
		System.out.println(d.getProperties());
				
	}
}
