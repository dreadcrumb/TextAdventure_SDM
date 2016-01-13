package editor;

import java.util.ArrayList;
import java.util.Scanner;

import encounters.standardEncounter;
import main.Main;

public class PlayOwn {
	
	public static void start(){
		ArrayList<SimpleEncounter> list=EncounterEditor.getEncounters();
		Scanner input=new Scanner(System.in);
		
		
		if(list==null || list.size()==0){
			System.out.println("Seems like you haven't created your own encounters yet. Go to the Editor first");
			Main.main(null);
		}
		
		System.out.println("Welcome to your own game. Let us begin");
		for(SimpleEncounter i : list){
			play(i);
		}
		
		System.out.println("Congratulations. You have finished your game. You will be brought to the Menuscreen");
		try {
			Thread.sleep(3000);
			Main.main(null);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	private static void play(SimpleEncounter i) {
		System.out.println(i.text);
		standardEncounter.printPossibilities(i.choices.get(0).get(0), i.choices.get(0).get(1), i.choices.get(0).get(2));
		
		
		String answer;
		int numAnswer;
		while(true){
			answer = standardEncounter.getAnswer();
			numAnswer=(int)answer.charAt(0)-97;
			System.out.println(i.choices.get(1).get(numAnswer));
			if(checkAnswer(i,answer)){
				System.out.println("CONGRATULATIONS. YOU DID IT! You proceed your journey...");
				break;
			}
			else{
				System.out.println("Maybe you should try something different.");
			}
		}
	}


	public static boolean checkAnswer(SimpleEncounter a, String answer){
		//if(asd.matches("\\d"))
			//System.out.println("It's a match");
		
		if(answer==a.rightOne)
			return true;
		else
			return false;
	}
}
