package eva.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
		//load Spring configuration file
				
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		//retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
				
		
		//print out results
		System.out.println("\nPointing to the same object:" + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " +alphaCoach);
		
			
		//close the context
		context.close();
				
	/*	There is a subtle point you need to be aware of with "prototype" scoped beans.

		For "prototype" scoped beans, Spring does not call the destroy method.  Gasp!
		---
		In contrast to the other scopes, Spring does not manage the complete lifecycle of a 
		prototype bean: the container instantiates, configures, and otherwise assembles a prototype 
		object, and hands it to the client, with no further record of that prototype instance.

		Thus, although initialization lifecycle callback methods are called on all objects regardless 
		of scope, in the case of prototypes, configured destruction lifecycle callbacks are not called. 
		The client code must clean up prototype-scoped objects and release expensive resources that the 
		prototype bean(s) are holding. 

		---

		This also applies to both XML configuration and Annotation-based configuration.
		*/
	}

}
