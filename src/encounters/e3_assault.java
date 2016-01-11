package encounters;

import java.util.Scanner;

import states.DeadState;
import main.Player;

public class e3_assault extends standardEncounter {

	String twinName;

	@Override
	public int play(Player p, int counter) {
		player = p;
		return super.play(p, counter);

	}

	@Override
	public void start() {
		twinName = new StringBuilder(player.getName()).reverse().toString();
		System.out.println("After some time you meet your evil twin "
				+ twinName
				+ " who bullied you since birth tries to fight you. ");

	}

	@Override
	public void action() {
		String a, b, c;
		a = "You go in for a hug. 'Hi " + twinName
				+ ", what are you doing here?'";
		b = "You draw your sword and prepare for battle.";
		c = "You start to scream and run away.";
		printPossibilities(a, b, c);
	}

	@SuppressWarnings("resource")
	@Override
	public void result() {
		String answer;
		do {
			Scanner scanner = new Scanner(System.in);
			answer = scanner.nextLine().toLowerCase();
		} while (!checkInput(answer));
		DeadState deadState = new DeadState();
			switch (answer) {
			case "a":
				System.out
						.println("You stretch your arms wide and run towards "
								+ twinName
								+ ", right into his open blade. [You died]");
				
				deadState.killProgram();
				break;
			case "b":
				if (player.getFightingStrength() == 2) {
					System.out
							.println("After some fighting, you and your companion manage to kill your twin.");
		
				} else if (player.getSpecialWepon()) {
					System.out
							.println("Thanks to your special sword, you are better than your twin and manage to kill him. You whisper into his ear 'For the watch. It's all ogre now' And kiss him on the cheek");
					
				} else {
					System.out.println("You fight, but your twin clearly is stronger. The last thing you see before you die is your laughing twin");
					System.out.println("[You died]");
					deadState.killProgram();
				}
				break;
			case "c":
				System.out
						.println("Well thats one way to deal with situations. I guess you ... won?");
				break;
			}
		}
	

}
