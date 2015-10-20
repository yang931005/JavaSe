package cn.zucc.day02;

import java.util.Scanner;

public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		String flag;
		do{
		Cus cu = new Cus();
		System.out.println("请输入游客姓名：");
		cu.name = sc.next();
		System.out.println("请输入游客年龄：");
		cu.age = sc.nextInt();
		
		cu.ticket();
		
		System.out.println("是否继续输入？（y/n）");
		flag = sc.next();
		}while(flag.equals("y"));
		*/
		
		MyShopping ms = new MyShopping();
		ms.maininterf();
		
	}

}
