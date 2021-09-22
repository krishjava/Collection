package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> lm=new LinkedHashMap<String, String>();
		lm.put("004", "krishan");
		lm.put("002", "akash");
		lm.put("001", "sanjay");
		System.out.println(lm);
		Set<String> s=lm.keySet();
		Iterator<String> r=s.iterator();
		
		while (r.hasNext()) {
			String string = (String) r.next();
			System.out.println("Key : "+string);
		}
		lm.remove("002");
		System.out.println(lm);
	}

}
