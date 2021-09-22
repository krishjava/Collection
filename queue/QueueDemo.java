package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add(10);
		q.add(2);
		q.add(3);
		q.add(9);
		q.add(7);
		q.add(1);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.peek());
		q.removeAll(q);
		System.out.println("Element "+q.peek());
	}

}
