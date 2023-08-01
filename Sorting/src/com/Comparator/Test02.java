package com.Comparator;

import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator02());
		t.add("A");
		t.add("BA");
		t.add("XXX");
		t.add("XX");
		t.add("BA");
		t.add(new StringBuffer("ABCD"));
		t.add(new StringBuffer("Q"));
		System.out.println(t);
	}
}
