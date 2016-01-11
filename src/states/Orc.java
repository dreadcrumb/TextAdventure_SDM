package states;

import main.Player;

public class Orc implements RaceState {
	
	Player player;
	//shows the affection towards other races in this order: dwarfs, elfs, orcs, trolls
	int[] affection = {1,1,2,0};
		
	
	public Orc(Player _player) {
		player = _player;
	}
	
	@Override
	public void tell() {
		System.out.println("I am an Orc");
		
	}
	
	@Override
	public String toString() {
		return "Orc";
	}
	
	@Override
	public int[] getAffectionArray() {
		// TODO Auto-generated method stub
		return affection;
	}
}
