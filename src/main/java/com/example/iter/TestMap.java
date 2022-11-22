package com.example.iter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("kk", "kiki");
		map.put("Do","do2h" );
		map.put("mo","moriie" );
		map.put("suki","张姐" );
		
		//方案一
		System.out.println("----方案一----");
		Set set1 = map.keySet();		//拿到map的key值Set集合
		Iterator it1 = set1.iterator();	//拿到迭代器
		
		//判断set集合是否有元素
		while (it1.hasNext()){
			String key = (String) it1.next();
			System.out.println("Value:"+map.get(key));	//通过key获取到value
		}
		
		//方案二
		System.out.println("----方案二----");
		Set set2 = map.entrySet();		//set集合装的是entry(key:value)  类似于键值对？？
		Iterator it2 = set2.iterator();		//再将entrySet装进迭代器
		
		while (it2.hasNext()){
			Map.Entry entry = (Map.Entry) it2.next();	//因为迭代器中装的entrySet 所以需要重新强转为Entry
			//通过entry.get方法  能拿到key 和 value
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}
	}
}
