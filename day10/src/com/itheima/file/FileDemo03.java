package com.itheima.file;

import java.io.File;
import java.io.IOException;

/*
 * File�ഴ������
 */
public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		demo02();
	}
	/*
	 *  boolean mkdir() һ��
	 *  �����ļ���,�����ɹ�����true
	 *  ����ļ��д���,���ڴ���
	 *  �������ļ���·�����ļ�����,д��File���췽��
	 *  
	 *  boolean mkdirs()���,����һ��
	 */
	public static void demo02(){
		File file = new File("c:\\abc\\a\\b");
		boolean b = file.mkdirs();
		System.out.println(b);
	}
	/*
	 *  boolean createNewFile()
	 *  �����µ��ļ�,�����ɹ�����true
	 *  �ļ����ڲ�����
	 *  �������ļ�·�����ļ���,д��File���췽��
	 */
	public static void demo01()throws IOException{
		File file = new File("c:\\1.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
	}
}
