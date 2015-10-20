package cn.zucc.day02;

import java.util.Scanner;

public class Stu {	
	String name;
	int age;
	String classnum;
	String hobby;
	
	public void show(){
		System.out.println("请输入学生姓名");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		
		System.out.println("请输入学生年龄");
		age=sc.nextInt();
		
		System.out.println("请输入班级");
		classnum=sc.next();
		
		System.out.println("请输入学生爱好");
		hobby = sc.next();

		System.out.println("学生姓名："+name);
		System.out.println("学生年龄："+age);
		System.out.println("就读于："+classnum);
		System.out.println("爱好："+hobby);
	}
}
