package de.canberk.schneckenprojekt;

public class Rennschnecke {
	
	String name;
	String rasse;
	int maxTempo;
	int dist = 0;
	
	public Rennschnecke(String name, String rasse, int maxTempo, int dist) {
		super();
		this.name = name;
		this.rasse = rasse;
		this.maxTempo = maxTempo;
		this.dist = dist;
	}
	
	public void krieche() {
		this.dist += (int)(Math.random() * ((this.maxTempo - 1)  + 1)  + 1);
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Name: " + this.name + "\n");
		sb.append("Rasse: " + this.rasse + "\n");
		sb.append("Maximal Geschwindigkeit: " + this.maxTempo + "\n");
		sb.append("Zurückgelegte Distanz: " + this.dist + "\n");
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	public int getMaxTempo() {
		return maxTempo;
	}

	public void setMaxTempo(int maxTempo) {
		this.maxTempo = maxTempo;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}

}
