package com.example.homework;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWorkShi1 {
		///数据1|2|3|4|5|6|7
		//1.转换为一个数组：
		//2.分别使用foreach;fori;stream 转换为LIst集合 https://vimsky.com/examples/usage/arrays-stream-method-in-java.html
		//3.分别使用foreach;for;stream 对里面的元素+1 转为一个新的list集合 小扩展 扩展点：stream中.map算子使用方法
		//4.将2，和3的集合放到一个LIst<List>集合中
		//5.将个LIst<List>的集合转换为List集合fori foreach stream
		//6.将List集合转换为Map 其中key为里面的元素乘以10 value：为元素本身 （使用foreach、fori、stream（这里可以看下Collection.toMap）） 扩展提
		
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
			//Q1:转换为一个数组
			String str1 = "1|2|3|4|5|6|7";
			String ss[] = str1.split("\\|");	//  “.”和“|”都是转义字符，必须得加"\\";
			for (int i=0;i<ss.length;i++){
				System.out.println(ss[i]);
			}
			
			//Q2:分别使用foreach;fori;stream 转换为LIst集合
			//fori
			ArrayList<String> listFori = new ArrayList<>();
			for (int j=0;j<ss.length;j++){
				listFori.add(j, ss[j]);
			}
			System.out.println("fori:" + listFori);
			//foreach
			/*
				for(数据类型 变量：数组或集合){
						循环体
				 }
			*/
			ArrayList<String> listForEach = new ArrayList<>();
			for (String j:ss
				 ) {
				listForEach.add(j);
			}
			System.out.println("foreach:" + listForEach);
			//stream
			//使用Stream中的Collector收集器
			//todo:(ArrayList<String>)  Stream中通过收集器collect收集后 与之(ArrayList<String>)关系
			ArrayList<String> listStream = (ArrayList<String>) Arrays.stream(ss).collect(Collectors.toList());
			//ArrayList<String> listStream1 = (ArrayList<String>) Stream.of(ss).collect(Collectors.toList());	//通过Stream.of()将数组ss[]转换成流
			System.out.println("----"+listStream);
			System.out.println("stream:" + listStream);
			
			//Q3:分别使用foreach;for;stream 对里面的元素+1 转为一个新的list集合
			//fori
			ArrayList<String> listForiAddOne = new ArrayList<>();
			for (int k=0;k<listFori.size();k++){
				listForiAddOne.add(k, (Integer.parseInt(listFori.get(k))+1)+"");	//将list中元素转换成int 再对其+1
			}
			System.out.println("对listFori的元素+1:" + listForiAddOne);
			//foreach
			ArrayList<String> listForEachAddOne = new ArrayList<>();
			for (String k:listForEach
				 ) {
				listForEachAddOne.add((Integer.parseInt(k)+1)+"");	//将list中元素转换成int 再对其+1
			}
			System.out.println("对listForEach的元素+1:" + listForEachAddOne);
			//stream
			//例子：List<Integer> intListNew = intList.stream().map(x -> x + 3).collect(Collectors.toList());
			//ArrayList<String> listStreamAddOne = new ArrayList<>();
			//通过对List.stream().map() 可以拿到流中的每个元素 对其进行操作后 再通过收集器collect收集回流中
			ArrayList<String> listStreamAddOne = (ArrayList<String>) listStream.stream().map(x -> (Integer.parseInt(x)+1)+"").collect(Collectors.toList());
			System.out.println("对listStream的元素+1:" + listStreamAddOne);
			
			//Q4:将2，和3的集合放到一个LIst<List>集合中
			List<ArrayList<String>> listList = new ArrayList<>();
			listList.add(listFori);
			listList.add(listForiAddOne);
			System.out.println(listList);
			
			//Q5:将LIst<List>的集合转换为List集合fori foreach stream
			//fori
			List<String> listSimpleFori = new ArrayList<>();
			for (int i1=0;i1<listList.size();i1++){
				for (int j1=0;j1<listList.get(i1).size();j1++){
					listSimpleFori.add(listList.get(i1).get(j1));
				}
			}
			System.out.println("新ListFori:" + listSimpleFori);
			//foreach
			List<String> listSimpleForEach = new ArrayList<>();
			for (List<String> list:listList){
				for (String str:list){
					listSimpleForEach.add(str);
				}
			}
			System.out.println("新ListForEach:" + listSimpleForEach);
			//stream
			//todo:对flatmap用法模糊
			List<String> listSimpleStream = listList.stream().flatMap(Collection::stream).collect(Collectors.toList());
			System.out.println("新ListStream:" + listSimpleStream);
			
			//Q6:将List集合转换为Map 其中key为里面的元素乘以10 value：为元素本身 （使用foreach、fori、stream（这里可以看下Collection.toMap））
			//定义一个Map的容器对象
			//fori
			Map<Integer,String> mapFori = new HashMap<Integer,String>();
			for (int i2=0;i2<listSimpleFori.size();i2++){
				//System.out.println(listSimpleFori.get(i2));
				mapFori.put((Integer.parseInt(listSimpleFori.get(i2))*10),listSimpleFori.get(i2));
				System.out.println(mapFori);
			}
			System.out.println("mapFori:" + mapFori);
			
			
			
			
			
			
		}

}