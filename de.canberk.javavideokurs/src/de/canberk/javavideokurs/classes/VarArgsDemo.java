package de.canberk.javavideokurs.classes;

public class VarArgsDemo {

	public static void main(String[] args) {

		System.out.println(addiere(1, 2, 5, 10, 3, 93, 7324));

	}

	/*
	 * Es koennen beim Methodenaufruf in der Main-Methode beliebig viele
	 * int-Parameter angegeben werden.
	 */
	static int addiere(int x, int y, int... z) {
		int erg = 0;

		erg = x + y;
		for (int zahl : z) {
			erg += zahl;
		}
		return erg;
	}

}
