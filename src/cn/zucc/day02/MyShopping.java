package cn.zucc.day02;

import java.util.Scanner;

public class MyShopping {
	int num;
	Scanner sc = new Scanner(System.in);
	String name;
	int password;
	
	
	public void maininterf(){
		System.out.println("\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		System.out.println("*****************");
		System.out.println("��ѡ����������");
		num = sc.nextInt();
		switch(num){
		case 1:
			System.out.println("�������û���");
			name = sc.next();
			System.out.println("����������");
			password = sc.nextInt();
			if(name.equals("admin")&&password==111111){
				mainmenu();
			}else{
				System.out.println("��û��Ȩ�޽���ϵͳ�������µ�¼");
				maininterf();
			}break;
		case 2:
			System.out.println("ллʹ��");break;
		}
	}
	public void mainmenu(){
		System.out.println("\t�������ع������ϵͳ���˵�");
		System.out.println("**********************");
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������");
		System.out.println("**********************");
		System.out.println("��ѡ���������ֻ�0������һ���˵�");
		num = sc.nextInt();
		switch(num){
		case 1:
			System.out.println("лл����");break;
		case 2:
			Feedback();break;
		case 3:
			maininterf();break;
		}
	}
	
	public void Feedback(){
		System.out.println("\t�������ع������ϵͳ���������");
		System.out.println("\t\t1.���˴����");
		System.out.println("\t\t2.���˳齱");
	}
}
