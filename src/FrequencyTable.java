
public interface FrequencyTable {
	 /**
	 * vymaze frekvencnu tabulku
	 */
	 public void clearTable();
	 /**
	 * pre zadane slovo vrati jeho pocet vyskytov
	 * 
	 * @param word
	 * akekolvek slovo. Predpoklada korektny vstup - jedno slovo bez
	 * medzier. Toto slovo sa nemusi nachadzat v tabulke.
	 * @return pocet vyskytov v tabulke pre dane slovo alebo 0 ak sa tam slovo
	 * nenachadza
	 */
	 public int getCount(String word);
	 /**
	 * prida jeden vyskyt daneho slova. Ak sa slovo nenachadza v tabulke tak ho
	 * prida. Ak sa nachadza, tak zvysi jeho pocet vyskytov o jeden vyskyt.
	 * 
	 * @param word
	 * akykolvek retazec bez medzier
	 */
	 public void add(String word);
	 /**
	 * vrati celkovy pocet slov v tabulke
	 * 
	 * @return pocet slov v tabulke
	 */
	 public int getNumberOfWords();
	 /**
	 * vrati pole slov ktore sa nachadzaju v tabulke
	 * 
	 * @return pole stringov. Ak je tabulka prazdna nech vrati pole dlzky 0.
	 */
	 public String[] getWords();
	 /**
	 * najde najfrekventovanejsie slovo v tabulke. Ak je viac takych slov, nech
	 * vrati ktorekolvek z nich.
	 * 
	 * @return slovo ktore ma najviac vyskytov, ak je tabulka prazdna nech vrati
	 * prazdny retazec
	 */
	 public String getTheMostFrequentWord();

}
