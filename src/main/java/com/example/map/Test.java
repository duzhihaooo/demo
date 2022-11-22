package com.example.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		Map map1 = new HashMap<>();
		map1.put(5, "dogge");
		map1.put(13, "mimi");
		map1.put(35, "bird");
		map1.put(1, "lion");
		
		System.out.println(map1);
		System.out.println("------------");
		Map map2 = new TreeMap();	//根据key排序
		map2.put(5, "dogge");
		map2.put(13, "mimi");
		map2.put(35, "chic");
		map2.put(1, "lion");
		
		System.out.println(map2);
		
		map2.put(35, "只因");
		System.out.println(map2);
		
		map2.remove(13);
		System.out.println(map2);
		
		System.out.println(map2.size());
		System.out.println(map2.containsKey(35));
		System.out.println(map2.containsValue("lion"));
		
		
		
		
	}
	
	
}
