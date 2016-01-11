package encounters;

import java.util.Scanner;

import main.Player;

public class e1_start extends standardEncounter {

	@Override
	public int play(Player p, int counter) {
		player = p;
		return super.play(p, counter);

	}

	@Override
	public void start() {

		System.out
				.println("You are "
						+ player.getName()
						+ ", a strong "
						+ player.getRace().toString()
						+ " warrior, striving through the kingdom of Hagenburg on your journey to find a maiden and treasures beyond your imagination. On this very day you are in a dark forest, where you wander around");
	}

	@Override
	public void action() {
		System.out
				.println("After wandering through the woods for hours, you encounter a big, sleeping dragon. What will you do?");
		String a = "You try to slay the beast";
		String b = "You try to sneak past it";
		String c = "You try to tame the dragon";
		printPossibilities(a, b, c);

	}

	@Override
	@SuppressWarnings("resource")
	public void result() {
		String answer;
		do {
			Scanner scanner = new Scanner(System.in);
			answer = scanner.nextLine().toLowerCase();
		} while (!checkInput(answer));
		switch (answer) {
		case "a":
			System.out
					.println("You try to cut of the dragons head with a single blow but the dragon awakes and a furious combat starts. You barely make it out alive and can escape from the dragon.");
			break;
		case "b":
			System.out
					.println("You get past the dragon but feel like a real coward. A real hero would've killed the dragon lad!");
			break;
		case "c":
			System.out
					.println("The dragon awakes and refuses your offer to be tamed because he is a strong, independent dragon that needs no tamer. You are a little bit sad but wish the dragon a good day and walk past him.");
			break;
		}

	}

}
