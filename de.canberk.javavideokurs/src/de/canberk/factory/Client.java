package de.canberk.factory;

public class Client {

	public static void main(String[] args) {
		IButton windowsButton = ButtonFactory.createButton("Windows");
		IButton linuxButton = ButtonFactory.createButton("Linux");

		windowsButton.draw();
		linuxButton.draw();

	}

}
