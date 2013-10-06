package de.canberk.factory;

public class ButtonFactory {

	public static IButton createButton(String os) {
		if (os.equals("Windows")) {
			return new WindowsButton();
		} else if (os.equals("Linux")) {
			return new LinuxButton();
		}
		return null;
	}
}
