package a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DictionaryUi {

	public static void main(String[] args) {
		DictionaryUi ui = new DictionaryUi();
		ui.createAndShowView();
	}

	// model - business logic
	private Dictionary dictionary = new Dictionary();

	public void createAndShowView() {
		JFrame fr = new JFrame("Dictionary");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(100, 100, 500, 300);
		fr.setLayout(null); // no layout

		JTextField tfEntry = new JTextField();
		tfEntry.setBounds(10, 10, 200, 25);
		fr.add(tfEntry);

		JTextArea taDef = new JTextArea();
		taDef.setBounds(10, 40, 200, 200);
		taDef.setLineWrap(true);
		fr.add(taDef);

		JButton btAdd = new JButton("Add Entry");
		btAdd.setBounds(250, 10, 200, 25);
		fr.add(btAdd);

		btAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String entry = tfEntry.getText();
				String def = taDef.getText();
				dictionary.addEntry(entry, def);
				System.out.println(dictionary.getMap());

			}
		});

		JButton btShow = new JButton("show definition");
		btShow.setBounds(250, 40, 200, 25);
		fr.add(btShow);

		fr.setVisible(true);
	}

}
