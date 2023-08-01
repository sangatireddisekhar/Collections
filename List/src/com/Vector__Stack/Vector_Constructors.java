package com.Vector__Stack;

import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;

public class Vector_Constructors {
	public static void noarg() {
		//public Vector()
		Vector v=new Vector();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.size()+" + "+v.capacity());//10 + 10
		System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		v.add(10);
		System.out.println(v.size()+" + "+v.capacity());//11 + 20
		//newCapacity= 2 * oldCapacity 
		System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}
	public static void intarg() {
		//public Vector(int initialCapacity)
		Vector v=new Vector(50);
		for (int i = 0; i < 50; i++) {
			v.addElement(i);
		}
		System.out.println(v.size()+" + "+v.capacity());//50 + 50
		System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9.....]
		v.add(50);
		//newCapacity= 2 * oldCapacity 
		System.out.println(v.size()+" + "+v.capacity());//51 + 100
		System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10....]
	}
	public static void intarg1() {
		//public Vector(int initialCapacity, int capacityIncrement) 
		Vector v=new Vector(5,6);
		for (int i = 0; i < 5; i++) {
			v.addElement(i);
		}
		System.out.println(v.size()+" + "+v.capacity());//5 + 5
		System.out.println(v);//[0, 1, 2, 3, 4]
		v.add(5);
		//newCapacity= 2 * oldCapacity 
		System.out.println(v.size()+" + "+v.capacity());//6 + 11
		System.out.println(v);//[0, 1, 2, 3, 4, 5]
	}
	public static void collectionarg() {
  		Set s=Set.of("ab",1,2,3,4,7);
  		Vector v=new Vector(s);
  		System.out.println(v.size()+" + "+v.capacity());//6 + 6
  		System.out.println(v);//[4, 7, ab, 1, 2, 3]  //order changing everytime
  		v.add(5);
  		//newCapacity= 2 * oldCapacity 
  		System.out.println(v.size()+" + "+v.capacity());//7 + 12
  		System.out.println(v);//[4, 7, ab, 1, 2, 3, 5] //order changing everytime
		
	}
	public static void main(String[] args) {
		//noarg();
		//intarg();
		//intarg1();
		//collectionarg();
	}
}
