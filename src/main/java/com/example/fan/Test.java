package com.example.fan;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("今天心情不错");
		//strList.add(123);	// 不可以装int
		strList.add("今天天气不错");
		strList.add("今天运气不错");
		strList.add("今天开心");
		
		String s = strList.get(1);
		System.out.println(s);	//不需要强转
		
		List<Singer> list = new ArrayList<Singer>();
		list.add(new Singer(1,"蔡徐坤",6.58,"只因你太美"));
		list.add(new Singer(2,"白艺潾",5.85,"Byebyeblue"));
		list.add(new Singer(3,"Mcmong",3.23,"XXXX"));
		list.add(new Singer(4,"Crush",8.88,"Rush Hour"));
		
		Iterator<Singer> it = list.iterator();
		while (it.hasNext()){
			Singer singer = it.next();
			System.out.println("艺人信息：");
			System.out.println(singer.getName());
			System.out.println(singer.getSong());
		}
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("123", "好吃");
		map.put("456", "一般");
		map.put("789", "不好吃");
		map.put("0", "难吃死了");
		
		String s1 = map.get("123");
		System.out.println(s1);
		
		
	}
}
