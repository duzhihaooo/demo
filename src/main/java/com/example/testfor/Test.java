package com.example.testfor;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String[] arr = {"kiki","bibi","LeeHi","Woody","Loopy"};
		
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------------");
		
		//for(数据类型  变量：数组或集合)
		for (String arrFor:arr){
			System.out.println(arrFor);
		}
		System.out.println("----------------------------------");
		List<Integer> luckyNumber = new ArrayList<Integer>();
		luckyNumber.add(7);
		luckyNumber.add(6);
		luckyNumber.add(888);
		luckyNumber.add(22);
		//for(数据类型  变量：数组或集合)
		for (Integer nb:luckyNumber){
			System.out.println(nb+100);
		}
		
	}
}
