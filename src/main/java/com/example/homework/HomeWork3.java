package com.example.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		/**
		 * 如果用户输入的内容中包含特殊的文字信息，则将用户输入的内容中的敏感词汇替换成等长度的*（苍老师就替换成***）
		 * 如果用户输入的内容没有敏感词汇，则直接打印即可
		 */
		//敏感词
		List list = new ArrayList<>();
		list.add("武藤兰");
		list.add("波多野结衣");
		list.add("仓木麻衣");
		list.add("麻生希");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文本信息：");
		String content = sc.nextLine();
		
		for (int i=0;i<list.size();i++){
			String non = (String) list.get(i);	//拿到敏感词
			//判断是否包含敏感词
			if (content.contains(non)){
				String s = "";
				//拼接*
				for (int j=0;j<non.length();j++){
					s += "*";
				}
				//替换敏感词
				content = content.replace(non, s);
			}
		}
		System.out.println(content);
	}
}
