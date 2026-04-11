package priorityqueue;

import java.util.PriorityQueue;

public class Retainall_method {
	public static void main(String[] args) {
		PriorityQueue sm=new PriorityQueue();
		PriorityQueue sm1=new PriorityQueue();
		sm1.add(10);
		sm1.add(20);
		sm.add(30);
		sm.add(50);
		sm1.add(20);
		sm.add(10);
		sm.add(20);
		
		System.out.println(sm);
		System.out.println(sm1);
		System.out.println(sm1.retainAll(sm));
		System.out.println(sm1);
		
}
}