package com.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		
		//资料查询：https://www.cainiaojc.com/java/java-arraylist.html
		
		ArrayList<String> animals1 = new ArrayList<>();
		//使用 add() 方法
		//添加元素
		animals1.add("mimi");
		animals1.add("doggo");
		animals1.add("piggy");
		
		System.out.println("Animals:" + animals1);	//Animals:[mimi, doggo, piggy]
		
		//添加索引
		ArrayList<String> animals2 = new ArrayList<>();
		animals2.add(0,"Cat");
		animals2.add(1,"Dog");
		animals2.add(2,"Bird");
		System.out.println("Animals:" + animals2);	//Animals:[Cat, Dog, Bird]
		
		//将一个数组列表的元素添加到另一个数组列表
		animals2.addAll(animals1);
		System.out.println("Animals:" + animals2);	//Animals:[Cat, Dog, Bird, mimi, doggo, piggy]
		
		//使用asList()初始化ArrayList
		//创建数组列表
		ArrayList<String> animals3 = new ArrayList<>(Arrays.asList("pussy","doggy","kitty"));
		System.out.println("Animals:" + animals3);
		
		//访问数组列表中的元素
		String element = animals3.get(1);
		System.out.println(element);
		
		//Iterator 迭代器
		Iterator<String> iterator = animals3.iterator();
		System.out.print("Animals:");
		//使用Iterator的方法访问元素
		while (iterator.hasNext()){
			System.out.print(iterator.next());
			System.out.print(",");
		}
		
		
		
		
		
	}
}
