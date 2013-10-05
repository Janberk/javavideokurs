package de.canberk.javavideokurs.classes;

import de.canberk.interfaces.Verkaeuflich;

public abstract class Fahrzeug implements Verkaeuflich {

	String marke;
	int leistung;
	int preis;

	public Fahrzeug(String marke, int leistung, int preis) {
		setMarke(marke);
		setLeistung(leistung);
		setPreis(preis);
	}

	public abstract void tunen(int ps);

	public String getMarke() {
		return marke;
	}

	public int getLeistung() {
		return leistung;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	@Override
	public String toString() {
		return "Hersteller: " + marke + ", Leistung: " + leistung + "PS, Preis: "
				+ preis + ",-€";
	}

}
