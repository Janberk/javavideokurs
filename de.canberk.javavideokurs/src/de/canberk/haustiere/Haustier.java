package de.canberk.haustiere;

public abstract class Haustier {

	String name;
	double futterVorrat;
	int anzahlTage;

	public Haustier() {

	}

	public Haustier(String name, double futterVorrat) {
		this.name = name;
		this.futterVorrat = futterVorrat;
	}

	public abstract void friss();

	public abstract void sprich();

	public void fuettern() {
		sprich();
		friss();
	}

	public void anzeigen() {
		fuettern();
		System.out.println(name + ": Der Vorrat reicht " + anzahlTage
				+ " Tage!");
	}

}
