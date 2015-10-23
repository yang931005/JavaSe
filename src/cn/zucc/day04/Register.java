package cn.zucc.day04;

import java.util.Scanner;

public class Register {
	public void verify(){
		System.out.println("请输入用户名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("请输入密码：");
		String psw = sc.next();
		if(name.length()>2&&psw.length()>=6){
			System.out.println("注册成功！");
		}else{
			System.out.println("注册失败！");
		}
	}
}
