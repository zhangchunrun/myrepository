package com.itheima.file;

import java.io.File;

/*
 *  File��ķ��� list��ͷ�ķ���
 */
public class FileDemo07 {
	public static void main(String[] args) {
		demo03();
	}
	/*
	 *  File[] listFiles()
	 *  ����File���췽����·��,�µ�������·�����ļ�
	 *  ����Ŀ¼: ���,ȫ·��
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
	 *  ����File���췽����·��,�µ�������·�����ļ�
	 *  ����Ŀ¼
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
	 *  ��ȡϵͳ��Ŀ¼
	 */
	public static void demo01(){
		File[] files = File.listRoots();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
