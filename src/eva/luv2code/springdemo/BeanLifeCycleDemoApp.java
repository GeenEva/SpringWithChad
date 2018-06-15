package eva.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	
		//load Spring configuration file
				
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
		//retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
	
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
				
	/*	OUTPUT:
			INFO: Loading XML bean definitions from class path resource [beanLifeCycle-applicationContext.xml]
					inside constructor
					inside init method
					inside getDailyWorkOut
					Spend 10 minutes on drawing a good track.
					inside getDailyFortune
					Just do itToday is you happylucky day
					Jun 15, 2018 1:13:00 PM org.springframework.context.support.AbstractApplicationContext doClose
					INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@515f550a: startup date [Fri Jun 15 13:12:59 CEST 2018]; root of context hierarchy
					inside destroy method*/
		
	}

}
