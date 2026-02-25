package sandbox;

import java.util.ArrayList;

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
	
	/* DESCRIPTION: list all names in ArrayList as a String
	 * PARAMETERS: ArrayList<String> x
	 * RETURN TYPE: String
	 */
	public static String list(ArrayList<String> x) {
		
		String studentString = "";
		
		for (int i=0; i<x.size(); i++) {
			
			studentString = studentString + x.get(i) + "\n";
		}
		
		return studentString;
		
	}
}
