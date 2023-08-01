package com.TreeSet;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_Constructors {
public static void main(String[] args) {
	//TreeSet t=new TreeSet();
	//TreeSet t=new TreeSet(Comparator com);
	//TreeSet t=new TreeSet(Collection col);
	//TreeSet t=new TreeSet(SortedSet s);
	SortedSet s1=new TreeSet();
	Comparator mc=new MyComparator();
	Set s2=new TreeSet(mc);
	Set s3=new TreeSet(List.of(1,3,2));
	Set s4=new TreeSet(s1);
	
}
}
