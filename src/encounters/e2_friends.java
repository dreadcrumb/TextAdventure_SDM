package encounters;

import java.util.Scanner;

import main.Player;

public class e2_friends extends standardEncounter {

	private String encounterRace;
	private int encounterPlace;
	private Player player;
	private int affection;

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
		if (encounterPlace == 1 || encounterPlace == 2) {
			System.out
					.println("After leaving the dragon behind and travelling for some more hours, you find an "
							+ encounterRace + "resting beside the path");
		} else {
			System.out
					.println("After leaving the dragon behind and travelling for some more hours, you find a "
							+ encounterRace + "resting beside the path");
		}

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
			printPossibilities(a, a, a);
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

	@Override
	public void printPossibilities(String a, String b, String c) {
		super.printPossibilities(a, b, c);
	}

	@Override
	public void result() {
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine().toLowerCase();
		if (checkInput(answer)) {
			switch (affection) {
			case 0:
				System.out
						.println("After sparring for some minutes you find a hole in the "
								+ encounterRace
								+ "'s defense and put your sword right through his heart. After going through his stuff you are disappointed"
								+ " to only find some old bread and cheese...");
				break;
			case 1:
				switch (answer) {
				case "a":
					System.out
							.println("After sparring for some minutes you find a hole in the "
									+ encounterRace
									+ "'s defense and put your sword right through his heart. After going through his stuff you are disappointed"
								+ " to only find some old bread and cheese...");
					break;
				case "b":
					System.out.println("The " + encounterRace
							+ "calls after you, but you ignore him and keep going. Maybe it was important?");
					break;
				case "c":
					System.out
							.println("You chat for a bit and share your provisions. This "
									+ encounterRace
									+ " actually seems nice, so you two decide to travel together for a bit. [Your fighting strength doubles]");
					player.setFightingStrength(player.getFightingStrength()*2);
					break;
				}
				break;
			case 2:
				break;
			}

		}
	}
}
