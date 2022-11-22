package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	//静态变量 static 临时变量
	public static String ss = "1,2,3,4";
	
	public static void main(String[] args) {
		
		String[] s1 = ss.split(",");
		System.out.println(s1);
		List l1 = new ArrayList<>();
		for (int k=0;k< s1.length;k++){
			l1.add(s1[k]);
		}
		System.out.println(l1);
		
		//stream
	}
}
