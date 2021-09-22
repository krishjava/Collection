package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeasQueue {

	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<String>();
	    queue.offer("first");
	    queue.offer("second");
	    queue.offer("2");
	    queue.offer("1");
	    System.out.println(queue);
	    queue.poll();
	    System.out.println(queue);
	}

}
