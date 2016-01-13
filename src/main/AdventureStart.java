package main;
import java.util.Scanner;

import states.*;
import encounters.*;

public class AdventureStart {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

	
		
		System.out.println("Choose your race: ");

		Scanner scanner = new Scanner(System.in);
		
		String race, name;
		
		do {
			System.out.println("Enter your race: [Dwarf, Elf, Orc, Troll]");
			race = scanner.nextLine().toLowerCase();
		} while (!checkRace(race) || race == null || race == "" );
		do {
			System.out.println("Enter your name, " + race + ": ");
			name = scanner.nextLine();
		} while (name == null || name == "" );
		
	
		if(name.toLowerCase().equals("stacey")){
			System.out.println("THAT'S NOT MY NAME....uhhh sorry nevermind.");
		}
		
		Player player = new Player(name);
		
		switch (race) {
		case "dwarf":
			player.setRace(new Dwarf(player));
			break;
		case "elf":
			player.setRace(new Elf(player));
			break;
		case "orc":
			player.setRace(new Orc(player));
			break;
		case "troll":
			player.setRace(new Troll(player));
			break;
		}
		
		
		
		System.out.println("Welcome to the forest, " + player.getName() + " the " + player.getRace().toString());

		encounterSum sum = new encounterSum();
		sum.startGame(player);
		
		
	}
	
	private static boolean checkRace(String race) {
		String[] races = {"dwarf", "elf", "orc", "troll"};
		for (int i = 0; i < races.length; i++) {
			if (race.equals(races[i]))
				return true;
		}
		return false;
	}

}
