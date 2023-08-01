package com.Comparator;

import java.util.Comparator;

public class MyComparator01 implements Comparator {
   /* interface Comparator{
    	public int compare(Object o1, Object o2);
    	boolean equals(Object obj);
      } */
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
	/*	if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;  */
		//1.default natural sorting order (Ascending Order)
		//return i1.compareTo(i2);//(Ascending Order) [0, 5, 10, 15, 20]
		//2
		//return -i1.compareTo(i2);//(Descending Order) [20, 15, 10, 5, 0]
		//3
		//return i2.compareTo(i1);//(Descending Order) [20, 15, 10, 5, 0]
		//4
		//return -i2.compareTo(i1);//(Ascending Order) [0, 5, 10, 15, 20]
		//5
		//return +1;//(insertion order) [10, 0, 15, 5, 20, 20]
		//6
		//return -1;//(Reverse of insertion order) [20, 20, 5, 15, 0, 10]
		//7
		return 0;//(first element only) [10]
	}

}
