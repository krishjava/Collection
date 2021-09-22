package map;

import java.util.Hashtable;
import java.util.Iterator;

class Word{
	String animal;
	Word(String a){
		animal=a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return animal;
	}
}

public class FailFastHashTable {

	public static void main(String[] args) {
		Hashtable<Word, String> table = new Hashtable<Word, String>();
		table.put(new Word("cat"), "an animal");
		table.put(new Word("dog"), "another animal");
		Iterator<Word> an=table.keySet().iterator();
		
		while (an.hasNext()) {
		    Word key = an.next();
		    table.put(new Word("cow"), "bhoooou");
		    System.out.println(key);
		}
	}

}
