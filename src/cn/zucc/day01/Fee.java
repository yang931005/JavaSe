package cn.zucc.day01;

import java.util.Scanner;

public class Fee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--欢迎来到文达教育--");
		System.out.println("文达课程服务：");
		System.out.println("文达课程服务：");
		System.out.println("1.Java软件工程师培训。    （学费：20RMB）");
		System.out.println("2.Android手机开发培训。 （学费：30RMB）");
		System.out.println("3.淘宝开店营销培训。          （学费：10RMB）");
		System.out.println("4.嵌入式工程师培训。          （学费：30RMB）");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入参加java软件工程师培训的学员人数");
		int javanum = sc.nextInt();
		System.out.println("请输入参加Android手机开发培训的学员人数");
		int Anderoidnum = sc.nextInt();
		System.out.println("请输入参加淘宝开店营销培训的学员人数");
		int taobaonum = sc.nextInt();
		System.out.println("请输入参加嵌入式工程师培训的学员人数");
		int linuxnum = sc.nextInt();
		System.out.println("!!!你享受的折扣是8折优惠！！！");
		double money = javanum*20+Anderoidnum*30+taobaonum*10+linuxnum*30;
		System.out.println("您打折钱支付总学费："+money);
		double money2=money*0.8;
		System.out.println("折后你应该支付的学费:"+money2);
		System.out.println("请支付:");
		double paymoney = sc.nextDouble();
		System.out.println("实际支付:"+paymoney);
		double change = paymoney-money2;
		System.out.println("找零："+change);
		int integral = (int)(money2/100);
		System.out.println("你获得积分:"+integral);
		System.out.println("祝您学习愉快！");
		
	}

}
