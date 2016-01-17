package unitTests;

import static org.junit.Assert.*;
import main.Player;

import org.junit.Test;

import encounters.standardEncounter;
import states.Elf;
import states.RaceState;

public class TestCase {

	private Player testplayer;
	private RaceState race;

	@Test
	public void test() {
		
		testplayer = new Player("Testerino");
		race = new Elf(testplayer);
		testplayer.setRace(race);
		
		assertEquals("Testerino",testplayer.getName());
		
		assertEquals(race,testplayer.getRace());
		int[] affection = {0,2,1,1};
		assertEquals(affection,testplayer.getRace().getAffectionArray());	
	}

}
