package de.canberk.grusskarten;

public class ErwachsenenGeburtstag extends Geburtstag {
	
	public ErwachsenenGeburtstag(String empfaenger, String sex, int alter) {
		super(empfaenger, sex, alter);
	}
	
	public void gruss() {
		super.gruss();
		System.out.println("\nDu bist immernoch so jung geblieben!!!");
	}

}