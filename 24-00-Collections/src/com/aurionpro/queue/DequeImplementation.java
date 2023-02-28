package com.aurionpro.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeImplementation {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(11);
		q.add(21);
		q.add(31);
		q.add(41);
		System.out.println("Queue elements: " + q);
		q.remove(21); // using specific element
		System.out.println("Removing specific element from Queue: " + q);
		System.out.println("Retriving head element from Queue: " + q.peek());
		q.clear();
		System.out.println("Emplty list looks like this: " + q);
//------------------------------------------------------------------------------------------------------------
		Deque<String> dq = new ArrayDeque<String>();
		dq.offerLast("akshay");
		dq.offer("Toheed");
		dq.add("Mohan");
		dq.add("Rahul");
		dq.offerFirst("Aditya");
		dq.add("Abhishek");
		System.out.println(dq);
// Advanced for-loop
		for (String d : dq) {
			System.out.println(d + " ");
		}
// to remove First element and from last 
		dq.pollFirst();
		dq.pollLast();
		System.out.println("Updated list: " + dq);
//	used to retrieve, but does not remove, the head of this deque
		dq.peek();
//		dq.peekFirst();       // to retrieve from head of deque
//		dq.peekLast();    // to retrieve from head of deque
		System.out.println("Retrieving the head of the deque: " + dq);
// used to retrieve and removes the head of this deque
		dq.poll();
		System.out.println("Removing the head of the deque: " + dq);
// to clear all elements from list
		dq.clear();
		System.out.println("Emplty list looks like this: " + dq);
	}
}
