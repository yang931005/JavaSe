package cn.zucc.day01;

import java.util.Scanner;

public class raffle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("学号个位上数字之和等于20的本期幸运学生");
		System.out.println("请输入学员的四位学号:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a=number%10;
		int b=number%100/10;
		int c=number%1000/100;
		int d=number/1000;
		int e=a+b+c+d;
		System.out.println("你的学号各位上数字之和是:"+e);
		boolean x = e==20;
		System.out.println("你是幸运学生:"+x);
	}

}
