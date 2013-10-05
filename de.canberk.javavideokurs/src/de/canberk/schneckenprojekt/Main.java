package de.canberk.schneckenprojekt;

public class Main {
	
	public static void main(String[] args) {

		Rennen r = new Rennen("Bla", 100);
		r.addRennschnecke(new Rennschnecke("Bunny", "Frau", 20, 0));
		r.addRennschnecke(new Rennschnecke("Cany", "Mann", 20, 0));
		r.addRennschnecke(new Rennschnecke("Hulu", "Mann", 20, 0));
		System.out.println(r.toString());
		r.durchfuehren();
		
	}

}
