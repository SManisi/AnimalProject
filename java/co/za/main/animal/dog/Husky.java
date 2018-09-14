package java.co.za.main.animal.dog;

import java.co.za.main.animal.Dog;

public class Husky implements Dog {
	
	public Husky() {
	}
	
	@Override
	public int walkingSpeed() {
		return 20;
	}

	@Override
	public String eyeColor() {
		return "Blue";
	}

	@Override
	public void bark() {		
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
