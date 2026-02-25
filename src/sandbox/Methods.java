package sandbox;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Method class implements various methods used by GUI
 */
public class Methods {
	
	/**
	 * The add method appends the given first name in a JTextField jtf to ArrayList studentNames storing other student first names.
	 * In case the name is blank (only containing whitespace or no text at all) method returns without adding name to studentNames and displays JOptionPane error.
	 * Given name is striped before being appended to studentNames.
	 * @param studentNames
	 * ArrayList storing the first names of students
	 * @param jtf
	 * JTextField storing the first name of a student
	 * @return void
	 */
	public static void add(ArrayList<String> studentNames, JTextField jtf) {
		
		// check if null, if so return early
		if (jtf == null) { 
			return;
		}
		
		// assign name to String
		String name = jtf.getText();
		
		// check if blank, if so return early and display error
		if (name.isBlank()) { 
			JOptionPane.showMessageDialog(null, "Error! Name text field is blank!");
			return;
		}
		
		// append name to ArrayList studentNames
		studentNames.add(name.strip());

	}
	
	/**
	 * The exit method exits and disposes of the GUI and JRE in use.
	 * @return void
	 */
	public static void exit() {
		System.exit(0);
	}
}
