package de.canberk.haustiere;

public class Hund extends Haustier {

	public Hund(String name, double futterVorrat) {
		super(name, futterVorrat);
	}

	@Override
	public void friss() {
		for (double i = futterVorrat; i > 0; i--) {
			anzahlTage++;
			System.out.println("Vorrat: " + i);
		}
	}

	@Override
	public void sprich() {
		System.out.println("Wuffff!");
	}

}
