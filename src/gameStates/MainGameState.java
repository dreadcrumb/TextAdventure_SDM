package gameStates;

import main.AdventureStart;

public class MainGameState implements IGameState {

	@Override
	public void start() {
		System.out.println("Starting main Game");
		AdventureStart.main(null);
	}

}
