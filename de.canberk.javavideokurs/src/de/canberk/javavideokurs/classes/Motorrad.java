package de.canberk.javavideokurs.classes;

public class Motorrad extends Fahrzeug{
	
	int anzRaeder;

	public Motorrad(String marke, int leistung, int preis, int anzRaeder) {
		super(marke, leistung, preis);
		setAnzRaeder(anzRaeder);
	}

	@Override
	public void tunen(int ps) {
		setLeistung(leistung += ps);
	}
	
	@Override
	public int getPreis() {
		return super.getPreis();
	}

	public int getAnzRaeder() {
		return anzRaeder;
	}

	public void setAnzRaeder(int anzRaeder) {
		this.anzRaeder = anzRaeder;
	}
	
	@Override
	public String toString() {
		return super.toString() +  ", Anzahl Räder: " + anzRaeder;
	}

}
