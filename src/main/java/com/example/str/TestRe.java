package com.example.str;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestRe {
	public static void main(String[] args) throws Exception{
		/*
		String str1 = "HelloKitty!";
		//charAt(0)  获取到第0个位置的字符
		System.out.println(str1.charAt(0));	//H
		
		//concat  字符串进行拼接
		System.out.println(str1.concat("YeYe!"));	//HelloKitty!YeYe!
		System.out.println(str1);	//HelloKitty!
		//字符串是不可变的数据类型
		//几乎所有的字符串操作都会回一返个新的字符串
		String str2 = str1.concat("HelloJame");
		System.out.println(str2);	//HelloKitty!HelloJame
		
		String str3 = "老师喜欢听话的学生";
		//contains  看字符串是否包含xxxx
		System.out.println(str3.contains("喜欢"));	//true
		System.out.println(str3.contains("作业"));	//false
		
		//startWith endsWith  判断是否以xxxx开头(结尾)
		System.out.println(str3.startsWith("喜欢"));	//false
		System.out.println(str3.endsWith("学生"));	//true
		
		//toLowerCase()  toUpperCase()
		String str4 = "GoodBoyDODO";
		System.out.println(str4.toLowerCase());	//goodboydodo  字符串转小写
		System.out.println(str4.toUpperCase());	//GOODBOYDODO  字符串转大写
		
		//equalsIgnoreCase  忽略字符串中大小写(判断)  验证码中常用
		String verify_code = "DoDo";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入验证码："+verify_code);
		String userInput = sc.nextLine();
		if (verify_code.equalsIgnoreCase(userInput)){
			System.out.println("Success");
		} else {
			System.out.println("False,Try again!");
		}
		*/
		
		/*
		//indexOf  查找出xxxx出现在字符串的位置
		String str5 = "Leellamarz";
		System.out.println(str5.indexOf("ma"));
		//length  字符串长度
		System.out.println(str5.length());
		
		//replace  字符串替换
		String str6 = "MakeYouMine";
		System.out.println(str6.replace("You", "doo"));	//MakedooMine
		System.out.println(str6);	//MakeYouMine
		
		//split  字符串切割
		String str7 = "Ex_LastChance_DontDoThat_2AM";
		String ss[] = str7.split("_");
		System.out.println(ss[0]);	//Ex
		System.out.println(ss[1]);	//LastChance
		System.out.println(ss[2]);	//DontDoThat
		System.out.println(ss[3]);	//2AM
		System.out.println(str7);	//Ex_LastChance_DontDoThat_2AM
		
		//substring  取到想要位置的字符串
		String str8 = "WhySoSerious";
		//前闭后开  3能取到 5取不到
		System.out.println(str8.substring(5,11));	//Seriou
		System.out.println(str8.substring(3));	//SoSerious
		//trim  去掉字符串左右两端的空格
		String str9 = "  Justhis       ";
		System.out.println(str9.trim());	//Justhis
		
		//valueOf  将其他数据类型转换为字符串
		int i = 100;
		double d = 0.01;
		String str10 = String.valueOf(i);	//100
		System.out.println(str10+d);	//1000.01
		//野路子  其他数据类型与字符串拼接通通转为字符串
		System.out.println(i+"");	//100(字符串)
		*/
		
		//StringBuilde 是可以改变的字符串
		StringBuilder sb = new StringBuilder();	//一个空字符串 ""
		StringBuilder sbl = new StringBuilder("刚刚在那边看到你");
		
		System.out.println(sbl);	//刚刚在那边看到你
		
		//append  追加
		sbl.append("还蛮可爱的");
		System.out.println(sbl);	//刚刚在那边看到你还蛮可爱的
		//insert  插入
		sbl.insert(8, "感觉你闺蜜旁边的你");
		System.out.println(sbl);	//刚刚在那边看到你感觉你闺蜜旁边的你还蛮可爱的
		
		sbl.delete(8,22);	//刚刚在那边看到你
		//把StringBuilder转化成String
		String s = sbl.toString();
		System.out.println(s);	//刚刚在那边看到你
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

