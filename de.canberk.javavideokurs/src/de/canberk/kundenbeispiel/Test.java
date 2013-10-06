package de.canberk.kundenbeispiel;

public class Test {

	public static void main(String[] args) {

		Kunde kunde01 = new PremiumKunde(1, "Demirkan", "Canberk",
				"canyde@hotmail.de", "C@ny1981", 100.0);
		Kunde kunde02 = new PremiumKunde(2, "Demirkan", "Yejay",
				"yejay@hotmail.de", "Yej@ay1996", 150.0);
		Kunde kunde03 = new StandartKunde(3, "Demirkan", "Zeyide",
				"zeyide@hotmail.de", "Zeyid€1958", 2);

		Kundenliste.addKunde(kunde01);
		Kundenliste.addKunde(kunde02);
		Kundenliste.addKunde(kunde03);
		
		System.out.println(Kundenliste.getAnzahlKunden());		

	}

}
