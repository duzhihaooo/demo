package com.example.homework;

import java.util.*;

public class HomeWork4 {
	public static void main(String[] args) {
		//有字符串"k:1,k1:2,k2:3,k3:4"处理成Map:{'k'=1,'k1=2'....}
		String str = "k:1,k1:2,k2:3,k3:4";
		//对数组切割
		String[] strs = str.split(",");
		
		//对数组循环 拿到每一个切割后的字符串
		Map<String,Integer> map = new HashMap<String,Integer>();
		for (String s:strs){
			String[] ss = s.split(":");
			//对字符串数组进行转化 Integer.parseInt
			map.put(ss[0],Integer.parseInt(ss[1]));
		}
		
		System.out.println(map);
		System.out.println("------------------------------------------");
		
		/**
		 * 元素分类，有如下值int[] li={11,22,33,44,55,66,77,88,99,90}
		 * 将所有大于等于66的值保存到Map的第一个keyd的value中
		 * 将小于66的值保存到第二个key的value中
		 * 即:{'key1':大于66的所有值列表，'key2':小于66的所有值列表}
		 */
		
		int[] li={11,22,33,44,55,66,77,88,99,90};
		Map<String,List<Integer>> map1 = new HashMap<String,List<Integer>>();
		for(int i:li){
			if (i >= 66){
				if (!map1.containsKey("key1")){
					map1.put("key1", new ArrayList<Integer>());
				}
				map1.get("key1").add(i);
				
			} else {
				if (!map1.containsKey("key2")){
					map1.put("key2", new ArrayList<Integer>());
				}
				map1.get("key2").add(i);
			}
		}
		System.out.println(map1);
	}
}
