package com.itheima.file;

import java.io.File;

/*
 *  File类获取方法
 */
public class FileDemo06 {
	public static void main(String[] args) {
		demo05();
	}
	/*
	 *  File getParentFile()
	 *  String getParent()
	 *  获取File构造方法中路径的父路径
	 */
	public static void demo05(){
		File file = new File("c:\\eclipse\\p2");
		File parent = file.getParentFile();
		System.out.println(parent);
	}
	
	/*
	 *  File getAbsoluteFile()
	 *  String getAbsolutePath()
	 *  获取绝对路径
	 *  
	 *  new FileWriter("1.txt")
	 */
	public static void demo04(){
		File file = new File("eclipse");
		File abs = file.getAbsoluteFile();
		System.out.println(abs);
	}
	
	/*
	 *  long length()
	 *  返回File构造方法中路径,表示文件的字节数
	 *  注意: 文件夹没有字节数
	 */
	public static void demo03(){
		File file = new File("c:\\eclipse\\eclipse.exe");
		long l = file.length();
		System.out.println(l);
	}
	
	/*
	 *  String getPath()
	 *  File构造方法中的路径,转成字符串
	 */
	public static void demo02(){
		File parent = new File("c:\\eclipse");
		File file = new File(parent,"p2");
		String path = file.getPath();
		System.out.println(path);
		System.out.println(file.toString());
	}
	
	/*
	 *  String getName()
	 *  获取,File构造方法中,路径,表示的文件名或者是文件夹名
	 *  路径最后面的名字(可能是文件,可能文件夹)
	 */
	public static void demo01() {
		File file = new File("c:\\eclipse\\p2");
		String name = file.getName();
		System.out.println(name);
	}
}










