package queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		LinkedList city=new LinkedList();
//		ad.add(null); // null not allowed 
		ad.add("krishan");
		ad.add("akash");
		ad.add("vkiash");
		
		System.out.println(ad);
		ad.addFirst("first");
		System.out.println(ad);
		System.out.println("contains akash="+ad.contains("akash"));
		city.add("jaipur");
		city.add("jodhpur");
		city.add("mumbai");
		
		System.out.println("after addding all");
		ad.addAll(city);
		System.out.println(ad);
		ad.addLast("last");
		System.out.println("contains city collection="+ad.containsAll(city));
		System.out.println();
		System.out.println("*****Iterating Element by descendingIterator()*****");
		Iterator i=ad.descendingIterator();
		while (i.hasNext()) {
			Object object = (Object) i.next();
			System.out.print(object+" ");
		}
		System.out.println("*******************    ***********************");
		System.out.println("getting first Element "+ad.getFirst());
		System.out.println("get last element "+ad.getLast());
		System.out.println("Get the Size "+ad.size());
		System.out.println("Head Element "+ad.element());
		System.out.println("Is Q empty="+ad.isEmpty());
		System.out.println("Insert element by offer() "+ad.offer("offer"));
		System.out.println(ad);
		System.out.println(ad.offerLast("offerlast"));
		System.out.println(ad);
		System.out.println("Peek Element="+ad.peek());
		System.out.println("Remove city collection "+ad.removeAll(city));
		System.out.println(ad);
		System.out.println("Remove akash="+ad.remove("ak"));
		System.out.println("Remove akash="+ad.remove("akash"));
		System.out.println(ad);
		
//		
		System.out.println("******Remove all the elements ********");
		ad.clear();
	}

}
