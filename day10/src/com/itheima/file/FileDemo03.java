package com.itheima.file;

import java.io.File;
import java.io.IOException;

/*
 * File类创建功能
 */
public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		demo02();
	}
	/*
	 *  boolean mkdir() 一层
	 *  创建文件夹,创建成功返回true
	 *  如果文件夹存在,不在创建
	 *  创建的文件夹路径和文件夹名,写在File构造方法
	 *  
	 *  boolean mkdirs()多层,或者一层
	 */
	public static void demo02(){
		File file = new File("c:\\abc\\a\\b");
		boolean b = file.mkdirs();
		System.out.println(b);
	}
	/*
	 *  boolean createNewFile()
	 *  创建新的文件,创建成功返回true
	 *  文件存在不创建
	 *  创建的文件路径和文件名,写在File构造方法
	 */
	public static void demo01()throws IOException{
		File file = new File("c:\\1.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
	}
}
