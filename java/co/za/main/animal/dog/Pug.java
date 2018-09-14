package java.co.za.main.animal.dog;

import java.co.za.main.animal.Dog;

public class Pug implements Dog {
	
	public Pug() {
	}
	
	@Override
	public int walkingSpeed() {
		return 30;
	}

	@Override
	public String eyeColor() {
		return "Green";
	}

	@Override
	public void bark() {
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
