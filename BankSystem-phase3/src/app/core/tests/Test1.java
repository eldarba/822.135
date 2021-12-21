package app.core.tests;

import javax.swing.JOptionPane;

import app.core.Client;
import app.core.ecxeption.BankException;

public class Test1 {

	public static void main(String[] args) {

		Client cl = new Client(101, "Yosi", 5000.5F);
		try {
			cl.withdraw(10000);
		} catch (BankException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage());
			try {
				cl.withdraw(cl.getBalance());
			} catch (BankException e1) {
				e1.printStackTrace();
			}
			// e.printStackTrace();
		}

		System.out.println("END");

	}

}
