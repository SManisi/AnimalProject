package java.co.za.main.animal.dog;

import java.co.za.main.animal.Dog;

public class GermanShepard implements Dog {

	public GermanShepard() {
	}
	
	@Override
	public int walkingSpeed() {
		return 10;
	}

	@Override
	public String eyeColor() {
		return "Brown";
	}

	@Override
	public void bark() {
	}

	@Override
	public int runningSpeed() {
		return 20;
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
