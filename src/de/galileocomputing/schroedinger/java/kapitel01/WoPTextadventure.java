package de.galileocomputing.schroedinger.java.kapitel01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WoPTextadventure {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name: ");
		String Player_Name = scanner.nextLine();
		System.out.println("Hallo " + Player_Name + ", willkommen in der World of Programmcraft."
				+ " Du befindest dich im Dorf Draco-on.");
		System.out.println("Verwende die Tasten 'N', 'O', 'S' und 'W', um dich zu bewegen, und 'I',"
				+ " um einen Blick in dein Inventar zu werfen.");
		System.out.println("Mit 'Q' verlässt du das Spiel.");

	}

}
