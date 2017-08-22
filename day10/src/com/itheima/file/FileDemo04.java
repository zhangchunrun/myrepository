package com.itheima.file;

import java.io.File;

/*
 *  File类的删除方法
 *  boolean delete()
 *  文件,文件夹
 *  File构造方法写的路径
 *  不走回收站
 *  删除文件夹,保证里面是空的
 */
public class FileDemo04 {
	public static void main(String[] args) {
		File file = new File("c:\\a");
		boolean b = file.delete();
		System.out.println(b);
	}
}
