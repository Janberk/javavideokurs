package de.canberk.schneckenprojekt;

public class Wette {

	String schneckenName;
	int wettEinsatz;
	String spieler;

	public Wette(String schneckenName, int wettEinsatz, String spieler) {
		super();
		this.schneckenName = schneckenName;
		this.wettEinsatz = wettEinsatz;
		this.spieler = spieler;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Schneckenname: " + this.schneckenName + "\n");
		sb.append("Wetteinsatz: " + this.wettEinsatz + "\n");
		sb.append("Spieler: " + this.spieler + "\n");
		return sb.toString();
	}

}
