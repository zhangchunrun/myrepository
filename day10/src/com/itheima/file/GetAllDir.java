package com.itheima.file;

import java.io.File;

/*
 *  ��ʾĿ¼:
 *    c:\\abc
 *      |-- a
 *        |-- 1.txt
 *        |-- 2.txt
 *      |-- b
 *        |-- 3.txt
 *        |-- 4.pptx
 *      |-- 1.txt
 *      |-- 2.docx
 *  ��abcĿ¼�µ���������,ȫ���������,������Ŀ¼
 */
public class GetAllDir {
	public static void main(String[] args) {
		getAllDir(new File("c:\\abc"));
	}
	/*
	 * ��������:
	 *   ����Ŀ¼, �����Ŀ¼,ȫ����
	 */
	public static void getAllDir(File dir){
		//dir������÷���listFiles,����Ŀ¼
		File[] files = dir.listFiles();
		//��������
		for(File file : files){
			//��file��������·���ж�,�ǲ���Ŀ¼,�ļ���
			if(file.isDirectory())
				//û�б�Ҫ��д����ͬ�ķ���,ȥ����
				//�����Լ��ķ�ʽ
				getAllDir(file);
			System.out.println(file);
		}
	}
}
