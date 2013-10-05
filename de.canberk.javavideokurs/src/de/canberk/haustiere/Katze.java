package de.canberk.haustiere;

public class Katze extends Haustier {
	
	public Katze(String name, double futterVorrat) {
		super(name, futterVorrat);
	}

	@Override
	public void friss() {
		for (double i = futterVorrat; i > 0; i -= 0.5) {
			anzahlTage++;
			System.out.println("Vorrat: " + i);
		}
	}

	@Override
	public void sprich() {
		System.out.println("Miauuu!");
	}

}
