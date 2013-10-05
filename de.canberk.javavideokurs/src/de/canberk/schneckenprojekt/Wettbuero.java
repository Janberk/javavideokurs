package de.canberk.schneckenprojekt;

import java.util.ArrayList;

public class Wettbuero {

	private Rennen rennen;
	private ArrayList<Wette> wetten;
	@SuppressWarnings("unused")
	private double faktor;

	public Wettbuero(Rennen rennen, double faktor) {
		super();

		if (faktor < 0) {
			throw new IllegalArgumentException(
					"Es dürfen keine negativen Wetten ausgegeben werden!");
		}
		this.rennen = rennen;
		this.faktor = faktor;
		this.wetten = new ArrayList<Wette>();
	}

	public void wetteAnnehmen(String schneckenName, int wettEinsatz,
			String spieler) {

		wetten.add(new Wette(schneckenName, wettEinsatz, spieler));
	}

	public void rennenDurchfuehren() {

		this.rennen.durchfuehren();
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Renen:\n");
		sb.append(this.rennen);
		sb.append("Wetten:\n");

		if (wetten.size() > 0) {
			for (Wette wette : this.wetten) {
				sb.append(wette);
				sb.append("\n");
			}
		} else {
			sb.append("(keine)");
		}

		return sb.toString();
	}

	public void print() {
		StringBuilder sb = new StringBuilder();

		sb.append("Wettbüro für:\n");
		sb.append(this.rennen.toString());
		sb.append("Wetten:\n");

		if (wetten.size() > 0) {
			for (Wette bet : this.wetten) {
				sb.append(bet);
				sb.append("\n");
			}
		} else {
			sb.append("(keine)");
		}

		System.out.println(sb.toString());
	}

}
