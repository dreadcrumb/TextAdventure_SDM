import java.util.Scanner;

import encounters.*;

public class AdventureTest {

	public static void main(String[] args) {

		standardEncounter[] encounterArray = { new e1_start(),
				new e2_friends(), new e3_assault() };

		System.out.println("Choose your race, sucker");

		Scanner scanner = new Scanner(System.in);
		String race, name;
		do {
			System.out.println("Enter your race: [Dwarf, Elf, Orc, Troll]");
			race = scanner.nextLine();
		} while (race == null || race == "");
		do {
			System.out.println("Enter your name, " + race);
			name = scanner.nextLine();
		} while (name == null || name == "");

		Player player = new Player(race, name);

	}

}
