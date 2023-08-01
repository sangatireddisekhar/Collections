package com.Comparator;

import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//TreeSet t=new TreeSet();//[0, 5, 10, 15, 20]
		TreeSet t=new TreeSet(new MyComparator01());//[20, 15, 10, 5, 0]
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}
