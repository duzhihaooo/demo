![image-20221228190741077](https://shizeying.space/typora/2022/12/28/19-07-41.png)

```java
	List<String> rdd1 = new ArrayList<>() {{
						add("this is test");
						add("hello world");
				}};
	rdd1.stream()
							.map(i->i.split(" "))
							.flatMap(i->Arrays.stream(i))
							.collect(Collectors.toList());





```

![image-20221228191158162](https://shizeying.space/typora/2022/12/28/19-11-58.png)

![image-20221228191454775](https://shizeying.space/typora/2022/12/28/19-14-54.png)

- 单个元素：是map
- 元素数组：是flatMap

![image-20221228191924027](https://shizeying.space/typora/2022/12/28/19-19-24.png)