package java.co.za.main.animal.cat;

import java.co.za.main.animal.Cat;

public class Munchkin implements Cat {

	public Munchkin() {
	}
	
	@Override
	public int walkingSpeed() {
		return 10;
	}

	@Override
	public void meow() {		
	}

	@Override
	public String eyeColor() {
		return "Blue";
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
