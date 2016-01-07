package race;

import main.Player;

public class Elf implements RaceState {
	
Player player;
//shows the affection towards other races in this order: dwarfs, elfs, orcs, trolls
int[] affection = {0,2,1,1};
	

	public Elf(Player _player) {
		player = _player;
	}
	@Override
	public void tell() {
		System.out.println("I am an Elf");
		
	}
	
	@Override
	public String toString() {
		return "Elf";
	}
	
	@Override
	public int[] getAffection() {
		// TODO Auto-generated method stub
		return affection;
	}
}
