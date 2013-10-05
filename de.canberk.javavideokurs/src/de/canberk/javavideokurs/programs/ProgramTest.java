package de.canberk.javavideokurs.programs;

import de.canberk.interfaces.Verkaeuflich;
import de.canberk.javavideokurs.classes.Fahrzeug;
import de.canberk.javavideokurs.classes.Motorrad;
import de.canberk.javavideokurs.classes.PKW;

public class ProgramTest {

	public static void main(String[] args) {
		System.out.println("Starte Test!");

		Fahrzeug bmw = new PKW("BMW", 120, 35000, 5);
		Fahrzeug suzuki = new Motorrad("Suzuki", 300, 10000, 2);
		bmw.tunen(40);
		bmw.setPreis(40000);
		System.out.println(bmw.toString());
		System.out.println(bmw.getPreis());
		System.out.println(suzuki.toString());
		Verkaeuflich v = new PKW("Audi", 200, 60000, 5);
		System.out.println(v.getPreis());
	}

}
