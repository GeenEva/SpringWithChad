package eva.luv2code.springdemo;

public class TrackCoach implements Coach {

	FortuneService fortuneService;
	
	public TrackCoach(){}
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkOut() {
		 return "Spend 10 minutes on drawing a good track.";
	}

	
	@Override
	public String getDailyFortune() {
		return "Just do it" + fortuneService.getFortune();
	}

}
