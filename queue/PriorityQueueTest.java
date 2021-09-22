package queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		Queue numQueue=new PriorityQueue();
//		numQueue.add(9); 
//        numQueue.add(5); 
//        numQueue.add(6); 
//        numQueue.add(1); 
//        numQueue.add(3);
//        numQueue.add(5); 
//		numQueue.add(1); 
//		Integer val = null;
//		System.out.println("poll "+numQueue.poll());
//		System.out.println(numQueue);
//		System.out.println("poll "+numQueue.poll());
//		System.out.println(numQueue);
//		System.out.println("poll "+numQueue.poll());
//		System.out.println(numQueue);
//		System.out.println("poll "+numQueue.poll());
//		System.out.println(numQueue);
//		Iterator i=numQueue.iterator();
//		while (i.hasNext()) {
//			Integer object = (Integer) i.next();
//			System.out.println(object);
//		}
//        while( (val = (Integer) numQueue.poll()) != null) {
//            System.out.print(val + " ");
//        }
        numQueue.add("One"); 
        numQueue.add("Seven"); 
        numQueue.add("Three"); 
        numQueue.add("Eleven");
        numQueue.add("Nine"); 
        numQueue.add("Apple");
        System.out.println(numQueue);
//        System.out.println("One ascii"+TestUtils.getAscii("One"));
//        System.out.println("Seven ascii"+TestUtils.getAscii("Seven"));
//        System.out.println("Three ascii"+TestUtils.getAscii("Three"));
//        System.out.println("Eleven ascii"+TestUtils.getAscii("Eleven"));
//        System.out.println("Nine ascii"+TestUtils.getAscii("Nine"));
//        System.out.println("Apple ascii"+TestUtils.getAscii("Apple"));
        System.out.println("Peek Element "+numQueue.peek());
        System.out.println("poll() Element "+numQueue.poll());
        System.out.println("Peek Element after poll "+numQueue.peek());
        numQueue.remove("One");
        
        System.out.println(numQueue);
        System.out.println(numQueue.element());
        System.out.println(numQueue);
        
        Iterator iterator = numQueue.iterator();
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
	}

}
