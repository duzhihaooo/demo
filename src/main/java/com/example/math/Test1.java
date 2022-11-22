package com.example.math;

public class Test1 {
	public static void main(String[] args) {
		//abs:绝对值
		System.out.println(Math.abs(12));	//12
		System.out.println(Math.abs(-12));	//12
		
		System.out.println(Math.max(12, 5));
		System.out.println(Math.min(2, 3));
		
		//pow(a,b):a的b次幂
		System.out.println(Math.pow(2, 3));		//2*2*2 = 8
		
		//round:四舍五入
		System.out.println(Math.round(3.4));	//3
		System.out.println(Math.round(5.8));	//6
		
		//sqrt:平方根
		System.out.println(Math.sqrt(16.0));	//4.0
		
	}
}
