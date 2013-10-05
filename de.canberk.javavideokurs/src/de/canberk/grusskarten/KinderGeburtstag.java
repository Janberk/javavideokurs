package de.canberk.grusskarten;

public class KinderGeburtstag extends Geburtstag {
	
	public KinderGeburtstag(String empfaenger, String sex, int alter) {
		super(empfaenger, sex, alter);
	}
	
	public void gruss(String absender) {
		super.gruss();
		System.out.println("\nWas bist du gross geworden!!!");
		System.out.println("In Liebe, " + absender);
	}

}
