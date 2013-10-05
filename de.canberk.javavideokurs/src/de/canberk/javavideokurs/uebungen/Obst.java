package de.canberk.javavideokurs.uebungen;

public class Obst {

	private String bezeichnung;
	private double ePreis;
	private double vPreis;
	private int kcal;

	public Obst(String bezeichnung, double ePreis, int kcal) {
		setBezeichnung(bezeichnung);
		setePreis(ePreis);
		setvPreis(ePreis + ePreis);
		setKcal(kcal);
	}

	public void aufpeppen() {
		setvPreis(getvPreis() + getvPreis());
		setKcal(getKcal() + 50);
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public double getePreis() {
		return ePreis;
	}

	public double getvPreis() {
		return vPreis;
	}

	public int getKcal() {
		return kcal;
	}

	private void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	private void setePreis(double ePreis) {
		this.ePreis = ePreis;
	}

	private void setvPreis(double vPreis) {
		this.vPreis = vPreis;
	}

	private void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public static void printInfos(Obst obst) {
		System.out.println("Bezeichnung: " + obst.getBezeichnung());
		System.out.println("Einkaufspreis: " + obst.getePreis() + "€");
		System.out.println("Verkaufspreis: " + obst.getvPreis() + "€");
		System.out.println("Kalorien: " + obst.getKcal() + "kcal");
	}

	public static void main(String[] args) {
		Obst apfel = new Obst("Apfel", 0.5, 50);
		apfel.aufpeppen();
		Obst.printInfos(apfel);
	}

}
