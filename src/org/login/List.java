package org.login;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add("Prakash");
	l.add('M');
	l.add(true);
	l.add(11.123456);
	l.add(10);
	l.add(10);
	System.out.println(l);
	//to print the values from list
	for (Object a : l) {
		System.out.println(a);
		//index of 
		int indexOf = l.indexOf(10);
		System.out.println(indexOf);
		//last index of
		int lastIndexOf = l.lastIndexOf(10);
		System.out.println(lastIndexOf);
		//contains
		boolean contains = l.contains("Prakash");
		System.out.println(contains);
		//remove
		Object remove = l.remove(4);
		System.out.println(l);
		//get
		Object object = l.get(2);
		System.out.println(object);
	//similar data type
		LinkedList b=new LinkedList();
		b.add(10);
		b.add(20);
		b.add(30);
		Vector c=new Vector();
		c.add(10);
		c.add(20);
		//remove all
		b.removeAll(c);
		System.out.println(b);
		//retain all
		b.retainAll(c);
		System.out.println(b);
		
		
		
	}
			
}
}
