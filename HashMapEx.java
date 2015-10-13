package hashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	   public static void main(String[] args)
	   {
		   HashMap<Integer, Toy2> toybox = new HashMap<Integer, Toy2>();
	      System.out.println("Enter list entries, when prompted.");
	      boolean done = false;
	      int key = 0;
	      double number;
	      String name;
	      int answer;
	      String swag;
	      Scanner keyboard = new Scanner(System.in);

	      while (!done)
	      {
	          System.out.print("Input a key: ");
	          key = keyboard.nextInt();
	          keyboard.nextLine();
	          System.out.print("Input a name: ");
	          name = keyboard.nextLine();
	          System.out.print("Inpuat a number: ");
	          number = keyboard.nextDouble();
	          keyboard.nextLine();
	          if(toybox.containsKey(key))
	        		  {
	        	  		System.out.println("ERROR");
	        		  }
	          else
	          toybox.put(key, new Toy2(name, number));

	          System.out.print("More items for the list? ");
	          swag = keyboard.nextLine( );
	          if (!(swag).equalsIgnoreCase("yes"))
	          {
	                done = true;
	          }
	      }

	      System.out.println("The list contains:");
	    
	           System.out.println(toybox);
	      
	      System.out.println("A key to search: ");
	      answer = keyboard.nextInt();
	      keyboard.nextLine();
	      
	      if(toybox.containsKey(answer)){
	          System.out.println("The key " + answer + " has the value " +
	        		  	toybox.get(answer));
	      }
	      else
	      {
	          System.out.println(answer + " is not in the hashMap.");
	      }
	      
	      System.out.println("An item to remove: ");
	      answer = keyboard.nextInt();
	      keyboard.nextLine();
	      if(toybox.containsKey(answer)){
	          System.out.println(answer + " is removed from the list.");
	          toybox.remove(answer);
	      }
	      else
	      {
	          System.out.println(answer + " cannot be removed.");
	      }
	     
	      
	      System.out.println("The map contains: ");
	          System.out.println(toybox);
	      
	      
	   }
}
