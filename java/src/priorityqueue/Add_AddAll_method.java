package priorityqueue;

import java.util.PriorityQueue;

public class Add_AddAll_method {
	public static void main(String[] args) {
		PriorityQueue sm=new PriorityQueue();
		PriorityQueue sm1=new PriorityQueue();
		sm1.add(10);
		sm1.add(20);
		sm.add(30);
		sm.add(50);
		System.out.println(sm1);
		System.out.println(sm);
//		sm.add(sm1);
//		System.out.println(sm1);
//		System.out.println(sm);
		
		System.out.println(sm.addAll(sm1));
		System.out.println(sm);
	}
}
