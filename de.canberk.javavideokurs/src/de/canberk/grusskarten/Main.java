package de.canberk.grusskarten;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starte Grusskartenprogramm...");

		Karte[] karten = new Karte[4];

		karten[0] = new Valentin("Melike,", "W", 6);
		karten[1] = new Geburtstag("Canberk,", "M", 32);
		karten[2] = new KinderGeburtstag("Yejay", "M", 18);
		karten[3] = new Hochzeit("Didem,", "W", 1);

		
		for (Karte karte : karten) {
			if (karte instanceof KinderGeburtstag) {
				((KinderGeburtstag)karte).gruss("Orhan");
				continue;
			}
			karte.gruss();
		}

	}

}
