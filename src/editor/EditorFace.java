package editor;

import java.util.ArrayList;
import java.util.Scanner;

import encounters.standardEncounter;
import main.Main;

public class EditorFace {

	static Scanner scanner = new Scanner(System.in);
	static String input;

	public static void main(String[] args) {
		System.out
				.println("Welcome to the Editor. Let's create your own adventure!");

		String input;
		while (true) {
			System.out
					.println("What do you want to do? Type in the command in the brackets to proceed.");
			System.out.println("");
			System.out.println("[New] for a new game.");
			System.out.println("[Edit] to edit an existing game.");
			System.out.println("[Exit] to get back to the menu screen");

			input = scanner.nextLine();
			if (input.toLowerCase().equals("exit"))
				Main.main(null);

			if (input.toLowerCase().equals("new")) {
				create();
			} else if (input.toLowerCase().equals("edit")) {
				if(EncounterEditor.getEncounters()==null)
				{
					System.out.println("Create some encounters before you edit them!");
					break;
				}
				edit();
			} else {
				System.out
						.println("Oops. That's not a valid command. Try again.");
			}
		}
	}

	public static void create() {
		System.out
				.println("Welcome to the create Screen of your own adventure. Type [create] to create some encounters and add them to your existing adventure. Type [back] to get back to the edit menu.");

		

		while (true) {
			input = scanner.nextLine().toLowerCase();
			if (input.equals("back"))
				EditorFace.main(null);
			if (input.equals("create")) {
				String title, text, rightOne, errorText;
				ArrayList<String> decisions, results;
				decisions = new ArrayList<String>();
				results = new ArrayList<String>();
				System.out.println("Let's start.");
				System.out.println("What's the title of your encounter?");
				title = scanner.nextLine();
				System.out.println("What's the text of your encounter?");
				text = scanner.nextLine();
				System.out
						.println("Your player has 3 decisions he can make.What are those?");
				System.out.println("Decision A:");
				decisions.add(scanner.nextLine());
				System.out.println("Decision B:");
				decisions.add(scanner.nextLine());
				System.out.println("Decision C:");
				decisions.add(scanner.nextLine());

				System.out
						.println("Your player gets 3 results from his decisions.What are those?");
				System.out.println("Result of decision A:");
				results.add(scanner.nextLine());
				System.out.println("Result of decision B:");
				results.add(scanner.nextLine());
				System.out.println("Result of decision C:");
				results.add(scanner.nextLine());

				System.out
						.println("Which one is the right one to proceed? A, B or C?:");
				rightOne = standardEncounter.getAnswer();
				
				System.out
				.println("What is the Text that shows if the player chose wrong?");
				errorText = scanner.nextLine();
				
				SimpleEncounter temp = new SimpleEncounter(title, text, decisions, results, rightOne, errorText);
				
				System.out.println("Your input: ");
				temp.printEncounter();
				
				System.out.println("Do you want to save this encounter? Y/N");
				Boolean des = standardEncounter.askYN();
				if(des){
					if(EncounterEditor.getEncounters()==null)
						EncounterEditor.init();
					
					EncounterEditor.addEncounter(temp);
				}
				else{
					System.out.println("Encounter not saved.");
				}
				
			} else {
				System.out
						.println("Oops. That's not a valid command. Try again.");
			}
			System.out
			.println("Encounter created");
			System.out
					.println("Do you want to create another? Type [create] or type [back] to get back to the editor menu");
		}

	}

	public static void edit() {
		System.out
		.println("Welcome to the edit Screen of your own adventure. Here you can delete encounters that you dont like anymore.");
		System.out.println("Your current encounters are: ");
		EncounterEditor.printEncounters();
		
		System.out.println("Type in the number of the encounter you want to delete");
	    while (!scanner.hasNextInt()){
	    	System.out.println("Please type in a valid number");
	    	scanner.next();
	    }
	    int num1 = scanner.nextInt();
	    EncounterEditor.removeEncounter(num1);
		
		
	}

	public static void exit() {
		Main.main(null);
	}

}
