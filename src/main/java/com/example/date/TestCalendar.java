package com.example.date;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) {
		//Calendar是一个抽象类 抽象类不能创建对象
		//Calendar.getInstance()为了拿到Calerdar的实体对象
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal);
		//输出结果：YEAR=2022,MONTH=9,WEEK_OF_YEAR=44,WEEK_OF_MONTH=5,DAY_OF_MONTH=26
		//2022-10-26
		//System.out.println(cal.get(Calendar.YEAR));
		//System.out.println(cal.get(Calendar.MONTH)+1);	//月份从0开始
		//System.out.println(cal.get(Calendar.DATE));
		//System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		//System.out.println(cal.get(Calendar.MINUTE));
		//System.out.println(cal.get(Calendar.SECOND));
		
		//可以计算当前日期前后
		//将后面的值丢进前面的值
		cal.set(Calendar.DATE, cal.get(Calendar.DATE)+50);		//cal.set(int filed,int value)
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);	//月份从0开始
		System.out.println(cal.get(Calendar.DATE));
		
		//todo:Date对象和Calendar的区别？
		System.out.println(cal.getTime());		//拿到的是一个设置后的Date对象
		
		Date d = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d);	//把Date转化成Calender
		
		System.out.println(cal2);
		System.out.println(cal2.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH)+1);	//月份从0开始
		System.out.println(cal2.get(Calendar.DATE));
	
	
	}
}
