package eva.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
			
		//load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyFortune()+"\n" + theCoach.getDailyWorkOut());
		
		//call new methods to get the literal values
		System.out.println(theCoach.getEmail() + "\n" + theCoach.getTeam());
	
		
		//close the context
		context.close();
		

	}

}
