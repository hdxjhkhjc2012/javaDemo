package com.spring.demo;

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
		User user = (User) ct.getBean("user");
		//�������ͷ���Ioc�����е�bean����Ҫ��Ioc�����б���ֻ����һ�������͵�bean
		/*User user1 = ct.getBean(User.class);
		user1.say();*/
	
		Car car = (Car) ct.getBean("car");
		System.out.println(car.toString());
		
		Person p = (Person) ct.getBean("person");
		System.out.println(p.toString());
				
	}
}
