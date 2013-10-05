package de.canberk.grusskarten;

public class Geburtstag extends Karte {

	private int alter;

	public Geburtstag(String empfaenger, String sex, int alter) {
		super(empfaenger, sex);
		setAlter(alter);
	}

	@Override
	public void gruss() {
		System.out.println("\nHallo " + sex + empfaenger);
		System.out.println("Alles Gute zum " + alter + ". Geburtstag!");
	}

	private void setAlter(int alter) {
		this.alter = alter;
	}

}
