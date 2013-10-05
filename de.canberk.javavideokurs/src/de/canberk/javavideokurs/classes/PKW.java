package de.canberk.javavideokurs.classes;

public class PKW extends Fahrzeug {

	int anzTueren;

	public PKW(String marke, int leistung, int preis, int anzTueren) {
		super(marke, leistung, preis);
		setAnzTueren(anzTueren);
	}

	@Override
	public void tunen(int ps) {
		setLeistung(leistung += ps);
	}
	
	@Override
	public int getPreis() {
		return super.getPreis();
	}

	public int getAnzTueren() {
		return anzTueren;
	}

	public void setAnzTueren(int anzTueren) {
		this.anzTueren = anzTueren;
	}
	
	@Override
	public String toString() {
		return super.toString() +  ", Anzahl Tühren: " + anzTueren;
	}

}
