package cn.zucc.day02;

import java.util.Scanner;

public class Password {
	String name ;
	int password;
	int newpwd;
	int newpwd2;
	Scanner sc = new Scanner(System.in);
	
	public void change(){
		
		
		System.out.println("请输入账号");
		name = sc.next();
		System.out.println("请输入密码");
		password = sc.nextInt();
		if(name.equals("admin")&& password==111111){
			newpwd();
		}else{
			change();
		};
	}
	public void newpwd(){
		do{
		System.out.println("请输入新密码：");
		newpwd = sc.nextInt();
		System.out.println("请再次输入新密码：");
		newpwd2 = sc.nextInt();
		}while(newpwd != newpwd2);
		System.out.println("修改密码成功，您的新密码为："+newpwd);
	}
}
