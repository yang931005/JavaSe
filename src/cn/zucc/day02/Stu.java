package cn.zucc.day02;

import java.util.Scanner;

public class Stu {	
	String name;
	int age;
	String classnum;
	String hobby;
	
	public void show(){
		System.out.println("������ѧ������");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		
		System.out.println("������ѧ������");
		age=sc.nextInt();
		
		System.out.println("������༶");
		classnum=sc.next();
		
		System.out.println("������ѧ������");
		hobby = sc.next();

		System.out.println("ѧ��������"+name);
		System.out.println("ѧ�����䣺"+age);
		System.out.println("�Ͷ��ڣ�"+classnum);
		System.out.println("���ã�"+hobby);
	}
}
