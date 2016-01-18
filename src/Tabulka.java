import java.util.*;

public class Tabulka implements FrequencyTable {
	Map<String, Integer> table = new HashMap<>();

	public Tabulka() {

	}

	@Override
	public void clearTable() {
		table.clear();
	}

	@Override
	public int getNumberOfWords() {
		return table.size();
	}

	@Override
	public int getCount(String words) {
		if (table.containsKey(words)) {
			return table.get(words);
		}
		return 0;
	}

	@Override
	public void add(String word) {
		if (table.containsKey(word)) {
			table.put(word, table.get(word) + 1);
		} else {
			table.put(word, 1);
		}
	}

	@Override
	public String[] getWords() {
		String[] array = new String[table.size()];
		int count = 0;
		for (Map.Entry<String, Integer> a : table.entrySet()) {
			String key = a.getKey();
			array[count] = key;
			count++;
		}
		return array;
	}

	@Override
	public String getTheMostFrequentWord() {
		String frequentWord = new String();
		Integer conut = 0;
		for (Map.Entry<String, Integer> a : table.entrySet()) {
			Integer value = a.getValue();
			if (conut < value) {
				frequentWord = a.getKey();
			}
		}
		return frequentWord;
	}

}
