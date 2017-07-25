package come.hhj.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import come.hhj.dao.imple.UserDaoImple;
import come.hhj.entity.User;
import come.hhj.service.UserService;

public class Test1 {
	private static void delete() throws Exception {
		ApplicationContext context=new  ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserDaoImple userdao=(UserDaoImple)context.getBean("userDaoImple");
		userdao.deleteUseId(4);
	}
	
	private static void three() {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserService demo=(UserService) context.getBean("userService");
		User user=demo.findUser(1);
		System.out.println(user);
	}
	public static void main(String[] args) throws Exception {
		
		three();
	}
	private static void one() {
		// TODO Auto-generated method stub
		ApplicationContext context=new  ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserDaoImple userdao=(UserDaoImple)context.getBean("userDaoImple");
		User user=userdao.selectUserById(1);
		System.out.println(user);
		User newuser=new User();
		newuser.setAge(15);
		newuser.setName("设计");
		newuser.setSex("男");
		userdao.insertUser(newuser);

	}
}
