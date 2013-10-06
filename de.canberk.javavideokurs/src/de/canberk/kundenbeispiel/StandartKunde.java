package de.canberk.kundenbeispiel;

public class StandartKunde extends Kunde {

	private int laufzeit; // in Jahren

	public StandartKunde(int id, String name, String vorname, String email,
			String passwort, int laufzeit) {
		super(id, name, vorname, email, passwort);
		setLaufzeit(laufzeit);
	}

	private void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	private int getLaufzeit() {
		return laufzeit;
	}

	@Override
	public void put(int id) {
		System.out.println("Standartkunde " + getName() + ", " + getVorname()
				+ ", mit der ID: " + getId() + " wurde erstellt");

	}

	public String toString() {
		return super.toString() + "Laufzeit: " + getLaufzeit() + " Jahre\n";
	}

}
