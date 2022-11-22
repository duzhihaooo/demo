package com.example.str;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String str1 = "你好阿玛卡巴卡！";
		//charAt(0)  获取到第0个位置的字符
		System.out.println(str1.charAt(0));
		
		//concat  字符串str1上进行拼接，拼接“哈哈哈哈”
		str1.concat("哈哈哈哈");
		System.out.println(str1);		//你好阿玛卡巴卡！
		//字符串是不可变的数据类型
		//几乎所有的字符串操作都会返回一个新字符串
		String s1 = str1.concat("哈哈哈哈");	//在字符串str1上进行拼接“哈哈哈哈”
		System.out.println(s1);			//你好阿玛卡巴卡！哈哈哈哈
		
		String str2 = "老师喜欢学生";
		//contain  看字符串是否包含xxxx
		System.out.println(str2.contains("喜欢"));		//true
		System.out.println(str2.contains("不要"));		//false
		
		//startsWith  endsWith  判断是否以xxxx开头(结尾)
		String str3 = "今天天气好好";
		System.out.println(str3.startsWith("今天"));		//true
		System.out.println(str3.endsWith("不好"));		//false
		
		//equalsIgnoreCase  忽略字符串大小写
		//验证码 中常用
		//String verify_code = "CoDe";
		//Scanner sc = new Scanner(System.in);
		//System.out.println("请输入验证码("+verify_code+")");
		//String userInput = sc.nextLine();
		//if (verify_code.equalsIgnoreCase(userInput)){
		//	System.out.println("Success");
		//} else {
		//	System.out.println("False");
		//}
		
		//indexOf  查找出xxxx出现在字符串的位置
		String str4 = "哇达西瓦库库尤里扎";
		System.out.println(str4.indexOf("库库尤"));
		//length  字符串长度
		String str5 = "CanIBeYourDoggi";
		System.out.println(str5.length());
		
		//replace  字符串替换
		String str6 = "MakeYouMine";
		System.out.println(str6.replace("you", "Her"));		//MakeYouMin(字符串是不可变的数据类型 所以结果没变)
		String re = str6.replace("You", "Her");
		System.out.println(re);		//MakeHerMine
		//split  字符串切割
		String str7 = "beibei_moriie_nood1e_bibi";
		String[] ss = str7.split("_");
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		System.out.println(ss[3]);
		
		//substring  取到想要位置的字符串
		String str8 = "Whysoserious";
		//前闭后开  3能取到 5取不到
		System.out.println(str8.substring(3, 5));	//so
		//trim  去掉字符串左右两端的空格
		String str9 = "  kikikiki  ";
		System.out.println(str9.trim());	//kikikiki
		
		//valueOf  将其他数据类型转换为字符串
		int i = 10;
		double d = 0.01;
		String strI = String.valueOf(i);
		System.out.println(strI+d);	//100.01
		//野路子  其他数据类型与字符串拼接通通转为字符串
		System.out.println(i+"");	//10(字符串)
	}
}
