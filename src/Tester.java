
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyTable ft = new TabulkaTrieda();
	    ft.add("vijem");
	    
	    String s = "vijem vijem vienok z prvých púpavienok vtom do môjho vienka priletela lienka ozdobila vienok z prvých púpavienok";
	    String[] words = s.split(" ");
	    
	    for (int i = 0; i < words.length; i++) {
	      ft.add(words[i]);  
	    }
	    System.out.println("-ocakavam cislo 12");
	    System.out.println(ft.getNumberOfWords());
	    
	    System.out.println("-ocakavam slovo vijem");
	    System.out.println(ft.getTheMostFrequentWord());
	    
	    System.out.println("-ocakavam cislo 3");
	    System.out.println(ft.getCount("vijem"));
	    
	    System.out.println("-ocakavam cislo 0 - tu nesmiem vidiet vynimku");
	    System.out.println(ft.getCount("vijeme"));
	    
	    System.out.println("-ocakavam 12 riadkov so slovom a za nim pocet (7x cislo 1, 4x cislo 2, 1x cislo 3)");
	    for (String string : ft.getWords()) {
	      System.out.println(string + " " + ft.getCount(string));
	    }
	    ft.clearTable();
	    System.out.println("-ocakavam cislo 0");
	    System.out.println(ft.getNumberOfWords());
	    System.out.println("-ocakavam prazdny retazec a v dalsom riadku cislo nula");
	    System.out.println(ft.getTheMostFrequentWord()); 
	    System.out.println(ft.getTheMostFrequentWord().length());
	    for (int i = 0; i < 11; i++) {
	      ft.add("ok");
	    }
	    System.out.println("-ocakavam cislo 11");
	    System.out.println(ft.getCount(ft.getTheMostFrequentWord()));
	        
	  
	}

}
