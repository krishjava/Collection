package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();
		s.add(null);
		s.add("one");
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("five");
		System.out.println(s);
//		Iteration by iterator
		Iterator i= s.iterator();
		while (i.hasNext()) {
			Object object = (Object) i.next();
			System.out.println(object);
		}
		
//		define no of buckets 
		HashSet sh=new HashSet(2);
		sh.add(s);
		System.out.println(sh);
		sh.add("take");
		sh.add("final");
		System.out.println(sh);
		
//		define no of buckets and loadFactor
		HashSet sh1=new HashSet(2,0.80f);
		sh1.add(sh);
		System.out.println(sh1);
		sh1.add("Factor");
		sh1.add("Load");
		System.out.println(sh1);
	}

}


