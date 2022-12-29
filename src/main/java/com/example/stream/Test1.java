package com.example.stream;

import java.sql.SQLOutput;
import java.util.*;
import java.util.logging.XMLFormatter;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		//Stream的操作符大体上分为两种：中间操作符和终止操作符
		//1.Stream的创建
		//1)通过 java.util.Collection.stream() 方法用集合创建流
		//stream是顺序流，由主线程按顺序对流执行操作；
		//parallelStream是并行流，内部以多线程并行执行的方式对流进行操作，但前提是流中的数据处理没有顺序要求
		List<String> list1 = Arrays.asList("a","b","c");
		//创建一个顺序流
		Stream<String> stream1 = list1.stream();
		//创建一个并行流
		Stream<String> paralleStream = list1.parallelStream();	//todo:并行流是什么？
		
		//2)使用java.util.Arrays.stream(T[] array)方法用数组创建流
		int[] array1 = {1,3,5,7,9};
		IntStream stream2 = Arrays.stream(array1);
		
		//3)使用Stream的静态方法：of()、iterate()、generate()
		Stream<Integer> stream3 = Stream.of(1,2,3,4,5);
		
		Stream<Integer> stream4 = Stream.iterate(0,(x) -> x+3).limit(4);
		stream4.forEach(System.out::println);//0,3,6,9
		
		Stream<Double> stream5 = Stream.generate(Math::random).limit(3);
		stream5.forEach(System.out::println);
		System.out.println("-----------------");
		//2.遍历/匹配（foreach/find/match）
		//1)Stream也是支持类似集合的遍历和匹配元素的，只是Stream中的元素是以Optional类型存在的
		//Stream的遍历、匹配非常简单
		List<Integer> listInt = Arrays.asList(3,88,65,2,17,6);
		//遍历输出符合条件的元素
		//Q1:找出ListInt中大于6的数
		listInt.stream().filter(x -> x>6).forEach(System.out::println);
		//匹配第一个
		Optional<Integer> findFirst = listInt.stream().filter(x -> x>6).findFirst();
		System.out.println("符合要求匹配的第一个值:" + findFirst.get());
		//匹配任意一个值（适用于并行流）
		//Optional<Integer> findAny = listInt.stream().filter(x->x>6).findAny();
		Optional<Integer> findAny = listInt.parallelStream().filter(x->x>6).findAny();
		System.out.println("符合要求匹配的任意一个值:" + findAny.get());
		//判断listInt流中是否有符合特定条件的值
		boolean anyMatch = listInt.stream().anyMatch(x->x>6);
		System.out.println("是否存在大于6的值:" + anyMatch);
		
		//3.筛选（filter）
		//筛选，是按照一定的规则校验流中的元素，将符合条件的元素提取到新的流中的操作。
		//Q1:筛选出Integer集合中大于7的元素，并打印出来
		List<Integer> listInt2 = Arrays.asList(1,3,5,66,88);	//创建IntegerList
		Stream<Integer> streamInt2 = listInt2.stream();	//创建listInt的流
		//通过对list.stream进行.filter()操作 筛选出想要的值
		streamInt2.filter(x->x>7).forEach(System.out::println);	//66,88
		System.out.println("-------------------------");
		//4.聚合（max/min/count)
		//max、min、count这些字眼你一定不陌生，没错，在mysql中我们常用它们进行数据统计
		//Java stream中也引入了这些概念和用法，极大地方便了我们对集合、数组的数据统计工作
		//Q1:获取String集合中最长的元素
		List<String> listStr = Arrays.asList("kelly","mimi","Sukii","Aintcutee","Nood1e","LongLongLongLong");
		//再没创建stream的时候 可以直接拿出元素Optional
		//todo:这一步需要解释  Comparator
		Optional<String> longMax = listStr.stream().max(Comparator.comparing(String::length));
		//以Optional存在的元素 要使其显示 需.get()方法
		System.out.println("最长的字符串:" + longMax.get());	//LongLongLongLong
		System.out.println("----Q2----Q2----");
		//Q2:获取Integer集合中的最大值
		//todo:没太理解
		List<Integer> listInt3 = Arrays.asList(123,777,24,30,1997);
		//自然排序
		Optional<Integer> numMax1 = listInt3.stream().max(Integer::compareTo);
		//自定义排序
		Optional<Integer> numMax2 = listInt3.stream().max(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1,Integer o2){
				return o1.compareTo(o2);
			}
		});
		System.out.println("自然排序的最大值:"+numMax1.get());
		System.out.println("自定义排序的最大值:"+numMax2.get());
		System.out.println("----Q3----Q3----");
		//Q3:计算Integer集合中大于6的元素的个数
		List<Integer> listInt4 = Arrays.asList(22,3,12,66,7,1);
		long count = listInt4.stream().filter(x->x>6).count();
		listInt4.stream().filter(x->x>6).forEach(System.out::println);
		System.out.println("listInt4中大于6的元素个数:"+count);
		System.out.println("----------------------");
		
		//5.映射(map/flatMap)
		//映射，可以将一个流的元素按照一定的映射规则映射到另一个流中。分为map和flatMap：
		//map：接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
		//flatMap：接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。
		//Q1:英文字符串数组的元素全部改为大写。整数数组每个元素+3。
		String[] strArr = {"Acdc","noob","fxxkingTomboyy","sweet"};
		List<String> strLetter = Arrays.stream(strArr).map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println("每个元素大写:"+strLetter);
		List<Integer> listInt5 = Arrays.asList(1,3,5,7,9,2,4,6,8,10);
		List<Integer> listInt5Add3 = listInt5.stream().map(x->x+3).collect(Collectors.toList());	//每个元素大写:[ACDC, NOOB, FXXKINGTOMBOYY, SWEET]
		System.out.println("listInt5每个元素+3后的新list:"+listInt5Add3);	//listInt5每个元素+3后的新list:[4, 6, 8, 10, 12, 5, 7, 9, 11, 13]
		System.out.println("----Q2----Q2----");
		//Q2:将两个字符数组合并成一个新的字符数组
		List<String> strList1 = Arrays.asList("m,k,l,a","1,3,5,7");
		//todo:有点模糊
		List<String> strListNew = strList1.stream().flatMap(x->{
			String[] split = x.split(",");
			Stream<String> s1 = Arrays.stream(split);
			return s1;
		}).collect(Collectors.toList());
		System.out.println("合并前数组:"+strList1);	//合并前数组:[m,k,l,a, 1,3,5,7]
		System.out.println("合并后数组:"+strListNew);	//合并后数组:[m, k, l, a, 1, 3, 5, 7]
		
		//6.归集(toList/toSet/toMap)
		//因为流不存储数据，那么在流中的数据完成处理后，需要将流中的数据重新归集到新的集合里
		//toList、toSet和toMap比较常用，另外还有toCollection、toConcurrentMap等复杂一些的用法
		//Q1:演示toList、toSet和toMap
		//todo:不会
		
		//7.统计(count/averaging)
		//Collectors提供了一系列用于数据统计的静态方法：
		//计数：count
		//平均值：averagingInt、averagingLong、averagingDouble
		//最值：maxBy、minBy
		//求和：summingInt、summingLong、summingDouble
		//统计以上所有：summarizingInt、summarizingLong、summarizingDouble
		//Q1:统计员工人数、平均工资、工资总额、最高工资
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Tom",6666,24,"male","ChengDu"));
		personList.add(new Person("Krystal",8888,28,"female","Shanghai"));
		personList.add(new Person("Jessica",12000,32,"female","Washiton"));
		personList.add(new Person("DoDo",7777,26,"male","ChengDu"));
		//求总数
		long personCount = personList.size();
		//求平均工资
		//todo:Collectors.averagingDouble(Person::getSalary)  不用双引号的话该怎么写
		Double averageSalary = personList.stream().collect(Collectors.averagingDouble(x->x.getSalary()));
		//求最高工资
		//todo:不用双引号该怎么写  .max(Integer::compare)
		Optional<Integer> maxSalaryPerson = personList.stream().map(x->x.getSalary()).max(Integer::compare);
		//求工资之和
		int sumSalaryAllPerson = personList.stream().mapToInt(x->x.getSalary()).sum();
		//一次性统计所有信息
		DoubleSummaryStatistics colletcAll = personList.stream().collect(Collectors.summarizingDouble(x-> x.getSalary()));
		System.out.println("员工总数:"+personCount);
		System.out.println("平均工资:"+averageSalary);
		System.out.println("最高工资:"+maxSalaryPerson.get());
		System.out.println("工资之和:"+sumSalaryAllPerson);
		System.out.println("员工工资所有统计:"+colletcAll);
		System.out.println("----------------------------");
		//8.分组(partitioningBy/groupingBy)
		//分区：将stream按条件分为两个Map，比如员工按薪资是否高于8000分为两部分。
		//分组：将集合分为多个Map，比如员工按性别分组。有单级分组和多级分组。
		//Q1:将员工按薪资是否高于8000分为两部分；将员工按性别和地区分组
		List<Person> personList2 = new ArrayList<Person>();
		personList2.add(new Person("Tom",6666,24,"male","ChengDu"));
		personList2.add(new Person("Krystal",8888,28,"female","Shanghai"));
		personList2.add(new Person("Jessica",12000,32,"female","Washiton"));
		personList2.add(new Person("DoDo",7777,26,"male","ChengDu"));
		//todo:part和group的区别
		//将员工按薪资是否高于8000分组
		Map<Boolean,List<Person>> partSalaryHigh8000 = personList2.stream().collect(Collectors.partitioningBy(x->x.getSalary()>8000));
		//将员工按性别分组
		Map<String,List<Person>> groupBySex = personList2.stream().collect(Collectors.groupingBy(x->x.getSex()));
		//将员工先按性别分组，再按地区分组
		Map<String,Map<String,List<Person>>> groupSomebody = personList2.stream().collect(Collectors.groupingBy(x->x.getSex(),Collectors.groupingBy(x->x.getArea())));
		System.out.println("员工按薪资是否大于80000分组情况:"+partSalaryHigh8000);
		System.out.println("员工按性别分组:"+groupBySex);
		System.out.println("员工先按性别分组，再按地区分组:"+groupSomebody);
		//todo:结果显示：
		//员工按薪资是否大于80000分组情况:{false=[com.example.stream.Person@6659c656, com.example.stream.Person@6d5380c2], true=[com.example.stream.Person@45ff54e6, com.example.stream.Person@2328c243]}
		//员工按性别分组:{female=[com.example.stream.Person@45ff54e6, com.example.stream.Person@2328c243], male=[com.example.stream.Person@6659c656, com.example.stream.Person@6d5380c2]}
		//员工先按性别分组，再按地区分组:{female={Washiton=[com.example.stream.Person@2328c243], Shanghai=[com.example.stream.Person@45ff54e6]}, male={ChengDu=[com.example.stream.Person@6659c656, com.example.stream.Person@6d5380c2]}}
		System.out.println("--------------------");
		//8.接合(joining)
		//joining可以将stream中的元素用特定的连接符（没有的话，则直接连接）连接成一个字符串
		List<Person> personList3 = new ArrayList<Person>();
		personList3.add(new Person("Tom",6666,24,"male","ChengDu"));
		personList3.add(new Person("Krystal",8888,28,"female","Shanghai"));
		personList3.add(new Person("Jessica",12000,32,"female","Washiton"));
		personList3.add(new Person("DoDo",7777,26,"male","ChengDu"));
		
		System.out.println(personList3);
		String namePersonList3 = personList3.stream().map(x->x.getName()).collect(Collectors.joining(","));
		System.out.println("所有员工姓名:"+namePersonList3);
		List<String> listLetter = Arrays.asList("A","B","C");
		String strLetterJoin = listLetter.stream().collect(Collectors.joining("-"));
		System.out.println("拼接后的字母串："+strLetterJoin);
		System.out.println("--------------------");
		
		//9.排序(sorted)
		//sorted()：自然排序，流中元素需实现Comparable接口
		//sorted(Comparator com)：Comparator排序器自定义排序
		
		//Q1:将员工按工资由高到低（工资一样则按年龄由大到小）排序
		List<Person> personList4 = new ArrayList<Person>();
		personList4.add(new Person("Tom",6666,24,"male","ChengDu"));
		personList4.add(new Person("Krystal",8888,28,"female","Shanghai"));
		personList4.add(new Person("Jessica",12000,32,"female","Washiton"));
		personList4.add(new Person("DoDo",7777,26,"male","ChengDu"));
		personList4.add(new Person("BoBo",7777,21,"male","ChengDu"));
		// 按工资升序排序（自然排序）
		List<String> salarySortToHigh = personList4.stream().sorted(Comparator.comparing(x->x.getSalary())).map(x->x.getName()).collect(Collectors.toList());
		// 按工资倒序排序
		//todo:这一行不用双引号怎么写
		List<String> salarySortToLow = personList4.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).map(x->x.getName()).collect(Collectors.toList());
		// 先按工资再按年龄升序排序
		List<String> groupListBySalaryByAge = personList4.stream().sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge)).map(x->x.getName()).collect(Collectors.toList());
		System.out.println("按工资升序排序："+salarySortToHigh);
		System.out.println("按工资降序排序："+salarySortToLow);
		System.out.println("先按工资再按年龄升序排序：" +groupListBySalaryByAge);
		
		//10.提取/组合
		//流也可以进行合并、去重、限制、跳过等操作。
		String[] arrStr1 = {"a","b","c","d"};
		String[] arrStr2 = {"a","b","f","g"};
		Stream<String> streamLetter1 = Arrays.stream(arrStr1);
		Stream<String> streamLetter2 = Arrays.stream(arrStr2);
		//concat:合并两个流 distinct：去重
		List<String> arrList3 = Stream.concat(streamLetter1,streamLetter2).distinct().collect(Collectors.toList());
		// limit：限制从流中获得前n个数据
		List<Integer> listLimit = Stream.iterate(1, x->x+2).limit(8).collect(Collectors.toList());
		// skip：跳过前n个数据
		List<Integer> listSkipLimit = Stream.iterate(1,x->x+2).skip(3).limit(5).collect(Collectors.toList());
		System.out.println("流合并：" + arrList3);
		System.out.println("limit：" + listLimit);
		System.out.println("skip：" + listSkipLimit);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
