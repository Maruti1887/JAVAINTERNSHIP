package priorityqueue;

import java.util.PriorityQueue;

public class Poll_peek_method {
	public static void main(String[] args) {
		PriorityQueue sm=new PriorityQueue();
		PriorityQueue sm1=new PriorityQueue();
		sm1.add(10);
		sm1.add(20);
		sm1.add(30);
		sm1.add(40);
		sm.add(30);
		sm.add(50);
		System.out.println(sm1);
		System.out.println(sm);
		System.out.println(sm.peek());
		System.out.println(sm);
		
		
	}
}
