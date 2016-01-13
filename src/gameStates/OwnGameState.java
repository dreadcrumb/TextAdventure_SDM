package gameStates;

import editor.PlayOwn;

public class OwnGameState implements IGameState {

	@Override
	public void start() {
		System.out.println("Starting OwnGame");
		PlayOwn.start();
	}

}
