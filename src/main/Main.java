package main;

import gameStates.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static IGameState game;
	
	public static void main(String[] args) {
		
		if(game == null)
		{
			System.out.println("Welcome to the Forest Version 1.0.");
			System.out.println("Have fun and enjoy your adventure.");
			System.out.println();
		}

		
		
		Scanner scanner = new Scanner(System.in);
		String scanned, input;
		System.out.println("===============================");
		System.out.println("What do you want to do? Choose:");
		System.out.println("Type in the following commands to proceed:");
		System.out.println("[Maingame] : To play the main game");
		System.out.println("[Editor] : To edit your own story");
		System.out.println("[Mygame] : To play the game you created in the editor");
		System.out.println("[Exit] : To exit");
		System.out.println("===============================");
		do{
			
			scanned=scanner.nextLine();
			input=scanned.toLowerCase();
			
			if(input.equals("maingame") || input.equals("editor") ||input.equals("exit") || input.equals("mygame")){
				break;
			}
			else{
				System.out.println("Not a valid option. Try again.");
			}
		}while(true);
		
		
		
		switch (input) {
		case "maingame":
			game=new MainGameState();			
			break;
		case "editor":
			game=new EditorState();	
			break;
		case "mygame":
			game=new OwnGameState();	
			break;
		case "exit":
			scanner.close();
			System.exit(0);
			break;
		}
		
		game.start();
	}
	
}
