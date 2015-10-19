package cn.zucc.day01;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int money = 1000;
		double newMoney=money+money*0.05;
		System.out.println("一年之后钱变成了："+newMoney);
		double javaScore=98.5;
		System.out.println("java最高分为:"+javaScore);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入张三的SQL成绩");
		double sqlScore = sc.nextDouble();
		
		System.out.println("张三的java成绩：");
		double javaScore = sc.nextDouble();
		
		System.out.println("张三的android成绩：");
		double androidScore = sc.nextDouble();
		
		double differ = javaScore-sqlScore;
		System.out.println("java课和sql课的分差为："+differ);
		double ave = (javaScore+sqlScore+androidScore)/3;
		System.out.println("3门课的平均分:"+ave);
		*/
		double avgScore = 81.29;
		int rise = 2;
		double newScore = avgScore + rise;
		System.out.println("新的平均分为:"+newScore);
		
	}

}
