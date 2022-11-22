package com.example.file;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		try {
			
			
			//file.createNewFile();		//创建一个文件 不包含文件夹
			
			//file.mkdirs();		//创建文件夹一定选这个 可以帮我们把上级目录创建出来
			
			//file.renameTo(new File("abc/def/c.txt"));		//重命名
			/*
			//查看相关
			System.out.println(file.exists());	//查看文件是否存在
			
			System.out.println(file.isAbsolute());	//查看是否是绝对路径
			
			System.out.println(file.isDirectory());	//查看是否是文件夹
			
			System.out.println(file.isFile());	//查看是否是文件
			
			System.out.println(file.length());	//查看文件大小
			
			System.out.println(file.getName());	//拿到当前文件名
			*/
			
			//创建文件完整步骤
			File file = new File("abc/def/a.txt");
			
			//1.判断上层文件夹是否存在
			File parentFile = file.getParentFile();		//拿到上一层文件夹的对象
			System.out.println(parentFile);
			
			if (!parentFile.exists()){
				parentFile.mkdirs();	//创建上层文件夹
			}
			//2.创建文件
			file.createNewFile();
		
		
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
