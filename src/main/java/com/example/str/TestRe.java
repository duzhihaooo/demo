package com.example.str;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestRe {
	public static void main(String[] args) throws Exception{
		String str1 = "nihaoLeeXing";
		System.out.println(str1.charAt(1));
		//concat  字符串str1上进行拼接，拼接“哈哈哈哈”
		str1.concat("哈哈哈哈");
		System.out.println(str1);
		//字符串是不可变的数据类型
		//几乎所有的字符串操作都会返回一个新字符串
		String s1 = str1.concat("哈哈哈哈");	//在字符串str1上进行拼接“哈哈哈哈”
		System.out.println(s1);	//你好阿玛卡巴卡！哈哈哈哈
		
		String str2 = "wodaxiwa";
		//contains  看字符串是否包含xxxx
		System.out.println(str2.contains("xixi"));	//false
		System.out.println(str2.contains("wo"));	//true
		
		//startsWith  endsWith  判断是否以xxxx开头(结尾)
		System.out.println(str2.startsWith("wo"));
		System.out.println(str2.endsWith("wa"));
		System.out.println("******************");
		
		/*
		//equalsIgnoreCase  忽略字符串大小写
		String verify_code = "CODE";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入验证码("+verify_code+")");
		String userInput = sc.nextLine();
		
		if (verify_code.equalsIgnoreCase(userInput)){
			System.out.println("Success");
		} else {
			System.out.println("False");
		}
		*/
		
		//replace  字符串替换
		String str3 = "IFeelLonely";
		str3.replace("Lonely", "Happy");
		System.out.println(str3);	// IFeelLonely
		String re = str3.replace("Lonely", "Happy");
		System.out.println(re);	//IFeelHappy
		//substring  取到想要位置的字符串
		//前闭后开  1能取到 4取不到
		System.out.println(str3.substring(1, 4));	//Fee
		//trim  去掉字符串左右两端的空格
		String str4 = "  meme  ";
		System.out.println(str4.trim());	//meme
		//valueof 将其他数据类型转换为字符串
		int i = 10;
		double dd = 9.89;
		String strI = String.valueOf(i);
		String strDouble = String.valueOf(dd);
		System.out.println(strI);
		System.out.println(strDouble);
		//野路子  其他数据类型与字符串拼接通通转为字符串
		
		//数据：String[] ss = {"小绿_数学_12_语文_33_英语_42","钢管男_数学_25_语文_56_英语_27","teddy_数学_99_语文_88_英语_120"};
		String[] strs = {"小绿_数学_12_语文_33_英语_42","钢管男_数学_25_语文_56_英语_27","teddy_数学_99_语文_88_英语_120"};
		for (int k=0;k<strs.length;k++){
			String s = strs[k];
			
			//System.out.println(s);	//小绿_数学_12_语文_33_英语_42
			String[] ss = s.split("_");
			String name = ss[0];
			String mathScore = ss[2];
			String chineseScore = ss[4];
			String englishScore = ss[6];
			double scores = Integer.parseInt(mathScore)+Integer.parseInt(chineseScore)+Integer.parseInt(englishScore);
			double avgScores = scores / 3;
			DecimalFormat df = new DecimalFormat(".##");
			String avg = df.format(avgScores);
			System.out.println(name+"同学的平均成绩为："+avg);
		
		
		}
	}
}
