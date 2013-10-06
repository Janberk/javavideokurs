package de.canberk.kundenbeispiel;

public class PremiumKunde extends Kunde {

	private double bonus; // in €

	public PremiumKunde(int id, String name, String vorname, String email,
			String passwort, double bonus) {
		super(id, name, vorname, email, passwort);
		setBonus(bonus);
	}

	private void setBonus(double bonus) {
		this.bonus = bonus;
	}

	private double getBonus() {
		return bonus;
	}

	@Override
	public void put(int id) {
		System.out.println("Premiumkunde " + getName() + ", " + getVorname()
				+ ", mit der ID: " + getId() + " wurde erstellt");

	}

	public String toString() {
		return super.toString() + "Bonus: " + getBonus() + "€\n";
	}

}
