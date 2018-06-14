package eva.luv2code.springdemo;

public class BaseBallCoach implements Coach{

	//Define a private field for the dependencies
	private FortuneService fortuneService;
	
	
	//Define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on drawing a basketball.";
		
	}


	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}


	
}
