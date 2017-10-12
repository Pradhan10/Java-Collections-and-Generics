import java.util.*;


public class TheSolution {

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
		
		List<Integer> integerList = new ArrayList<Integer>();
		List<String> stringList = new ArrayList<String>();
		
		//Add elements to integerList	
			integerList.add(123);
			integerList.add("is"); // Notice here this line will generate compile time error, hence is type safe
			integerList.add(56);
			
		//Add elements to stringList
			stringList.add("12312312");
			stringList.add(33);		// Notice here this line will generate compile time error, hence is type safe
			stringList.add("76452");
		
		
			
		for(Object aName : integerList) {
			
			System.out.println(aName);
			
		}
	}
}
