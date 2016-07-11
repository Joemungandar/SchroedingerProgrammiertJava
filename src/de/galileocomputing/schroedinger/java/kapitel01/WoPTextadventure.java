package de.galileocomputing.schroedinger.java.kapitel01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WoPTextadventure {
	private static Scanner scanner;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		scanner = new Scanner(System.in);
		System.out.println("Name: ");
		String Player_Name = scanner.nextLine();
		System.out.println("Hallo " + Player_Name + ", willkommen in der World of Programmcraft."
				+ " Du befindest dich im Dorf Draco-on.");
		System.out.println("Verwende die Tasten 'N', 'O', 'S' und 'W', um dich zu bewegen, und 'I',"
				+ " um einen Blick in dein Inventar zu werfen.");
		System.out.println("Mit 'Q' verlässt du das Spiel.");
		String befehl;
		while ((befehl = br.readLine()) != null) {
			switch (befehl.toLowerCase()){
			case "n":
				System.out.println("Du gehst nach Norden");
				break;
			case "o":
				System.out.println("Du gehst nach Osten");				
				break;
			case "s":
				System.out.println("Du gehst nach Süden");
				break;
			case "w":
				System.out.println("Du gehst nach Westen");
				break;
			case "q":
				break;
			case "":
				break;
			case "i":
				break;
			default:
				System.err.println("Das verstehe ich nicht.");
			}
		}

	}

}
