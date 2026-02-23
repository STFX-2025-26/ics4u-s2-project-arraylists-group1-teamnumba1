import java.util.ArrayList;

/*
 * temporary class
 */
public class AddMethod {
	
	/*
	 * Debug, pass String name for test cases.
	 * Prints appended ArrayList.
	 */
	public static void main(String[] args) {
			
		if (args[0].isEmpty()) {
			
			System.out.println("Invalid cli input! Pass name of student as String!");
			return;
			
		}
		
		ArrayList<String> studentNames = new ArrayList<>();
		
		while (true) {
			
			add(studentNames, args[0]);
			System.out.println(studentNames);
			
			
		}
	}
	
	/**
	 * The add method appends the given first name of a student to ArrayList studentNames storing other student first names.
	 * In case the name is blank (only containing whitespace or no text at all) method returns without adding name to studentNames.
	 * Given name is striped before being appended to studentNames.
	 * @param studentNames
	 * ArrayList storing the first names of students
	 * @param name
	 * String storing the first name of a student
	 */
	public static void add(ArrayList<String> studentNames, String name) {
		
		// check if blank, if so return early
		if (name.isBlank()) return;
		
		// append name to ArrayList studentNames
		studentNames.add(name.strip());
		
	}
}
