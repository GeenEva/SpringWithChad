package eva.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortuneArray = {"Oh my are you lucky today",
										"Klavertje vier kom hier",
										"Guus Geluk met konijnenpoot"};
	
	//Create random number generator
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortuneArray.length);
		String theFortune = fortuneArray[index];
		return theFortune;
	}

}
