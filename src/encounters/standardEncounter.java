package encounters;

import java.util.Scanner;

import main.Player;

public abstract class standardEncounter {

	protected String encounterRace;
	protected int encounterPlace;
	protected Player player;
	protected int affection;

	public int play(Player p, int counter) {
		start();
		action();
		result();
		return counter + 1;
	}

	public abstract void start();

	public abstract void result();

	public abstract void action();

	public static void printPossibilities(String a, String b, String c) {
		System.out.println("[Press A] " + a);
		System.out.println("[Press B] " + b);
		System.out.println("[Press C] " + c);
	}

	public static boolean checkInput(String answer) {
		if (answer.equals("a") || answer.equals("b") || answer.equals("c")) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("resource")
	public static String getAnswer() {
		String answer;
		do {
			System.out.println("Please enter a, b or c");
			Scanner scanner = new Scanner(System.in);
			answer = scanner.nextLine().toLowerCase();
		} while (!checkInput(answer));
		return answer;
	}
	public static boolean askYN(){
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Type in Y or N");
			String answer = scan.nextLine();
			if(answer.toLowerCase().equals("y")){
				
				return true;
			}
			else if(answer.toLowerCase().equals("n")){
				
				return false;
			}
			else{
				System.out.println("Not a valid answer. Try again");
			}
		}while(true);
	}
	
}
