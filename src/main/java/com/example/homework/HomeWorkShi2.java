package com.example.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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
		//Q8:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出最大值
		//[1,2,3,4,5,6,7] -> [1,2] [2,3] [3,4] [4,5] [5,6] [6,7] [7,8]
		List<List<Integer>> listNewListOneToTwo8 = Arrays.stream(array).map(x -> one2TwoNum(x)).collect(Collectors.toList());
		System.out.println(listNewListOneToTwo8);	//[[1, 2], [2, 3], [3, 4], [4, 5], [5, 6], [6, 7], [7, 8]]
		//todo:flatmap -> max 打平了之和我想都收集之后再进行比较怎么做
		//todo:不确定这样是不是对的
		//todo:Integer::compare  不用双引号该怎么写:Comparator.comparing(i->i.intValue())
		int maxNum = listNewListOneToTwo8.stream().flatMap(x->x.stream()).max(Comparator.comparing(i->i.intValue())).get();
		System.out.println("newList中最大值："+maxNum);	//8
		
		//Q9:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出最小值
		List<List<Integer>> listNewListOneToTwo9 = Arrays.stream(array).map(x->one2TwoNum(x)).collect(Collectors.toList());
		System.out.println(listNewListOneToTwo9);	//[[1, 2], [2, 3], [3, 4], [4, 5], [5, 6], [6, 7], [7, 8]]
		int minNum = listNewListOneToTwo9.stream().flatMap(x -> x.stream()).min(Integer::compare).get();
		System.out.println("newList中最小值："+minNum);	//1
		
		//Q10:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出平均数
		List<List<Integer>> listNewListOneToTwo10 = Arrays.stream(array).map(x -> one2TwoNum(x)).collect(Collectors.toList());
		System.out.println(listNewListOneToTwo10);	//[[1, 2], [2, 3], [3, 4], [4, 5], [5, 6], [6, 7], [7, 8]]
		Double averageNum = listNewListOneToTwo10.stream().flatMap(x -> x.stream()).collect(Collectors.averagingDouble(Integer::doubleValue));
		System.out.println("newList中平均值："+averageNum);
		
		//Q11:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，取出平均数mapToInt().average()
		//todo:需要讲解mapToInt mapTOInt 就是将一个元素或者一个对象转换为一个int的元素，点击mapToInt会发现里面是ToIntFunction的fuc函数
		OptionalDouble averageMapToInt = listNewListOneToTwo10.stream().flatMap(x -> x.stream()).mapToInt(Integer::intValue).average();
		System.out.println("mapToInt的平均值："+averageMapToInt.getAsDouble());
		
		//Q12:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，通过noneMatch、allMatch、anyMatch 进行对应的判断
		//todo：该题是不是先要用flatmap打平后生成新的list 再通过对newList生成流再调用noneMatch、allMatch、anyMatch方法：是的
		final List<Integer> newList = listNewListOneToTwo10.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("newList:"+newList);
		boolean allmatch = newList.stream().allMatch(x->x.equals(1));
		boolean anymatch = newList.stream().anyMatch(x->x.equals(1));
		boolean nonematch = newList.stream().noneMatch(x->x.equals(11));
		System.out.println("allmatch结果:"+allmatch);	//false
		System.out.println("anymatch结果:"+anymatch);	//true
		System.out.println("nonematch结果:"+nonematch);	//true
		
		//Q13:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，然后跳过前3个元素之后，获取最小值
		System.out.println("newList:"+newList);	//newList:[1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8]
		//todo:Integer::compare  不用双引号的写法Comparator.comparing(i->i.intValue())
		Integer minSkip3Num = newList.stream().skip(3).min(Integer::compare).get();
		System.out.println("newList中跳过前3个元素之后，获取最小值："+minSkip3Num);
		
		//Q14:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，然后进行从大到小的排序，之后获取最大值
		System.out.println("newList:"+newList);	//newList:[1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8]
		//todo:sorted(Comparator.reverseOrder())  自然序逆序元素 这个没问题
		int numMAxHighToLow = newList.stream().sorted(Comparator.reverseOrder()).max(Integer::compare).get();
		System.out.println(numMAxHighToLow);
		
		//Q15:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，获取大于10的，并获取第一个元素
		newList.add(12);
		newList.add(13);
		System.out.println("newList:"+newList);	//newList:[1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 12, 13]
		List<Integer> numThan10First = newList.stream().filter(x -> x > 10).limit(1).collect(Collectors.toList());
		System.out.println("newList中大于10的第一个元素："+numThan10First);
		
		//Q16:先执行第一1，然后转换为stream，通过.map操作将里面的元素+1,构成一个新的list集合，然后通过flatMap打平这个集合，获取大于5的，并获取任意一个元素
		System.out.println("newList:"+newList);	//newList:[1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 12, 13]
		//匹配任意元素(并行流)
		int numThan5FindAny = newList.parallelStream().filter(x -> x > 5).findAny().get();
		System.out.println("大于5的，并获取任意一个元素:"+numThan5FindAny);
	}
	
	private static List<Integer> one2TwoNum(String x){
		int i = Integer.parseInt(x);
		int i1 = i+1;
		return Arrays.asList(i, i1);
	}
	
	
	
}