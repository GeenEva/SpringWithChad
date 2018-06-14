package eva.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	/*The sysouts demonstrate that Spring calls the setter and constructor also when the bean is
 	only called by getBean(), but no methods are executed upon it.
	Even when it can not find the bean because of typo in bean id (NoSuchBeanDefinitionException)
	the sysouts are executed.
	But when i misspell the class name
	in the bean, it does not execute the setter and constructor (CannotLoadBeanClassException)
	
	*/
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	
	//Setter will be called by Spring when adding the dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkOut() {
		System.out.println("Do some crickety crickety");
		return null;
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	

}
