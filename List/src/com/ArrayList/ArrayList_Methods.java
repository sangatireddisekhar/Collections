package com.ArrayList;

import java.util.ArrayList;
import java.util.Set;


public class ArrayList_Methods {
	public static void noarg() {
		ArrayList al=new ArrayList();
		System.out.println(al+" + "+al.size());//[] + 0
		al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);al.add(7);
		System.out.println(al+" + "+al.size());//[1, 2, 3, 4, 5, 6, 7] + 7
	}
	public static void intarg() {
		ArrayList al=new ArrayList(50);
		System.out.println(al+" + "+al.size());//[] + 0
		al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);al.add(7);
		System.out.println(al+" + "+al.size());//[1, 2, 3, 4, 5, 6, 7] + 7
	}
	public static void collectionarg() {
  		Set s=Set.of("ab",1,2,3,4,7);
		ArrayList al=new ArrayList(s);
		System.out.println(al+" + "+al.size());//[1, 2, 3, 4, 7, ab] + 6
		al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);al.add(7);
		System.out.println(al+" + "+al.size());//[1, 2, 3, 4, 7, ab, 1, 2, 3, 4, 5, 6, 7] + 13
	}
	public static void main(String[] args) {
		//noarg();
		//intarg();
		//collectionarg();
		
		methods();
	}
	private static void methods() {
		ArrayList al=new ArrayList();
		System.out.println(al+" + "+al.size());//[] + 0
		al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);al.add(7);
		System.out.println(al+" + "+al.size());//[1, 2, 3, 4, 5, 6, 7] + 7
		// public void trimToSize() 
		al.trimToSize();
		System.out.println(al+" + "+al.size());//[1, 2, 3, 4, 5, 6, 7] + 7
		//public void ensureCapacity(int minCapacity)
		al.ensureCapacity(50);
		System.out.println(al+" + "+al.size());//[1, 2, 3, 4, 5, 6, 7] + 7
		//protected void removeRange(int fromIndex, int toIndex)
		//al.removeRange(3,6); //CE:
	}
}
