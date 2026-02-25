package sandbox;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Method class implements various methods used by GUI
 */
public class Methods {
	
	/**
	 * The add method appends the given first name of a student to ArrayList studentNames storing other student first names.
	 * In case the name is blank (only containing whitespace or no text at all) method returns without adding name to studentNames.
	 * Given name is striped before being appended to studentNames.
	 * @param studentNames
	 * ArrayList storing the first names of students
	 * @param name
	 * String storing the first name of a student
	 * @return void
	 */
	public static void add(ArrayList<String> studentNames, String name) {
		
		// check if blank, if so return early
		if (name.isBlank()) return;
		
		// append name to ArrayList studentNames
		studentNames.add(name.strip());
		
	}
	
	/* DESCRIPTION - Removes input from ArrayList
	 * PARAMETERS - String
	 * RETURN - void 
	 */

	public static void removeMethod (ArrayList<String> studentNames) {
		
		
		Scanner observer = new Scanner(System.in);
		System.out.println("Input name to remove (Case Sensitive!)");
		String search = new String();
		search = observer.nextLine(); // stores user's input as a string
		
		if (studentNames.contains(search)) { // searches the array list for user's string
			
			
			studentNames.remove(search); // if found will confirm, and display new array contents.
			
			System.out.println("\n" + "'" + search + "'" + " successfully removed!" + "\n" );
			System.out.println("New Array Contents:");
			System.out.println(studentNames);
			
			
			
		} else {
			
			System.out.println("\n Name not found"); // if the name isn't found returns name not found
			
			
		}
	}
	
}
