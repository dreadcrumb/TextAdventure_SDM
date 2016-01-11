package states;

import main.Player;



public class Dwarf implements RaceState {

	
Player player;
//shows the affection towards other races in this order: dwarfs, elfs, orcs, trolls
int[] affection = {2,0,1,1};
	
	public Dwarf(Player _player) {
		player = _player;
	}
	@Override
	public void tell() {
		System.out.println("I am a Dwarf");
		
	}

	@Override
	public String toString() {
		return "Dwarf";
	}
	@Override
	public int[] getAffectionArray() {
		// TODO Auto-generated method stub
		return affection;
	}
}
