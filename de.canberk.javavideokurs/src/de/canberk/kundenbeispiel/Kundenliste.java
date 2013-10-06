package de.canberk.kundenbeispiel;

public class Kundenliste {

	private static Kunde[] kundenliste = new Kunde[100];
	static int counter = 0;

	public static void addKunde(Kunde kunde) {

		if (counter < kundenliste.length) {
			kundenliste[counter++] = kunde;
			kunde.setId(counter);
		}
	}
	
	public static int getAnzahlKunden() {
		return counter;
	}

}
