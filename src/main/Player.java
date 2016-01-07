package main;
import race.RaceState;


public class Player {

	String name;
	RaceState race;
	
	
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
}
