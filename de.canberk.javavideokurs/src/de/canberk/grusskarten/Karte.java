package de.canberk.grusskarten;

public abstract class Karte {

	public String empfaenger;
	public String sex;

	public Karte() {

	}

	public Karte(String empfaenger, String sex) {
		this.empfaenger = empfaenger;
		if (sex == "m" || sex == "M") {
			this.sex = "Lieber ";
		} else if (sex == "w" || sex == "W") {
			this.sex = "Liebe ";
		} else {
			this.sex = "";
		}
	}

	public abstract void gruss();

}
