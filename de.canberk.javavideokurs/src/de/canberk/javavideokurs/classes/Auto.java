package de.canberk.javavideokurs.classes;

public class Auto {
	
	public static final int DEFAULT_TUNEWERT = 25;

	public static int erstellteAutos = 0;
	
	static {
		System.out.println("Die Auto-Klasse wurde initialisiert...");
	}

	private int leistung;
	private final String hersteller;

	public Auto(int leistung, String hersteller) {
		setLeistung(leistung);
		this.hersteller = hersteller;
		erstellteAutos++;
		System.out.println("Es wurde das " + erstellteAutos
				+ ". Auto erstellt.");
	}
	
	public Auto(String hersteller) {
		this(100, hersteller);
	}

	public void tunen(int tuneWert) {
		leistung += tuneWert;
	}
	
	public void tune() {
		tunen(DEFAULT_TUNEWERT);
	}

	public static void printInfos(Auto auto) {
		System.out.println("Die Leistung: " + auto.leistung
				+ " PS, der Hersteller: " + auto.hersteller);
	}

	public int getLeistung() {
		return leistung;
	}

	public String getHersteller() {
		return hersteller;
	}

	private void setLeistung(int leistung) {
		this.leistung = leistung;
	}

}
