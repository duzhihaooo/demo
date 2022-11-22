package com.example.simple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个时间（格式：yyyy-MM-dd HH:mm:ss）");
		
		String s = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//todo:抛出异常 字符串转换有风险 所以抛出异常 不太明白什么时候抛出异常及异常的功能
		Date date = sdf.parse(s);	//把字符串转化成时间
		System.out.println(date);
	}
}
