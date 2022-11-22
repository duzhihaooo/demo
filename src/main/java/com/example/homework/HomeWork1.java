package com.example.homework;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		//让用户输入一个数学表达式：3+6+9+18，编程完成数学表达式的计算
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数学表达式");	//1+2    +          3
		String s1 = sc.nextLine();
		System.out.println(s1);		//1+2    +          3
		//获取到用户输入的每一个数字
		//先去掉空格
		//todo:String是不可变字符串 为什么.replace可以改变String类型字符串
		s1 = s1.replace(" ", "");
		System.out.println(s1);		//1+2+3
		
		String[] ss = s1.split("\\+");
		int sum = 0;
		for (int i=0;i<ss.length;i++){
			//字符串集合中每一个都是字符串 所以需要转换成int
			int k = Integer.parseInt(ss[i]);
			sum = sum + k;	//sum += k;
		}
		System.out.println("最终结果："+sum);
	
	}
}
