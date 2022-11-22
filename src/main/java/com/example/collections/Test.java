package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {
	public static void chi(String... args){
		System.out.println(args);
		System.out.println(args.length);
		for (String ss: args){
			System.out.println(ss);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> nbList = new ArrayList<Integer>();
		nbList.add(123);
		nbList.add(777);
		nbList.add(22);
		nbList.add(789);
		
		int min = Collections.min(nbList);
		System.out.println("min："+min);
		
		int max = Collections.max(nbList);
		System.out.println("max:"+max);
		
		Collections.sort(nbList);	//对列表进行排序
		System.out.println(nbList);
		
		Collections.shuffle(nbList);	//打乱列表
		System.out.println(nbList);
		
		Collections.addAll(nbList, 616,714,888);
		System.out.println(nbList);
		
		chi("apple","banana","juice");
		
	}
}
