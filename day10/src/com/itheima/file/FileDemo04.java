package com.itheima.file;

import java.io.File;

/*
 *  File���ɾ������
 *  boolean delete()
 *  �ļ�,�ļ���
 *  File���췽��д��·��
 *  ���߻���վ
 *  ɾ���ļ���,��֤�����ǿյ�
 */
public class FileDemo04 {
	public static void main(String[] args) {
		File file = new File("c:\\a");
		boolean b = file.delete();
		System.out.println(b);
	}
}
