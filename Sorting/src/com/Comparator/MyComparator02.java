package com.Comparator;

import java.util.Comparator;

public class MyComparator02 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		//String s1=(String)o1; //only String Objects
		String s1=o1.toString();
		String s2=o2.toString();
		//1.Ascending Order
		//return s1.compareTo(s2);// [A, ABCD, BA, Q, XX, XXX]
		//2.increasing length order
		int i1=s1.length();
		int i2=s2.length();
		if(i1<i2)
			return -1;
		else if(i1>i2)         //[A, Q, BA, XX, XXX, ABCD]
			return +1;
		else
			return s1.compareTo(s2);
	}

}
