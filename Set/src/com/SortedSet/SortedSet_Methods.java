package com.SortedSet;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Methods {
	static SortedSet s = new TreeSet(Set.of(1,3,2,5,7,4,9));
	private static void compartor() {
		//Comparator<? super E> comparator()
		System.out.println(s.comparator());//null    if this set uses the natural ordering of its elements.
	}
	private static void first() {
		//E first()
		System.out.println(s.first());//1
	}
	private static void last() {
		//E last()
		System.out.println(s.last());//9
	}
	private static void headSet() {
		//SortedSet<E> headSet(E toElement)
		System.out.println(s.headSet(4));//[1, 2, 3]
	}
	private static void tailSet() {
		//SortedSet<E> tailSet(E fromElement)
		System.out.println(s.tailSet(5));//[5, 7, 9]
	}
	private static void subSet() {
		//SortedSet<E> subSet(E fromElement,E toElement)
		System.out.println(s.subSet(3,7));//[3, 4, 5]
	}
	public static void main(String[] args) {
		System.out.println(s);//[1, 2, 3, 4, 5, 7, 9]
		//compartor();
		//first();
		//last();
		//headSet();
		//tailSet();
		subSet();
	}
}
