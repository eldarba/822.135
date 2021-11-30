package app.core.model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import app.core.exceptions.DictionaryException;

public class Dictionary {

	private Map<String, String> map = new TreeMap<>();
	private File dir = new File("files");
	private File file = new File(dir, "entries.data");

	{
		if (!dir.exists()) {
			dir.mkdirs();
		}

		loadData();

	}

	public void loadData() {

		if (file.exists()) {
			// load the data
			try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));) {
				this.map = (Map<String, String>) in.readObject();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
	}

	public void saveData() {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));) {
			out.writeObject(this.map);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addEntry(String entry, String definition) throws DictionaryException {

		if (entry == null || entry.length() == 0) {
			throw new DictionaryException("addEntry failed - empty entry");
		}

		if (map.containsKey(entry)) {
			throw new DictionaryException("addEntry failed - entry " + entry + " already exists.");
		}

		map.put(entry, definition);
	}

	public String getDefinition(String entry) {
		return map.get(entry);
	}

	public void editEntry(String entry, String definition) throws DictionaryException {

		if (entry == null || entry.length() == 0) {
			throw new DictionaryException("editEntry failed - empty entry");
		}

		if (!map.containsKey(entry)) {
			throw new DictionaryException("editEntry failed - entry " + entry + " NOT exists.");
		}

		map.replace(entry, definition);
	}

	public String deleteEntry(String entry) {
		return map.remove(entry);
	}

	public Set<String> getAllEntriesSorted() {
		return new TreeSet<String>(this.map.keySet());
	}
}
