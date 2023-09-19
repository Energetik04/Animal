package edu.itacademy.task1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Animal animal = null;
		int x;
		x = rand.nextInt(1, 100);
		if ((x >= 1) && (x <= 30)) {
			animal = new Dog();
		} else {
			if ((x >= 31) && (x <= 60)) {
				animal = new Cat();
			} else {
				if ((x >= 61) && (x <= 100)) {
					animal = new Cow();
				}

			}
		}
		animal.sound();
	}
	
}
