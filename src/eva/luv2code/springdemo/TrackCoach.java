package eva.luv2code.springdemo;

public class TrackCoach implements Coach {

	FortuneService fortuneService;
	
	public TrackCoach(){}
	
	
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("inside constructor");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkOut() {
		System.out.println("inside getDailyWorkOut");

		 return "Spend 10 minutes on drawing a good track.";
	}

	
	@Override
	public String getDailyFortune() {
		System.out.println("inside getDailyFortune");

		return "Just do it" + fortuneService.getFortune();
	}

	//init method
	public void doSomeStartUpStuff() {
		System.out.println("inside init method");
	}
	
	//destroy method
	public void doSomeDestroyStuff() {
		System.out.println("inside destroy method");
	}
}
