package de.canberk.haustiere;

public class Main {

	public static void main(String[] args) {
		
		Haustier tier = new Hund("Bello", 10);
		tier.anzeigen();
		tier = new Katze("Garfield", 20);
		tier.anzeigen();

	}

}
