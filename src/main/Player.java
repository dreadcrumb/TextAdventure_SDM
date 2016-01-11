package main;
import states.RaceState;


public class Player {

	String name;
	RaceState race;
	int fightingStrength = 1;
	boolean specialWeapon = false;
	
	public Player(RaceState _race, String _name) {
		race = _race;
		name = _name;
	}
	
	public Player(String _name) {
		name = _name;
	}
	
	public void setRace(RaceState _race) {
		race = _race;
	}
	
	public String getName() {
		return name;
	}
	
	public RaceState getRace() {
		return race;
	}
	
	public void setFightingStrength(int str) {
		fightingStrength = str;
	}
	
	public int getFightingStrength() {
		return fightingStrength;
	}
	
	public void setSpecialWeapon(boolean w) {
		specialWeapon = w;
	}
	
	public boolean getSpecialWepon() {
		return specialWeapon;
	}
}
