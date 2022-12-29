package com.example.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWorkShi2 {
	///数据1|2|3|4|5|6|7
	//1.转换为一个数组：
	//8.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出最大值
	//9.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出最小值
	//10.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出平均数
	//11.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出平均数mapToInt().average()
	//12.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，通过noneMatch、allMatch、anyMatch 进行对应的判断，自行发挥
	//13.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，然后跳过前3个元素之后，获取最小值
	//14.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，然后进行从大到小的排序，之后获取最大值
	//15.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，获取大于10的，并获取第一个元素
	//16.先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，获取大于5的，并获取任意一个元素
	
	/**
	 * https://colobu.com/2016/03/02/Java-Stream/
	 * map第六题
	 *
	 *
	 * https://blog.csdn.net/u010046908/article/details/100580093
	 * 前5个
	 * https://vimsky.com/examples/usage/arrays-stream-method-in-java.html
	 * https://segmentfault.com/a/1190000022887572 Lambda 表达式
	 * https://juejin.cn/post/6980135669368619045 stream的基础
	 * https://blog.csdn.net/u014042066/article/details/76372116
	 */
	public static void main(String[] args) {
		//Q1:转换为一个数组：
		String str1 = "1|2|3|4|5|6|7";
		String[] array = str1.split("\\|");
		Arrays.stream(array).forEach(System.out::println);	//1 2 3 4 5 6 7
		/**
		 * 1.steam将里面每一元素进行计算
		 * 2..map()每一个元素+1 ；List（元素，元素+1）
		 * 1 转换List（1，2）.map()
		 * 2 转换List（2，3）.map()
		 * .。。。。
		 * flatMap List
		 */
		List<Integer> listIntNew = new ArrayList<>();
		List<Integer[]> list = new ArrayList<>();
		//Q8:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出最大值
		//[1,2,3,4,5,6,7] -> [1,2] [2,3] [3,4] [4,5] [5,6] [6,7] [7,8]
		List<Integer> listInt1 = Arrays.stream(array).map(x->{
			int[][] num =
		}).collect(Collectors.toList());
		System.out.println(listInt1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
