package java.co.za.main.animal.cat;

import java.co.za.main.animal.Cat;

public class Persian implements Cat {

	public Persian() {
	}
	
	@Override
	public int walkingSpeed() {
		return 20;
	}

	@Override
	public String eyeColor() {
		return "Grey";
	}

	@Override
	public void meow() {		
	}

	@Override
	public int runningSpeed() {
		return 30;
	}
	
	@Override
	public int numberOfLegs() {
		return 4;
	}
	
	@Override
	public int numberOfEars() {
		return 2;
	}
}
