package cn.zucc.day01;

import java.util.Scanner;

public class Fee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--��ӭ�����Ĵ����--");
		System.out.println("�Ĵ�γ̷���");
		System.out.println("�Ĵ�γ̷���");
		System.out.println("1.Java�������ʦ��ѵ��    ��ѧ�ѣ�20RMB��");
		System.out.println("2.Android�ֻ�������ѵ�� ��ѧ�ѣ�30RMB��");
		System.out.println("3.�Ա�����Ӫ����ѵ��          ��ѧ�ѣ�10RMB��");
		System.out.println("4.Ƕ��ʽ����ʦ��ѵ��          ��ѧ�ѣ�30RMB��");
		Scanner sc = new Scanner(System.in);
		System.out.println("������μ�java�������ʦ��ѵ��ѧԱ����");
		int javanum = sc.nextInt();
		System.out.println("������μ�Android�ֻ�������ѵ��ѧԱ����");
		int Anderoidnum = sc.nextInt();
		System.out.println("������μ��Ա�����Ӫ����ѵ��ѧԱ����");
		int taobaonum = sc.nextInt();
		System.out.println("������μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ����");
		int linuxnum = sc.nextInt();
		System.out.println("!!!�����ܵ��ۿ���8���Żݣ�����");
		double money = javanum*20+Anderoidnum*30+taobaonum*10+linuxnum*30;
		System.out.println("������Ǯ֧����ѧ�ѣ�"+money);
		double money2=money*0.8;
		System.out.println("�ۺ���Ӧ��֧����ѧ��:"+money2);
		System.out.println("��֧��:");
		double paymoney = sc.nextDouble();
		System.out.println("ʵ��֧��:"+paymoney);
		double change = paymoney-money2;
		System.out.println("���㣺"+change);
		int integral = (int)(money2/100);
		System.out.println("���û���:"+integral);
		System.out.println("ף��ѧϰ��죡");
		
	}

}
