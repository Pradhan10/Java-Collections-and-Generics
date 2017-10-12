import java.util.*;


public class TheProblem {

	public static void main(String args[]) {
	
		/*
		* Say you wish to process lists. Some may be lists of integers, others lists of strings, and
		* yet others lists of lists of strings. In Java before generics this is simple. You can represent
		* all three by the same class, called List , which has elements of class Object :
		* list of integers List
		* list of strings List
		* list of lists of strings List 
		*/ 

		final int max = 5;
		
		List integerList = new ArrayList<Object>();
		List stringList = new ArrayList<Object>();
		List listList = new ArrayList<Object>();
		
		//Add elements to integerList 
		// NOTE THAT EVEN THOUGH WE ARE ADDING THE WRONG TYPE THERE IS NO CE.
			integerList.add("Generics");
			integerList.add("is");
			integerList.add("Fun");
			
		//Add elements to stringList
			stringList.add("12312312");
			stringList.add("33");
			stringList.add("76452");
		
		//Add elements to list of lists of strings
			listList.add(integerList);
			listList.add(stringList);
		
			
		for(Object aName : listList) {
			
			System.out.println(aName);
			
		}
	}
}
