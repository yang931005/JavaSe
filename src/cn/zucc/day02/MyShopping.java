package cn.zucc.day02;

import java.util.Scanner;

public class MyShopping {
	int num;
	Scanner sc = new Scanner(System.in);
	String name;
	int password;
	
	
	public void maininterf(){
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		System.out.println("*****************");
		System.out.println("请选择输入数字");
		num = sc.nextInt();
		switch(num){
		case 1:
			System.out.println("请输入用户名");
			name = sc.next();
			System.out.println("请输入密码");
			password = sc.nextInt();
			if(name.equals("admin")&&password==111111){
				mainmenu();
			}else{
				System.out.println("您没有权限进入系统，请重新登录");
				maininterf();
			}break;
		case 2:
			System.out.println("谢谢使用");break;
		}
	}
	public void mainmenu(){
		System.out.println("\t我行我素购物管理系统主菜单");
		System.out.println("**********************");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.真情回馈");
		System.out.println("**********************");
		System.out.println("请选择输入数字或按0返回上一级菜单");
		num = sc.nextInt();
		switch(num){
		case 1:
			System.out.println("谢谢光临");break;
		case 2:
			Feedback();break;
		case 3:
			maininterf();break;
		}
	}
	
	public void Feedback(){
		System.out.println("\t我行我素购物管理系统、真情回馈");
		System.out.println("\t\t1.幸运大放送");
		System.out.println("\t\t2.幸运抽奖");
	}
}
