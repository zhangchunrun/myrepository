package com.itheima.file;

import java.io.File;

/*
 *  File����жϷ���
 */
public class FileDemo05 {
	public static void main(String[] args) {
		demo04();
	}
	/*
	 *  boolean isFile()
	 *	�ж�File���췽���е�·��,�ǲ����ļ�
	 *  ����Ƿ���true
	 */
	public static void demo04(){
		File file = new File("C:\\eclipse\\p2");
		boolean b = file.isFile();
		System.out.println(b);
	}
	
	/*
	 *  boolean isDirectory()
	 *  �ж�File���췽���е�·��,�ǲ���Ŀ¼,�ǲ����ļ���
	 *  ����Ƿ���true
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
	 *  �ж�File���췽���е�·��,�ǲ��Ǿ���·��
	 *  �Ǿ���·��,����true
	 */
	public static void demo02(){
		File file = new File("C:\\eclipse\\p2");
		boolean b = file.isAbsolute();
		System.out.println(b);
	}
	
	/*
	 *  boolean exists()
	 *  �ж�·���Ƿ����,File���췽���е�·��
	 *  ���ڷ���true
	 */
	public static void demo01(){
		File file = new File("C:\\eclipse\\p2");
		boolean b = file.exists();
		System.out.println(b);
	}
}
