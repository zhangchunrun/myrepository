package com.itheima.file;

import java.io.File;

/*
 *  演示目录 c:\\abc
 *  遍历目录 ,获取目录中的文件
 *  但是,只要.java文件,其他文件不需要
 *  文件的过滤器
 *  
 *  File[] listFiles(FileFilter filter)
 *  传递文件过滤器的对象 
 *  FileFilter 是java.io.接口
 *  方法,传递接口的实现类对象
 *  自定义接口的实现类
 *  
 *  new MyFilter()
 */
public class FileDemo08 {
	public static void main(String[] args) {
		File dir = new File("c:\\abc");
		File[] files = dir.listFiles(new MyFilter());
		for(File file : files){
			System.out.println(file);
		}
	}
}
