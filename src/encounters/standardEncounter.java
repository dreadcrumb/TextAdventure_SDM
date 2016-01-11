package encounters;

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
	
	public void printPossibilities(String a, String b, String c) {
		System.out.println("[Press A] " + a);
		System.out.println("[Press B] " + b);
		System.out.println("[Press C] " + c);
	}

	public boolean checkInput(String answer) {
		if (answer.equals("a") || answer.equals("b") || answer.equals("c")) {
			return true;
		}
		return false;
	}
}
