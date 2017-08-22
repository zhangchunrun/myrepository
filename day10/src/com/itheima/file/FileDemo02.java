package com.itheima.file;

import java.io.File;

/*
 *  File类的构造方法
 *  三种重载形式
 */
public class FileDemo02 {
	public static void main(String[] args) {
		demo03();
	}
	/*
	 *  File(File parent,String child)
	 *  传递File类型的父路径,字符串的子路径
	 */
	public static void demo03(){
		File parent = new File("c:\\");
		File file = new File(parent, "eclipse");
		System.out.println(file);
	}
	/*
	 *  File(String parent,String child)
	 *  传递字符串形式的父路径,字符串形式的子路径
	 */
	public static void demo02(){
		File file = new File("c:\\","eclispe");
		System.out.println(file);
	}
	
	/*
	 *  File(String pathname)
	 *  传递字符串形式的路径 (表示为文件夹,表示为文件)
	 *  路径,变成File 对象
	 */
	public static void demo01(){
		File file = new File("C:\\eclipse\\p2\\pools.info");
		System.out.println(file);
	}
}
