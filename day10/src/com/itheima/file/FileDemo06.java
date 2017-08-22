package com.itheima.file;

import java.io.File;

/*
 *  File���ȡ����
 */
public class FileDemo06 {
	public static void main(String[] args) {
		demo05();
	}
	/*
	 *  File getParentFile()
	 *  String getParent()
	 *  ��ȡFile���췽����·���ĸ�·��
	 */
	public static void demo05(){
		File file = new File("c:\\eclipse\\p2");
		File parent = file.getParentFile();
		System.out.println(parent);
	}
	
	/*
	 *  File getAbsoluteFile()
	 *  String getAbsolutePath()
	 *  ��ȡ����·��
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
	 *  ����File���췽����·��,��ʾ�ļ����ֽ���
	 *  ע��: �ļ���û���ֽ���
	 */
	public static void demo03(){
		File file = new File("c:\\eclipse\\eclipse.exe");
		long l = file.length();
		System.out.println(l);
	}
	
	/*
	 *  String getPath()
	 *  File���췽���е�·��,ת���ַ���
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
	 *  ��ȡ,File���췽����,·��,��ʾ���ļ����������ļ�����
	 *  ·������������(�������ļ�,�����ļ���)
	 */
	public static void demo01() {
		File file = new File("c:\\eclipse\\p2");
		String name = file.getName();
		System.out.println(name);
	}
}










