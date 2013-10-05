package de.canberk.grusskarten;

public class Hochzeit extends Karte {

	private int jahre;

	public Hochzeit(String empfaenger, String sex, int jahre) {
		super(empfaenger, sex);
		setJahre(jahre);
	}

	@Override
	public void gruss() {
		System.out.println("\nHallo " + sex + empfaenger);
		System.out.println("Frohen " + jahre + ". Hochzeitstag!");
	}

	private void setJahre(int jahre) {
		this.jahre = jahre;
	}

}
