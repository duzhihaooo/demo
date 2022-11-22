package com.example.math;

import java.util.Scanner;

public class TestMath {
	
	public static void main(String[] args) {
		//abs:绝对值
		System.out.println(Math.abs(-12));	//12
		System.out.println(Math.abs(12));	//12
		
		System.out.println(Math.max(5, 66));	//66
		System.out.println(Math.min(7,35));		//7
		
		//pow(a,b):a的b次幂
		System.out.println(Math.pow(2, 3));		//2*2*2
		
		//round:四舍五入
		System.out.println(Math.round(3.3));	//3
		System.out.println(Math.round(5.7));	//6
		
		//sqrt:平方根
		System.out.println(Math.sqrt(9));	//3.0
		System.out.println("--------------------------");
		//ax^2+bx+c=0
		System.out.println("计算一元二次方程的解：");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入a:");
		double a = sc.nextInt();
		System.out.println("请输入b:");
		double b = sc.nextInt();
		System.out.println("请输入c:");
		double c = sc.nextInt();
		
		double dt = Math.pow(b, 2)-(4*a*c);
		//double x = (-b)
		
		if (dt < 0){
			System.out.println("该方程无解！");
		} else if (dt == 0){
			System.out.println("该方程只有一个解");
			//int数除以int数--得到的结果肯定是整数
			double x = (-b) / (2*a);
			System.out.println("解x="+x);
		} else {
			System.out.println("该方程有两个解");
			double x1 = (-b+Math.sqrt(dt)) / (2*a);
			double x2 = (-b-Math.sqrt(dt)) / (2*a);
			System.out.println("解x1="+x1);
			System.out.println("解x2="+x2);
		}
	
	
	
	
	}
}
