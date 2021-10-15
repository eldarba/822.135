package a.input;

import javax.swing.JOptionPane;


public class Demo1Input {

	public static void main(String[] args) {
		
		// option 1 - input dialog
		String name = JOptionPane.showInputDialog("Enter name");
		
		// print the input
		System.out.println(name);
		

	}

}
