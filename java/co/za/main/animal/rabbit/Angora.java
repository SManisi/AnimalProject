package java.co.za.main.animal.rabbit;

import java.co.za.main.animal.Rabbit;

public class Angora implements Rabbit {

	public Angora() {
	}
	
	@Override
	public int walkingSpeed() {
		return 10;
	}

	@Override
	public String eyeColor() {
		return "Red";
	}

	@Override
	public void purr() {
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
