package com.example.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Date d = new Date();	//系统时间 Tue Nov 22 15:02:02 CST 2022
		System.out.println(d);
		
		System.out.println(d.getYear()+1900);	//从1900年开始
		System.out.println(d.getMonth()+1);	//月份从0开始
		System.out.println(d.getDate());	//正常天数
		
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		
		//重点:获取到的时间是以毫秒表示形式
		System.out.println(d.getTime());	//从1970年01月01号00：00：00 返回的是long
		System.out.println("****************************");
		
		//Calendar是一个抽象类 抽象类不能创建对象
		//Calendar.getInstance()为了拿到Calendar的实体对象
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal);	//YEAR=2022,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=22
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);	//月份从0开始
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//cal.getTime:拿到的是一个设置后的Date对象
		System.out.println(cal.getTime());	//Tue Nov 22 15:03:47 CST 2022
		
		Date d2 = new Date();
		//Calendar.getInstance()为了拿到Calendar的实体对象
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);	//把Date转化为Calendar
		
		System.out.println(cal2);
		System.out.println(cal2.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH)+1);
		System.out.println(cal2.get(Calendar.DATE));
		System.out.println("************************");
		
		System.out.println("yyyy-MM-dd HH:mm:ss");
		String s1 = "2022-11-22 14:00:00";	//开始时间
		String s2 = "2022-11-22 15:00:00";	//结束时间
		
		//格式化时间的工具 SimpleDateFormant
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//把字符串转化成时间
		Date day1 = sdf.parse(s1);
		Date day2 = sdf.parse(s2);
		//为了计算时间差 需将时间转化成long类型的时间
		long l1 = day1.getTime();
		long l2 = day2.getTime();
		
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
