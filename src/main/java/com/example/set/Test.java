package com.example.set;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set s = new HashSet();
		//去重功能 乱序
		//TreeSet 默认进行排序 去重复
		s.add(123);
		s.add(23);
		s.add(5);	//  int  -->  Integer
		s.add(9);
		
		s.add(5);	//  重复的数据添加不进去
		
		System.out.println(s);
		
		s.remove(9);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains(5));
	}
}
