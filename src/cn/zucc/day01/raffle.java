package cn.zucc.day01;

import java.util.Scanner;

public class raffle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ѧ�Ÿ�λ������֮�͵���20�ı�������ѧ��");
		System.out.println("������ѧԱ����λѧ��:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a=number%10;
		int b=number%100/10;
		int c=number%1000/100;
		int d=number/1000;
		int e=a+b+c+d;
		System.out.println("���ѧ�Ÿ�λ������֮����:"+e);
		boolean x = e==20;
		System.out.println("��������ѧ��:"+x);
	}

}
