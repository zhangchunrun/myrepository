package com.itheima.file;

import java.io.File;

/*
 *  File类的判断方法
 */
public class FileDemo05 {
	public static void main(String[] args) {
		demo04();
	}
	/*
	 *  boolean isFile()
	 *	判断File构造方法中的路径,是不是文件
	 *  如果是返回true
	 */
	public static void demo04(){
		File file = new File("C:\\eclipse\\p2");
		boolean b = file.isFile();
		System.out.println(b);
	}
	
	/*
	 *  boolean isDirectory()
	 *  判断File构造方法中的路径,是不是目录,是不是文件夹
	 *  如果是返回true
	 */
	public static void demo03(){
		File file = new File("C:\\eclipse\\p2");
		if(file.exists()){
			boolean b = file.isDirectory();
			System.out.println(b);
		}
	}
	
	/*
	 *  boolean isAbsolute()
	 *  判断File构造方法中的路径,是不是绝对路径
	 *  是绝对路径,返回true
	 */
	public static void demo02(){
		File file = new File("C:\\eclipse\\p2");
		boolean b = file.isAbsolute();
		System.out.println(b);
	}
	
	/*
	 *  boolean exists()
	 *  判断路径是否存在,File构造方法中的路径
	 *  存在返回true
	 */
	public static void demo01(){
		File file = new File("C:\\eclipse\\p2");
		boolean b = file.exists();
		System.out.println(b);
	}
}
