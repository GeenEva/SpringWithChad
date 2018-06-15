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
		
		
		/* OUTPUT:																LOCATION:
			Inside no-arg constructor from CricketCoach							applicationContext	
			Inside setter method setFortuneService from CricketCoach			applicationContext set up setter injection
			Inside setEmail() from CricketCoach									applicationContext inject literal value
			Inside setTeam() from CricketCoach									applicationContext inject literal value
			Inside getDailyFortune() from CricketCoach							CricketCoach gettter
			Inside getDailyWorkOut(): Do some crickety crickety					CricketCoach getter
			Return value for getDailyFortune : Today is you happylucky day		getter return value
			Return value getDailyWorkOut inside CricketCoach					getter return value
			eva@luvs2code.nl													value in applicationContext
			The WhoopWhoops														value in applicationContext
			*/
	}

}
