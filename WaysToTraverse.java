import java.util.*;


public class WaysToTraverse {

	public static void main(String args[]) {
		
		List<String> listNames = new ArrayList<>();
		 
		listNames.add("Orissa");
		listNames.add("Kerala");
		listNames.add("Andhra Pradesh");
		listNames.add("Chattisgarh");
		listNames.add("Madhya Pradesh");
		
		/* METHOD 1
		 * The classic for loop way of iteration 
		 */
		System.out.println("Method 1");
		for (int i = 0; i < listNames.size(); i++) {
		    String aName = listNames.get(i);
		    System.out.println(aName);
		}
		System.out.println();
		/* METHOD 2
		 * The Iterator Method 
		 */
		System.out.println("Method 2");
		Iterator<String> iterator = listNames.iterator();
		 
		while (iterator.hasNext()) {
		    String aName = iterator.next();
		    System.out.println(aName);
		}
		System.out.println();
		/* METHOD 3
		 * The Enhanced For Loop ( forEach loop )
		 */
		System.out.println("Method 3");
		for (String aName : listNames) {
		    System.out.println(aName);
		}
		System.out.println();
		
		/* METHOD 4
		 * The Enhanced For Loop ( forEach loop ) with Lambda Expression 
		 */		
		System.out.println("Method 4");
		listNames.forEach(name -> System.out.println(name));
		System.out.println();
		
		/* One issue with anonymous classes is that if the implementation of your anonymous class is very simple, 
		 * such as an interface that contains only one method, then the syntax of anonymous classes may seem unwieldy and unclear.
		 * In these cases, you're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone clicks a button. 
		 * Lambda expressions enable you to do this, to treat functionality as method argument, or code as data.*/
		
	}
	
	
}
