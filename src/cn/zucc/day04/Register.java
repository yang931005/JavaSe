package cn.zucc.day04;

import java.util.Scanner;

public class Register {
	public void verify(){
		System.out.println("�������û�����");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("���������룺");
		String psw = sc.next();
		if(name.length()>2&&psw.length()>=6){
			System.out.println("ע��ɹ���");
		}else{
			System.out.println("ע��ʧ�ܣ�");
		}
	}
}
