package com.example.str;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();		//一个空字符串 ""
		StringBuilder sbl = new StringBuilder("我tm来了!");
		
		System.out.println(sbl);
		//append  追加
		sbl.append("杀马特团长你给我等着");
		System.out.println(sbl);
		//insert  插入
		sbl.insert(5, "哈哈哈哈");
		System.out.println(sbl);
		
		//把StringBuilder转化成String
		String s = sbl.toString();
		System.out.println(s);
		
	}
}
