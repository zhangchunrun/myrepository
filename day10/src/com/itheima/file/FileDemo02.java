package com.itheima.file;

import java.io.File;

/*
 *  File��Ĺ��췽��
 *  ����������ʽ
 */
public class FileDemo02 {
	public static void main(String[] args) {
		demo03();
	}
	/*
	 *  File(File parent,String child)
	 *  ����File���͵ĸ�·��,�ַ�������·��
	 */
	public static void demo03(){
		File parent = new File("c:\\");
		File file = new File(parent, "eclipse");
		System.out.println(file);
	}
	/*
	 *  File(String parent,String child)
	 *  �����ַ�����ʽ�ĸ�·��,�ַ�����ʽ����·��
	 */
	public static void demo02(){
		File file = new File("c:\\","eclispe");
		System.out.println(file);
	}
	
	/*
	 *  File(String pathname)
	 *  �����ַ�����ʽ��·�� (��ʾΪ�ļ���,��ʾΪ�ļ�)
	 *  ·��,���File ����
	 */
	public static void demo01(){
		File file = new File("C:\\eclipse\\p2\\pools.info");
		System.out.println(file);
	}
}
