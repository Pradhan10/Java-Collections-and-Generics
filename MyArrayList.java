import java.util.*;

/*
* Author : Pradhan Rishi Sharma
* Date : 10/10/17
*/



public class MyArrayList {

   public static void main(String args[]) {
      // create an array list
      ArrayList al = new ArrayList();
      System.out.println("Initial size of ArrayList: " + al.size());

      // add elements to the array list
      al.add("H");
      al.add("E");
      al.add("L");
      al.add("L");
      al.add("O");
      al.add("World");
      al.add(1, "e");
      System.out.println("Size of ArrayList after additions: " + al.size());

      // display the array list
      System.out.println("Contents of ArrayList: " + al);

      // Remove elements from the array list
      al.remove("L");
      al.remove(0);
      System.out.println("Size of ArrayList after deletions: " + al.size());
      System.out.println("Contents of ArrayList: " + al);
   }
}
