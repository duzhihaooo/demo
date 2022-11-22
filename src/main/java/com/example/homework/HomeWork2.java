package com.example.homework;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		System.out.println("游戏马上开始，请准备，按Enter开始游戏");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();		//为了让程序停一下
		
		//游戏开始
		//拿到当前时间 且准备一个结束时间
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.SECOND, cal.get(Calendar.SECOND)+5);	//设置一个在当前时间5秒后的一个时间点
		Date endDate = cal.getTime();	//结束时间  将形式转化为Date
		long endTime = endDate.getTime();	//结束时间的时间戳 Long类型
		
		int count = 0;
		while (endTime - new Date().getTime() >= 0) {
			count++;
			System.out.println("加油，你已经按了"+count+"次");
			sc.nextLine();	//让程序停一下为了让用户点击Enter记录点击数
		}
		
		System.out.println("你真棒，一共按了"+count+"次");
		double freq = count / 5.0;
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println("你的手速为"+df.format(freq)+"次/秒");
		
	}
}
