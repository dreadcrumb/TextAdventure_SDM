package editor;

import java.util.ArrayList;

public class SimpleEncounter {

	String title,text,errorText,rightOne;
	//Choices and results are stored
	ArrayList<ArrayList<String>> choices;
	
	
	public SimpleEncounter(String title, String text, ArrayList<String> decisions, ArrayList<String> results,String rightOne, String errorText){
		this.title=title;
		this.text=text;
		this.choices=new ArrayList<ArrayList<String>>();
		this.choices.add(decisions);
		this.choices.add(results);
		this.rightOne=rightOne;
		this.errorText=errorText;
	}


	public  void printEncounter() {
		System.out.println("Encounter Title: "+this.title);
		System.out.println("Encounter Text: "+this.text);
		System.out.println("Encounter Choices: ");
		for(String text : this.choices.get(0)){
			int counter=1;
			System.out.println("Choice: "+counter +": "+text);
		}
		System.out.println("Encounter Results in matching order to choices: ");
		for(String text : this.choices.get(1)){
			int counter=1;
			System.out.println("Result: "+counter +": "+text);
		}
		System.out.println("The right one to pick: "+this.rightOne);
		System.out.println("Output if the wrong one gets picked: " + this.errorText);
		
	}
}
