package encounters;


import main.Player;

public class encounterSum {
	static standardEncounter[] encounterArray = {new e1_start(), new e2_friends(), new e3_assault()};

	public void startGame(Player _player) {
		int counter = 0;
		while (counter < encounterArray.length) {
			counter = encounterArray[counter].play(_player, counter);
		}
		System.out.println("[Congratulation, you won the Game]");
		System.out.println("Game closes in 5...");
		try {
		Thread.sleep(1000);
		System.out.println("4...");
		Thread.sleep(1000);
		System.out.println("3...");
		Thread.sleep(1000);
		System.out.println("2...");
		Thread.sleep(1000);
		System.out.println("1...");
		Thread.sleep(1000);
		System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
