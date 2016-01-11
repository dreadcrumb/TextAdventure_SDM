package states;

import main.Player;

public class Troll implements RaceState {

	Player player;
	//shows the affection towards other races in this order: dwarfs, elfs, orcs, trolls
	int[] affection = {1,1,0,2};
		

	public Troll(Player _player) {
		player = _player;
	}

	@Override
	public void tell() {
		System.out.println("I am a Troll");
	}

	@Override
	public String toString() {
		return "Troll";
	}
	
	@Override
	public int[] getAffectionArray() {
		// TODO Auto-generated method stub
		return affection;
	}
}
