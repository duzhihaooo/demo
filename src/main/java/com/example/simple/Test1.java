package com.example.simple;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(date);	//格式化时间
		System.out.println(s);
	}
}
