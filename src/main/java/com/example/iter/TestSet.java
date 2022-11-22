package com.example.iter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Do");
		set.add("bibi");
		set.add("xxx");
		set.add("kk");
		
		Iterator it = set.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
