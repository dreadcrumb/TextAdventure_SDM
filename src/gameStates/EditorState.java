package gameStates;

import editor.EditorFace;

public class EditorState implements IGameState {

	@Override
	public void start() {
		System.out.println("Starting Editor...");
		EditorFace.main(null);
	}

}
