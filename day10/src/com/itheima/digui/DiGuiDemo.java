package com.itheima.digui;
/*
 *  递归:
 *    方法自己调用自己,递归调用
 *    自身调用
 *    是一种在编程上的技巧而已
 *    
 *  应用: 方法中的功能主体确定,每次操作的参数是不同的
 *    遍历目录:方法作用就是遍历目录,但是每次遍历的目录是不同的
 *    
 *  弊端: 消耗内存
 *  
 *  直接递归,间接的递归
 *  
 *  注意实现:
 *    递归调用,必须有出口 (结束调用),死递归
 *    递归调用,次数不能太多, 方法进栈的次数太多,导致内存溢出
 *    构造方法不能递归,编译失败
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		int sum = get(10);//2004310016  int取值: 2147483647
		System.out.println(sum);
	}
	/*
	 *  计算阶乘
	 *  5!  1*2*3*5 
	 *  10! 1*2*3*10
	 */
	public static int get(int num){
		if(num == 1)
			return 1;
		return num * get(num-1);
	}
	
	/*
	 *  规律:
	 *    3+ (3-1) + (3-1-1)
	 *    num +(num-1)+(num-1-1)
	 *    num减到1,结束了
	 */
	public static int getSum(int num){
		if(num==1)
			return 1;
		return num + getSum(num-1);
	}
	
	/*
	 *  高斯算法 1+2+3+4...+100 = 5050
	
	public static int getSum(int num){
		int sum = 0 ;
		for(int i = 1 ; i <= num ;i++){
			sum = sum + i;
		}
		return sum;
	} */
	
	
	
	
}
