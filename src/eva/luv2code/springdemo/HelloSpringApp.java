package eva.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp {

	public static void main(String[] args) {
		
		//Load Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut() + "\n" + theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
