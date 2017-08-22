package com.itheima.file;

import java.io.File;

/*
 *  File类的方法 list开头的方法
 */
public class FileDemo07 {
	public static void main(String[] args) {
		demo03();
	}
	/*
	 *  File[] listFiles()
	 *  返回File构造方法中路径,下的所有子路径和文件
	 *  遍历目录: 结果,全路径
	 */
	public static void demo03(){
		File file = new File("c:\\");
		File[] files = file.listFiles();
		for(File f : files){
			System.out.println(f);
		}
	}
	
	/*
	 *  String[] list()
	 *  返回File构造方法中路径,下的所有子路径和文件
	 *  遍历目录
	 */
	public static void demo02(){
		File file = new File("c:\\");
		String[] str = file.list();
		System.out.println(str.length);
		for(String s : str){
			System.out.println(s);
		}
	}
	
	/*
	 *  static File[] listRoots()
	 *  获取系统根目录
	 */
	public static void demo01(){
		File[] files = File.listRoots();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
