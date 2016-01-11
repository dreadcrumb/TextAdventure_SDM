package encounters;

import java.util.Scanner;

import states.DeadState;
import main.Player;

public class e2_friends extends standardEncounter {

	@Override
	public int play(Player p, int counter) {
		player = p;
		return super.play(p, counter);

	}

	@Override
	public void start() {
		encounterRace = "";
		encounterPlace = (int) (Math.random() * 4);

		switch (encounterPlace) {
		case 0:
			encounterRace = "Dwarf";
			break;
		case 1:
			encounterRace = "Elf";
			break;
		case 2:
			encounterRace = "Orc";
			break;
		case 3:
			encounterRace = "Troll";
			break;
		}
		String n = "";
		if (encounterPlace == 1 || encounterPlace == 2) {
			n = "n ";
		}

		System.out
				.println("After leaving the dragon behind and travelling for some more hours, you find a "
						+ n + encounterRace + "resting beside the path");

	}

	@Override
	public void action() {
		affection = player.getRace().getAffectionArray()[encounterPlace];
		String a, b, c;
		switch (affection) {
		case 0:
			System.out
					.println("You remember the centuries of war your races have been fighting and ");
			a = "Attack the vicious " + encounterRace + "!";
			b = "Kick the " + encounterRace + "'s behind";
			c = "Try to avoid a fight";
			printPossibilities(a, b, c);
			break;
		case 1:
			System.out
					.println("You don't particularly like "
							+ encounterRace
							+ "s, but there's no enmity between your races. What will you do?");
			a = "Ignore the unstable peace and attack the " + encounterRace
					+ " hoping for loot.";
			b = "Greet the " + encounterRace
					+ ", don't further interact an keep going.";
			c = "Stay and talk to the " + encounterRace + ".";
			printPossibilities(a, b, c);
			break;
		case 2:
			System.out
					.println("Who would have though you would find a fellow "
							+ encounterRace
							+ " in this god-forsaken forest? You greet each other like siblings and chat over a bottle of wine. As it turns out"
							+ ", he's an adventurer just like you!");
			break;
		}

	}


	@SuppressWarnings("resource")
	@Override
	public void result() {
		String answer;
		do {
			Scanner scanner = new Scanner(System.in);
			answer = scanner.nextLine().toLowerCase();
		} while (!checkInput(answer));
			switch (affection) {
			case 0:
				switch (answer) {
				case "a":
					System.out
							.println("After sparring for some minutes you find a hole in the "
									+ encounterRace
									+ "'s defense and put your sword right through his heart. After going through his stuff you find"
									+ " a nice big swword which is way better than the one you have. [Got New Sword]");
					player.setSpecialWeapon(true);
					break;
				case "b":
					System.out
							.println("After sparring for some minutes you find a hole in the "
									+ encounterRace
									+ "'s defense and put your sword right through his heart. After going through his stuff you find"
									+ " a nice big swword which is way better than the one you have. [Got New Sword]");
					player.setSpecialWeapon(true);
					break;
				case "c":
					System.out
							.println("You put down your weapon and try to talk to the "
									+ encounterRace
									+ ", but he uses your falsely placed trust and separates your head from your shoulders. [You died]");
					DeadState deadState = new DeadState();
					deadState.killProgram();
					break;
				}
				break;
			case 1:
				switch (answer) {
				case "a":
					System.out
							.println("After sparring for some minutes you find a hole in the "
									+ encounterRace
									+ "'s defense and put your sword right through his heart. After going through his stuff you find"
									+ " a nice big swword which is way better than the one you have. [Got New Sword]");
					player.setSpecialWeapon(true);
					break;
				case "b":
					System.out
							.println("The "
									+ encounterRace
									+ "calls after you, but you ignore him and keep going. Maybe it was important?");
					break;
				case "c":
					System.out
							.println("You chat for a bit and share your provisions. This "
									+ encounterRace
									+ " actually seems nice, so you two decide to travel together for a bit. [Your fighting strength doubles]");
					player.setFightingStrength(player.getFightingStrength() * 2);
					break;
				}
				break;
			case 2:
				System.out
						.println("You decide to make group up for a while and fight together. [Your fighting strength doubles]");
				player.setFightingStrength(player.getFightingStrength() * 2);
				break;
			}

		
	}
}
