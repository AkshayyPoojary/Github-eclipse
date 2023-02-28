package com.aurionpro.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Luffy");
		pq.add("Zoro");
		pq.add("Usopp");
		pq.add("Sanji");
		pq.add("Jimbe");
		System.out.println(pq);
		// used to retrieves, but does not remove, the head of this queue.
//		System.out.println("Retrieving the head of the PriorityQueue: " +pq.element());
		System.out.println("Retrieving the head of the PriorityQueue: " + pq.peek());

// using Iterator
		Iterator itr = pq.iterator();
		System.out.println("Elements After Iterating : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
//	used to retrieves and removes the head of this queue
		pq.remove();
		pq.poll(); // this will show 'null' if head is empty
		System.out.println("Upadted queue after removing head of queue: " + pq);
// to clear all elements from list
		pq.clear();
		System.out.println("Emplty list looks like this: " + pq);
	}
}
