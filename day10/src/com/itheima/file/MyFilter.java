package com.itheima.file;

import java.io.File;
import java.io.FileFilter;

/*
 *  �Զ�����ļ�������
 *  ʵ�ֽӿ� FileFilter,��д���� accept
 */
public class MyFilter implements FileFilter{
	//�����Ĳ���pathname,���յ�listFiles()������ȡ������·��
	//����Щ·�������ж�,·����ʾ���ļ����ĺ�׺��.java,����true
	public boolean accept(File pathname) {
		//File����ķ���getName()��ȡ�ļ���
		//String name = pathname.getName();
		return pathname.getName().toLowerCase().endsWith(".java");
	
	}
	 
}
