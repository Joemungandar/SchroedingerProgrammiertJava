package de.galileocomputing.schroedinger.java.kapitel01;
import java.io.IOException;
import java.util.Scanner;

public class HalloSchroedinger {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie heiﬂt du? ");
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.println("Hallo " + name);
		System.out.println("Wie alt bist du?");
		int alter = scanner.nextInt();
		System.out.println(alter);
	}
}
