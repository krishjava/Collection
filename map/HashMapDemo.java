package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> m=new HashMap<String,String>();
		System.out.println("Size : "+m.size());
		System.out.println("Empty : "+m.isEmpty());
		m.put(null, null);
		m.put(null, "Nunnble");
		m.put("001", "krishan");
		m.put("004", "akash");
		m.put("002", "vikash");
		m.put("001", "Lokesh"); // overrided with new 
		System.out.println("Size : "+m.size());
		System.out.println("Empty : "+m.isEmpty());
		System.out.println("001 key Contains : "+m.containsKey("001"));
		System.out.println(m);
		System.out.println("---------Get all Keys-------");
		Set<String> s=m.keySet();
		Iterator<String> i= s.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(string);
		}
		System.out.println("---------Get all Values-------");
		Collection c=m.values();
		Iterator<String> iv= c.iterator();
		while (iv.hasNext()) {
			String string = (String) iv.next();
			System.out.println(string);
		}
//		System.out.println(m.remove("001"));
//		System.out.println(m);
		System.out.println("Get Value at 004 : "+m.get("004"));
		System.out.println("--------Get Entries-------");
		Set en= m.entrySet();
		Iterator ien=en.iterator();
		while (ien.hasNext()) {
			Map.Entry me=(Map.Entry)ien.next();
			System.out.println("Key : "+me.getKey()+" : "+me.getValue());
			
		}
	}

}
