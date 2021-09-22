package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("one");
//		t.add(null); // null not allowed
		
		Set<String> ts1 = new TreeSet<>();
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        ts1.add("C");
        System.out.println(ts1);
        
        Set<String> ts = new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        System.out.println(ts);
        
        System.out.println("Tree Set is " + ts);
        String check = "Geeks";
        System.out.println("Contains " + check + " "
                           + ts.contains(check));
        System.out.println("First Value " + ((TreeSet) ts).first());
        System.out.println("Last Value " + ((TreeSet) ts).last());
        String val = "Geek";
        System.out.println("Higher " + ((TreeSet) ts).higher(val));
        System.out.println("Lower " + ((TreeSet) ts).lower(val));
        
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");
        System.out.println("-------------Iterating----------");
        for (String value : ts)
            System.out.print(value + ", ");
        System.out.println();
        
        System.out.println("Initial TreeSet " + ts);
        ts.remove("B");
        System.out.println("After removing element " + ts);
        ((TreeSet) ts).pollFirst();
        System.out.println("After removing first " + ts);
        ((TreeSet) ts).pollLast();
        System.out.println("After removing last " + ts);
	}

}
