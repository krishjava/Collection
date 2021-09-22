package queue;

import java.util.ArrayDeque;

public class ArrayDequeasStack {

	public static void main(String[] args) {
		ArrayDeque<String> stack=new ArrayDeque<String>();
		stack.push("first");
		stack.push("second");
		System.out.println(stack);
		System.out.println("Pop Element : "+stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
	}

}
