package com.example.str;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//判断某个人是不是姓张
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的名字：");
		
		String name1 = sc.nextLine();
		if (name.startsWith("张")){
			System.out.println("此人正为张氏");
		} else {
			System.out.println("她不是张姐！");
		}
		System.out.println(name.startsWith("张")?"Yes":"No");
		*/
		
		//打印字符串中每一个字符
		String str = "IamFuxkingGod!";
		for (int i=0;i<str.length();i++){
			System.out.print(str.charAt(i));
			System.out.print(" ");
		}
		System.out.println("");
		
		//有如下学生信息，请计算并打印出每个学生的平均分
		//数据：String[] ss = {"小绿_数学_12_语文_33_英语_42","钢管男_数学_25_语文_56_英语_27","teddy_数学_99_语文_88_英语_120"};
		String[] strs = {"小绿_数学_12_语文_33_英语_42","钢管男_数学_25_语文_56_英语_27","teddy_数学_99_语文_88_英语_120"};
		for (int k=0;k<strs.length;k++){		//数组length是没有()
			String s = strs[k];
			//System.out.println(s);		//小绿_数学_12_语文_33_英语_42
			
			String[] ss = s.split("_");	//小绿,数学,12,语文,33,英语,42
			String name2 = ss[0];
			String math = ss[2];
			String chinese = ss[4];
			String english = ss[6];
			double scores = Integer.parseInt(math)+Integer.parseInt(chinese)+Integer.parseInt(english);
			double avg = scores / 3;
			DecimalFormat df = new DecimalFormat(".##");
			String avgDf = df.format(avg);
			System.out.println(name2+"同学的平均成绩为："+avgDf);
		
		}
	}
}
