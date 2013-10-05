package de.canberk.schneckenprojekt;

import java.util.ArrayList;

public class Rennen {

	ArrayList<Rennschnecke> schnecken = new ArrayList<Rennschnecke>();
	String name;
	int anzTeilnehmer = 0;
	int rennDist;

	public Rennen(String name, int rennDist) {
		super();
		this.name = name;
		this.rennDist = rennDist;
	}

	public void addRennschnecke(Rennschnecke newRennschnecke) {
		this.schnecken.add(newRennschnecke);
		this.anzTeilnehmer++;
	}

	public void removeRennschnecke(String name) {

	}

	public void lasseSchneckenKriechen() {
		for (Rennschnecke rs : this.schnecken) {
			rs.krieche();
		}
	}

	public Rennschnecke ermittleGewinner() {
		Rennschnecke gewinner = null;
		for (Rennschnecke schnecke : this.schnecken) {
			if (schnecke.getDist() > this.rennDist) {
				if (gewinner == null) {
					gewinner = schnecke;
				} else {
					if (schnecke.getDist() > gewinner.getDist()) {
						gewinner = schnecke;
					}
				}
			}
		}
		if (gewinner != null) {
			System.out.println("Gewinner: \n" + gewinner.toString());
		}		
		return gewinner;
	}

	public void durchfuehren() {
		while (ermittleGewinner() == null) {
			this.lasseSchneckenKriechen();
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Event: " + this.name + "\n");
		sb.append("Anzahl der Teilnehmer: " + this.anzTeilnehmer + "\n");
		sb.append("Renndistanz: " + this.rennDist + "\n");
		sb.append("\nTeilnehmer: \n");
		for (Rennschnecke rs : this.schnecken) {
			sb.append(rs.toString() + "\n");
		}
		return sb.toString();
	}

	public ArrayList<Rennschnecke> getSchnecken() {
		return schnecken;
	}

	public void setSchnecken(ArrayList<Rennschnecke> schnecken) {
		this.schnecken = schnecken;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnzTeilnehmer() {
		return anzTeilnehmer;
	}

	public void setAnzTeilnehmer(int anzTeilnehmer) {
		this.anzTeilnehmer = anzTeilnehmer;
	}

	public int getRennDist() {
		return rennDist;
	}

	public void setRennDist(int rennDist) {
		this.rennDist = rennDist;
	}

}
