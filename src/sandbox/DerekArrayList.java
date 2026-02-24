package sandbox;

import java.util.Scanner;
import java.util.ArrayList;

public class DerekArrayList {

	public static void main(String[] args) {
		
	
		
		
		ArrayList<String> myArrayList = new ArrayList<>();
		
		myArrayList.add("Neema");
		myArrayList.add("Bob");
		myArrayList.add("Nancy");
		myArrayList.add("Charlie");
		
		System.out.println("Array Contents: \n");
		System.out.println(myArrayList);
		
		removeMethod(myArrayList);
		
		
	}
			
	/* DESCRIPTION - Removes input from ArrayList
	 * PARAMETERS - String
	 * RETURN - void 
	 */

	public static void removeMethod (ArrayList<String> x) {
		
		
		Scanner observer = new Scanner(System.in);
		System.out.println("Input name to remove (Case Sensitive!)");
		String search = new String();
		search = observer.nextLine();
		
		if (x.contains(search)) {
			
			
			x.remove(search);
			
			System.out.println("'" + search + "'" + " successfully removed!" );
			System.out.println("New Array Contents:");
			System.out.println(x);
			
			
			
		} else {
			
			System.out.println("Name not found");
			
			
		}

		
		
	}
	
}
