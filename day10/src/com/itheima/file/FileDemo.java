package com.itheima.file;

import java.io.File;

/*
 *  操作系统.三个内容
 *    文件: File  保存数据
 *    目录: Directory 文件夹 (文件容器)
 *    路径: Path 文件或者是目录,在操作系统中的存储位置
 *  java.io.File类,三个内容,封装对象
 *  File类提供大量的方法,操作,文件,目录,路径
 *  类具有跨平台特性
 */
public class FileDemo {
	public static void main(String[] args) {
		//File类的静态成员变量
		//static String pathSeparator 路径分隔符
		String s = File.pathSeparator;
		System.out.println(s);// 分号; 一个路径的结束符号  Windows ; Unix,Linux 冒号:
		
		//static String separator  名称分隔符
		s = File.separator;
		System.out.println(s);// \ 一个目录的结束  Windows \ Unix,Linux /
	
	}
}





