package com.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(20, "Narsing"));
		al.add(new Student(25, "Pankaj"));
		al.add(new Student(35, "Bhogade"));
		al.add(new Student(27, "Bhavesh"));
		//Collections.sort(al);
		Collections.sort(al, new StudentComparator());
		System.out.println(al);
	}

}
