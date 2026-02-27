package sandbox;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private ArrayList<String> studentNames = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel titleLabel = new JLabel("Student Records");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(10, 11, 414, 14);
		frame.getContentPane().add(titleLabel);
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setBounds(10, 35, 46, 14);
		frame.getContentPane().add(nameLabel);
		
		JTextField textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(66, 32, 358, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 60, 315, 190);
		frame.getContentPane().add(textArea);
		
		// buttons
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(e -> Methods.add(studentNames, textField));
		btnAdd.setBounds(335, 60, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(e -> Methods.remove(studentNames, textField));
		btnRemove.setBounds(335, 94, 89, 23);
		frame.getContentPane().add(btnRemove);
		
		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(e -> Methods.sort(studentNames));
		btnSort.setBounds(335, 128, 89, 23);
		frame.getContentPane().add(btnSort);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(e -> Methods.exit());
		btnExit.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnList = new JButton("List");
		btnList.addActionListener(e -> Methods.list(studentNames, textArea));
		btnList.setBounds(335, 162, 89, 23);
		frame.getContentPane().add(btnList);
		
	}
}
