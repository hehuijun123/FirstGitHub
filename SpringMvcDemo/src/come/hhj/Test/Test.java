package come.hhj.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import come.hhj.aop.AnimalService;
import come.hhj.entity.User;

public class Test {
	public static void main(String[] args) {
		//two();
		//one();
		three();
		
	}
	public static void three(){
		ApplicationContext ac= new ClassPathXmlApplicationContext("aop2.xml");
		AnimalService as=(AnimalService) ac.getBean("animalService2");
		as.add();
	}
	public static void one(){
		ApplicationContext ac= new ClassPathXmlApplicationContext("aop.xml");
		AnimalService as=(AnimalService) ac.getBean("animalService1");
		as.add();
		
	}
	public static void two(){
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		User user=(User) ac.getBean("user");
		System.out.println(user);
		System.out.println(user.getHello()+user.getWorld());
	}

}
