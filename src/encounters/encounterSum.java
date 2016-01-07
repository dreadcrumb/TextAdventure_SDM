package encounters;


import main.Player;

public class encounterSum {
	static standardEncounter[] encounterArray = {new e1_start(), new e2_friends(), new e3_assault()};

	public static void startGame(Player _player) {
		int counter = 0;
		while (counter < encounterArray.length) {
			/*for(int i = 0; i < 10; i++) {
				System.out.println();
			}*/
			counter = encounterArray[counter].play(_player, counter);
		}
	}
}
