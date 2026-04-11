package priorityqueue;

import java.util.PriorityQueue;

public class Remove_RemoveALL_method {
	public static void main(String[] args) {
		PriorityQueue sm=new PriorityQueue();
		PriorityQueue sm1=new PriorityQueue();
		PriorityQueue sm2=new PriorityQueue();
		sm1.add(10);
		sm1.add(20);
		sm1.add(30);
		sm1.add(50);
		sm.add(30);
		sm.add(50);
		sm.remove(10);
		System.out.println(sm1);
		System.out.println(sm);
//		sm.add(sm1);
//		System.out.println(sm1);
//		System.out.println(sm);
		sm2.add('a');
		sm2.add('b');
		sm2.add('c');
		System.out.println(sm2);
		sm2.remove('a');
		System.out.println(sm2);
		System.out.println(sm1.removeAll(sm));
		System.out.println(sm1);
		System.out.println(sm.removeAll(sm1));
		System.out.println(sm);
	}
}
