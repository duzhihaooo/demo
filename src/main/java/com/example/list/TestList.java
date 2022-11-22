package com.example.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TestList {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("cola");
		list.add("beer");
		list.add("water");
		list.add("juice");
		//打印链表
		System.out.println(list);
		//删除元素
		list.remove("water");
		System.out.println(list);
		//得到链表大小
		System.out.println(list.size());
		
		//链表中的元素都是对象  以String形式显示
		Object obj = list.get(1);
		String str = (String) obj;	//向下转型 需要强转
		System.out.println(str);
		
		//遍历链表
		System.out.println("----遍历链表----");
		for (int i=0;i<list.size();i++){
			Object ob = list.get(i);
			String s = (String) ob;
			System.out.println(s);
		}
	}
}
