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
		
		/*OUTPUT:
			inside constructor
			Inside no-arg constructor from CricketCoach
			Inside setter method setFortuneService from CricketCoach
			Inside setEmail() from CricketCoach
			Inside setTeam() from CricketCoach
			Inside getDailyFortune() from CricketCoach
			Inside getDailyWorkOut(): Do some crickety crickety
			Return value for getDailyFortune : Today is you happylucky day
			Return value getDailyWorkOut inside CricketCoach
			yourEmail@mal.com
			The Coolias & Poolia's
*/	}

}
