package editor;

import java.util.ArrayList;

public class EncounterEditor {

	private static ArrayList<SimpleEncounter> encounterList;
	
	public static void init(){
		encounterList = new ArrayList<SimpleEncounter>();
	}
	
	public static void addEncounter(String title, String text, ArrayList<String> choices, ArrayList<String> results,String rightOne, String errorText){
		SimpleEncounter temp=new SimpleEncounter(title,text,choices,results,rightOne, errorText);
		encounterList.add(temp);
	}
	
	public static void addEncounter(SimpleEncounter simple){
		encounterList.add(simple);
	}
	
	public static void removeEncounter(int index){
		if(index==0 || encounterList.get(index-1)==null)
			System.out.println("Oops. Looks like there is nothing there.");
		else
		{
			encounterList.remove(index-1);
			System.out.println("Encounter deleted");
		}
			
	}
	
	public static void printEncounters(){
		System.out.println("===================");
		System.out.println("Existing Encounters");
		
		int outputCounter=1;
		for(SimpleEncounter encounter : getEncounters()){
			System.out.println("Encounter "+outputCounter);
			encounter.printEncounter();
			outputCounter++;
		}
		System.out.println("===================");
	}
	
	public static ArrayList<SimpleEncounter> getEncounters(){
		return encounterList;
	}

	public static SimpleEncounter getEncounter(int index){
		return encounterList.get(index);
	}
}

	
