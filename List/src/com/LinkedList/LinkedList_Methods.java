package com.LinkedList;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList_Methods {
	public static void constructors() {
		//1.public LinkedList()
		List l=new LinkedList();
		System.out.println(l.size());//0
		l.add(1);
		Deque dq=new LinkedList();
		System.out.println(dq.size());//0
		dq.addFirst(5);
		Queue q=new LinkedList();
		System.out.println(q.size());//0
		q.offer(3);
		//2.public LinkedList(Collection<? extends E> c)
		List list=List.of(1,2,3,3,4,4,5);
		List l1=new LinkedList(list);
		System.out.println(l1.size());//7
		l1.add(15);
	}
	public static void linkFirst() {
		//private void linkFirst(E e)
		//void linkLast(E e)
		//void linkBefore(E e, Node<E> succ)
		//E unlink(Node<E> x)
		//private E unlinkFirst(Node<E> f)
		//private E unlinkLast(Node<E> l) 
		List list=List.of(6,2,3,4,5);
		LinkedList l=new LinkedList(list);
		System.out.println(l);//[6, 2, 3, 4, 5]
		System.out.println(l.size());//5
		//l.linkFirst(0);
		l.add(0, 1);
		//l.linkLast(10);
		l.addLast(10);
		System.out.println(l);//[1, 6, 2, 3, 4, 5, 10]
		l.remove(0);
		l.removeLast();
		System.out.println(l);//[6, 2, 3, 4, 5]
	}
	public static void main(String[] args) {
		//constructors();
		//linkFirst();  // not visible
	}
}
