package com.itheima.file;

import java.io.File;

/*
 *  演示目录:
 *    c:\\abc
 *      |-- a
 *        |-- 1.txt
 *        |-- 2.txt
 *      |-- b
 *        |-- 3.txt
 *        |-- 4.pptx
 *      |-- 1.txt
 *      |-- 2.docx
 *  将abc目录下的所有内容,全部遍历完成,包括子目录
 */
public class GetAllDir {
	public static void main(String[] args) {
		getAllDir(new File("c:\\abc"));
	}
	/*
	 * 创建方法:
	 *   传递目录, 对这个目录,全遍历
	 */
	public static void getAllDir(File dir){
		//dir对象调用方法listFiles,遍历目录
		File[] files = dir.listFiles();
		//遍历数组
		for(File file : files){
			//对file遍历到的路径判断,是不是目录,文件夹
			if(file.isDirectory())
				//没有必要在写个相同的方法,去遍历
				//调用自己的方式
				getAllDir(file);
			System.out.println(file);
		}
	}
}
