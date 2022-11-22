package com.example.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDiff {
	public static void main(String[] args) throws Exception {
		System.out.println("yyyy-MM-dd HH:mm:ss");
		String s1 = "2022-10-22 13:00:00";		//开始时间
		String s2 = "2022-10-22 14:22:00";		//结束时间
		
		//格式化时间的工具 SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//把字符串转化成时间
		Date d1 = sdf.parse(s1);
		Date d2 = sdf.parse(s2);
		//为了计算时间差 需将时间转化成long类型的时间
		long l1 = d1.getTime();
		long l2 = d2.getTime();
		
		long diff = Math.abs(l1-l2);	//计算毫秒时间差 用绝对值防止出现负数
		
		//秒级别的时间差
		long diffSec = diff / 1000;
		//分钟级别的时间差
		long diffMin = diffSec / 60;
		//显示为xx小时xx分钟
		long diffHourDisplay = diffMin / 60;
		long diffMinDisplay = diffMin % 60;
		
		System.out.println("你一共开始："+diffHourDisplay+"小时"+diffMinDisplay+"分钟")	;
		
		
		
	}
}
