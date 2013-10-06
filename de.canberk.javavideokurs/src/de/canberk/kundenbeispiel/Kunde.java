package de.canberk.kundenbeispiel;

public abstract class Kunde {

	private int id = 0;
	private String name;
	private String vorname;
	private String email;
	private String passwort;

	public Kunde(int id, String name, String vorname, String email,
			String passwort) {
		setId(id);
		setName(name);
		setVorname(vorname);
		setEmail(email);
		setPasswort(passwort);
		put(getId());
	}

	public abstract void put(int id);

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public String getEmail() {
		return email;
	}

	public String getPasswort() {
		return passwort;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ID: " + getId() + "\n");
		sb.append("Name: " + getName() + "\n");
		sb.append("Vorname: " + getVorname() + "\n");
		sb.append("E-Mail: " + getEmail() + "\n");
		sb.append("Passwort: " + getPasswort() + "\n");
		return sb.toString();
	}

}
