package eva.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	

	/*The sysouts demonstrate that Spring calls the setter and constructor also when the bean is
 	only called by getBean(), but no methods are executed upon it.
	Even when it can not find the bean because of typo in bean id (NoSuchBeanDefinitionException)
	the sysouts are executed.
	But when i misspell the class name
	in the bean, it does not execute the setter and constructor (CannotLoadBeanClassException)
	
	*/
	public CricketCoach() {
		System.out.println("Inside no-arg constructor from CricketCoach");
	}
	
	
	//Setter will be called by Spring when adding the dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method setFortuneService from CricketCoach");
		this.fortuneService = fortuneService;
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("Inside setEmail() from CricketCoach");
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside setTeam() from CricketCoach");

		this.team = team;
	}


	@Override
	public String getDailyWorkOut() {
		System.out.println("Inside getDailyWorkOut(): Do some crickety crickety");
		return "Return value getDailyWorkOut inside CricketCoach";
	}

	
	@Override
	public String getDailyFortune() {
		System.out.println("Inside getDailyFortune() from CricketCoach");
		return "Return value for getDailyFortune : " + fortuneService.getFortune();
	}

	
	

}
