package java.co.za.main.mainclass;

import java.co.za.main.animal.Animal;
import java.co.za.main.animal.Cat;
import java.co.za.main.animal.Dog;
import java.co.za.main.animal.Rabbit;
import java.co.za.main.animal.cat.Munchkin;
import java.co.za.main.animal.cat.Persian;
import java.co.za.main.animal.cat.Siamese;
import java.co.za.main.animal.dog.GermanShepard;
import java.co.za.main.animal.dog.Husky;
import java.co.za.main.animal.dog.Pug;
import java.co.za.main.animal.dog.Schnauzer;
import java.co.za.main.animal.rabbit.Angora;
import java.co.za.main.animal.rabbit.Chinchilla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Munchkin();
		Cat cat2 = new Persian();
		Cat cat3 = new Siamese();
		Rabbit rabbit1 = new Angora();
		Rabbit rabbit2 = new Chinchilla();
		Dog dog1 = new Schnauzer();
		Dog dog2 = new Husky();
		Dog dog3 = new GermanShepard();
		Dog dog4 = new Pug();
		 
		
		
		Animal[] animalList = new Animal[]{cat1, cat2, cat3, rabbit1, rabbit2, dog1, dog2, dog3, dog4};
		
		Arrays.sort(animalList);
		
		for (Animal animal : animalList) {
			System.out.println("Animal: " + animal);
		}
		
		
	}
}
