package cn.zucc.day02;

import java.util.Scanner;

public class Password {
	String name ;
	int password;
	int newpwd;
	int newpwd2;
	Scanner sc = new Scanner(System.in);
	
	public void change(){
		
		
		System.out.println("�������˺�");
		name = sc.next();
		System.out.println("����������");
		password = sc.nextInt();
		if(name.equals("admin")&& password==111111){
			newpwd();
		}else{
			change();
		};
	}
	public void newpwd(){
		do{
		System.out.println("�����������룺");
		newpwd = sc.nextInt();
		System.out.println("���ٴ����������룺");
		newpwd2 = sc.nextInt();
		}while(newpwd != newpwd2);
		System.out.println("�޸�����ɹ�������������Ϊ��"+newpwd);
	}
}
