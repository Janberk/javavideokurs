package de.canberk.grusskarten;

public class Valentin extends Karte {

	private int kuesse;

	public Valentin(String empfaenger, String sex, int kuesse) {
		super(empfaenger, sex);
		setKuesse(kuesse);
	}

	@Override
	public void gruss() {
		System.out.println("\nHallo " + sex + empfaenger);
		System.out.println("Frohen Valentinstag!");
		for (int i = 0; i < kuesse; i++) {
			System.out.print(":*");
		}
		System.out.println();
	}

	private void setKuesse(int kuesse) {
		this.kuesse = kuesse;
	}

}
