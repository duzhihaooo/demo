package com.example.date;

import javax.sound.midi.Soundbank;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date d = new Date();	//系统时间
		System.out.println(d);
		
		System.out.println(d.getYear()+1900);	//从1900年开始算的
		System.out.println(d.getMonth()+1);		//月份从0开始
		System.out.println(d.getDate());		//26
		
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		
		//重点
		System.out.println(d.getTime());	//获取到的时间是以毫秒表示形式  从1970年01月01号00：00：00 返回的是long
		
	}
}
