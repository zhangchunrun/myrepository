package com.itheima.file;

import java.io.File;
import java.io.FileFilter;

/*
 *  自定义的文件过滤器
 *  实现接口 FileFilter,重写方法 accept
 */
public class MyFilter implements FileFilter{
	//方法的参数pathname,接收到listFiles()方法获取的所有路径
	//对这些路径进行判断,路径表示的文件名的后缀是.java,返回true
	public boolean accept(File pathname) {
		//File对象的方法getName()获取文件名
		//String name = pathname.getName();
		return pathname.getName().toLowerCase().endsWith(".java");
	
	}
	 
}
