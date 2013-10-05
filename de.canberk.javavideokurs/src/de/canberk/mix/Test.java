package de.canberk.mix;

import java.util.Random;

public class Test {

	public static void main(String[] args) {

		Random r = new Random();
		int testAnz = 1000;
		int zahl; 
		int counter;
		int wuerfe[] = new int[testAnz];
		
		for (int i = 0; i < testAnz; i++) {
			counter = 0;
			do {				
				counter++;
				zahl = r.nextInt(6) + 1;
				System.out.println("Zahl ist: " + zahl + ", Würfe: " + counter);
				wuerfe[i] = counter;				
			} while (zahl != 6);			
		}
		
		double erg = 0;
		double schnitt = 0.0;
		for (double w : wuerfe) {
			schnitt = (erg += w)/testAnz;
		}		
		System.out.println("Durchschnittliche Würfe bis 6: " + schnitt);
	}

}
