package com.example.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("kiki");
		list.add("moriie");
		list.add("minnie");
		list.add("yuki");
		
		Iterator it = list.iterator();
		/*
		String s0 = (String) it.next();		//第一个
		System.out.println(s0);
		String s1 = (String) it.next();		//下一个
		System.out.println(s1);
		String s2 = (String) it.next();		//下一个
		System.out.println(s2);
		String s3 = (String) it.next();		//下一个
		System.out.println(s3);
		String s4 = (String) it.next();		//没有元素了 再叫下一个的话 会报错
		System.out.println(s4);
		*/
		
		//判断有没有下一个元素
		while (it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		
		//System.out.println(it.next());		//会报错 因为list中没元素 因为迭代器Iterator往外拿完了
	
	}
}
