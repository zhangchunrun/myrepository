package com.itheima.file;

import java.io.File;

/*
 *  ��ʾĿ¼ c:\\abc
 *  ����Ŀ¼ ,��ȡĿ¼�е��ļ�
 *  ����,ֻҪ.java�ļ�,�����ļ�����Ҫ
 *  �ļ��Ĺ�����
 *  
 *  File[] listFiles(FileFilter filter)
 *  �����ļ��������Ķ��� 
 *  FileFilter ��java.io.�ӿ�
 *  ����,���ݽӿڵ�ʵ�������
 *  �Զ���ӿڵ�ʵ����
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
