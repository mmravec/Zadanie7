import java.util.*;

public class TabulkaTrieda implements FrequencyTable {

	private List<Record> table = new ArrayList<>();

	private class Record {
		private String word;
		private int count;

		public Record(String word, int count) {
			this.word = word;
			this.count = count;
		}

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
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
	public int getCount(String word) {
		for (Record zaznam : table) {
			if (zaznam.getWord() == word)
				return zaznam.getCount();
		}
		return 0;

	}

	@Override
	public void add(String word) {
		boolean a = true;
		for (Record zaznam : table) {
			if (zaznam.getWord().equals(word)) {
				zaznam.setCount(zaznam.getCount() + 1);
				a = false;
			}
		}
		if (a)
			table.add(new Record(word, 1));
	}

	@Override
	public String[] getWords() {
		String[] pole = new String[table.size()];
		int i = 0;
		for (Record zaznam : table) {
			pole[i] = zaznam.getWord();
			i++;
		}
		return pole;
	}

	@Override
	public String getTheMostFrequentWord() {
		String slovo = new String();
		int pom = 0;
		for (Record zaznam : table) {
			if (pom < zaznam.getCount()) {
				slovo = zaznam.getWord();
				pom = zaznam.getCount();
			}
		}
		return slovo;
	}
}
