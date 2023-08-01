package com.Comparable;

import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		/*interface Comparable{  //java.lang
			public int compareTo(Objcet o);
		} */
		System.out.println("a".compareTo("S"));//14
		System.out.println("G".compareTo("Z"));//-19
		System.out.println("a".compareTo("A"));//32
		System.out.println("a".compareTo("a"));//0
		System.out.println("a".compareTo(null));//RE:NPE
		//System.out.println("a".compareTo(1));//CE
	}
}
