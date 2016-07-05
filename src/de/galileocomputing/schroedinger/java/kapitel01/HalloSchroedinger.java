package de.galileocomputing.schroedinger.java.kapitel01;
import java.io.IOException;

public class HalloSchroedinger {

	public static void main(String[] args) throws IOException {
		System.out.println("Hallo " + "");
		System.out.println("Wie alt bist du?");
		int alter = System.in.read();
		System.out.println(alter);
	}
}
