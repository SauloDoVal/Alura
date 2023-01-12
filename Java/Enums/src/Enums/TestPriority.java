package Enums;

public class TestPriority {

	public static void main(String[] args) {
		
		
		//Priority pMin =  new Priority(); //That is wrong, you cannot instantiate a Enum.  
		
		Priority pMin =  Priority.MIN;
		Priority pMax =  Priority.MAX;
		
		
		
		//enums have already some methods created, like .name, that give me the name of the Enum in question
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		
		//And .ordinal, that give me the order of the objects created. Starting with 0...
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		
		//Now using the method ".getValue" that I have created myself at the ENUM Priority
		
		System.out.println(pMin.getValue());
		System.out.println(pMax.getValue());
		
		
		
		
	}
	
	
}
