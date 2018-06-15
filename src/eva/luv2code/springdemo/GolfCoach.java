package eva.luv2code.springdemo;

public class GolfCoach implements Coach {
	
	/*When GolfCoach is constructed, it gets a fortuneService as an argument.
	 * Every fortuneService has the getFortune() method, so depending on which 
	 * fortuneService is given along, it executes the corresponding getFortune()
	 * method.
	*/
	
	FortuneService fortuneService;
	
	
	public GolfCoach() {}
	

	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkOut() {
		System.out.println("Golf coach gets his daily workout");
		return "return value daily workout golfcoach";
	}

	@Override
	public String getDailyFortune() {
		/* In the applicationContext the GolfCoach has been given a randomFortuneService
		 * as a parameter for the constructor: <constructor-arg ref="myRandomFortuneService" />
		 */
		return fortuneService.getFortune();
	}

	
}
