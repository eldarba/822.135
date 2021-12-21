package a;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	private Map<String, String> map = new HashMap<>();

	public void addEntry(String entry, String definition) {
		map.put(entry, definition);
	}

	public boolean isEntryExists(String entry) {
		return map.containsKey(entry);
	}

	public String getDefinition(String entry) throws DictionaryException {
		if (isEntryExists(entry)) {
			return map.get(entry);
		} else {
			throw new DictionaryException("the entry " + entry + " not found");
		}
	}

	public boolean deleteEntry(String entry) {
		return map.remove(entry) != null;
	}

	public Map<String, String> getMap() {
		return map;
	}

}
