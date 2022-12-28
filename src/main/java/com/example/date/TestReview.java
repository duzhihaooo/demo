package com.example.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestReview {
	public static void main(String[] args) throws Exception {
		/*
		Date date = new Date();		//new Date()可以获取到系统时间
		System.out.println(date);	//Mon Dec 26 11:14:39 CST 2022
		
		System.out.println(date.getYear()+1900);	//从1900年开始计算
		System.out.println(date.getMonth()+1);	//月份从0开始
		System.out.println(date.getDate());
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		//重点
		System.out.println(date.getTime());	//1672024627229(long)
		//getTime()能获取到时间long的表示形式，可以用来计算时间差
		//date.getTime() 获取到的时间是以毫秒表示形式  从1970年01月01号00：00：00 返回的是long
		*/
		
		/*
		//Calendar是一个抽象类 抽象类不能创建对象
		//Calendar.getInstance()为了拿到Calendar的实体对象
		Calendar cal = Calendar.getInstance();	//
		System.out.println(cal);
		//输出结果：YEAR=2022,MONTH=9,WEEK_OF_YEAR=44,WEEK_OF_MONTH=5,DAY_OF_MONTH=26
		//2022-12-16
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);	//月份从0开始
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println("--------------------------");
		//可以计算当前日期前后
		//将后面的值丢进前面的值
		cal.set(Calendar.DATE, cal.get(Calendar.DATE)+50);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);	//月份是从0开始
		System.out.println(cal.get(Calendar.DATE));
		
		//todo:Date对象和Calendar的区别？
		System.out.println(cal.getTime());	//拿到的是一个设置后(50天后)的Date对象
		
		Date d = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d);	//把Date转化成Calender
		
		System.out.println(cal2);
		System.out.println(cal2.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH)+1);	//月份从0开始
		System.out.println(cal2.get(Calendar.DATE));
		*/
		
		
		//TestDiff
		System.out.println("yyyy-MM-dd HH:mm:ss");
		String s1 = "2022-12-26 11:31:00";	//开始时间
		String s2 = "2022-12-31 23:59:59";	//结束时间
		
		//格式化时间工具 SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//把字符串转化成时间
		Date day1 = sdf.parse(s1);
		Date day2 = sdf.parse(s2);
		
		System.out.println(day1);
		System.out.println(day2);
		
		//为了计算时间差 需将时间转化成long类型的时间
		long l1 = day1.getTime();
		long l2 = day2.getTime();
		
		long dayDiff = Math.abs(l1-l2);	//计算毫秒时间差 用绝对值防止出现负数
		
		//秒级别的时间差
		long diffSec = dayDiff / 1000;
		//分钟级别的时间差
		long diffMin = diffSec / 60;
		//显示为xx小时xx分钟
		long diffHourDisplay = diffMin / 60;
		long diffMinDisplay = diffMin % 60;
		
		System.out.println("距离跨年还有"+diffHourDisplay+"小时"+diffMinDisplay+"分钟");
		
		
	}
}
