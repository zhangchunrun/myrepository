package com.itheima.digui;
/*
 *  �ݹ�:
 *    �����Լ������Լ�,�ݹ����
 *    �������
 *    ��һ���ڱ���ϵļ��ɶ���
 *    
 *  Ӧ��: �����еĹ�������ȷ��,ÿ�β����Ĳ����ǲ�ͬ��
 *    ����Ŀ¼:�������þ��Ǳ���Ŀ¼,����ÿ�α�����Ŀ¼�ǲ�ͬ��
 *    
 *  �׶�: �����ڴ�
 *  
 *  ֱ�ӵݹ�,��ӵĵݹ�
 *  
 *  ע��ʵ��:
 *    �ݹ����,�����г��� (��������),���ݹ�
 *    �ݹ����,��������̫��, ������ջ�Ĵ���̫��,�����ڴ����
 *    ���췽�����ܵݹ�,����ʧ��
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		int sum = get(10);//2004310016  intȡֵ: 2147483647
		System.out.println(sum);
	}
	/*
	 *  ����׳�
	 *  5!  1*2*3*5 
	 *  10! 1*2*3*10
	 */
	public static int get(int num){
		if(num == 1)
			return 1;
		return num * get(num-1);
	}
	
	/*
	 *  ����:
	 *    3+ (3-1) + (3-1-1)
	 *    num +(num-1)+(num-1-1)
	 *    num����1,������
	 */
	public static int getSum(int num){
		if(num==1)
			return 1;
		return num + getSum(num-1);
	}
	
	/*
	 *  ��˹�㷨 1+2+3+4...+100 = 5050
	
	public static int getSum(int num){
		int sum = 0 ;
		for(int i = 1 ; i <= num ;i++){
			sum = sum + i;
		}
		return sum;
	} */
	
	
	
	
}
