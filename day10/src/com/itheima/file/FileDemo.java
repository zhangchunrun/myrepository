package com.itheima.file;

import java.io.File;

/*
 *  ����ϵͳ.��������
 *    �ļ�: File  ��������
 *    Ŀ¼: Directory �ļ��� (�ļ�����)
 *    ·��: Path �ļ�������Ŀ¼,�ڲ���ϵͳ�еĴ洢λ��
 *  java.io.File��,��������,��װ����
 *  File���ṩ�����ķ���,����,�ļ�,Ŀ¼,·��
 *  ����п�ƽ̨����
 */
public class FileDemo {
	public static void main(String[] args) {
		//File��ľ�̬��Ա����
		//static String pathSeparator ·���ָ���
		String s = File.pathSeparator;
		System.out.println(s);// �ֺ�; һ��·���Ľ�������  Windows ; Unix,Linux ð��:
		
		//static String separator  ���Ʒָ���
		s = File.separator;
		System.out.println(s);// \ һ��Ŀ¼�Ľ���  Windows \ Unix,Linux /
	
	}
}





