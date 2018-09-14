package java.co.za.main.animal.cat;

import java.co.za.main.animal.Cat;

public class Siamese implements Cat {

	public Siamese() {
	}
	
	@Override
	public int walkingSpeed() {
		return 30;
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
		return 40;
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
