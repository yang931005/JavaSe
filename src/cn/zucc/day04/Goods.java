package cn.zucc.day04;

import java.util.Scanner;

public class Goods {
	Scanner sc = new Scanner(System.in);
	public void show(){
		System.out.println("�������û�����");
		
		String name = sc.next();
		System.out.println("���������룺");
		String psw = sc.next();
		if(name.equals("TOM")&&psw.equals("123")){
			System.out.println("��¼�ɹ���");
			System.out.println("*****��ӭ������Ʒ������*****");
			StringBuffer sb = new StringBuffer("\t���");
			sb.append("\t��Ʒ");
			sb.append("\t�۸�\n");
			sb.append("\t1");
			sb.append("\t�����");
			sb.append("\t124.23\n");
			sb.append("\t2");
			sb.append("\tϴ�»�");
			sb.append("\t4��500.0\n");
			sb.append("\t3");
			sb.append("\t���ӻ�");
			sb.append("\t8,800.9\n");
			sb.append("\t4");
			sb.append("\t����");
			sb.append("\t5,000.88\n");
			sb.append("\t5");
			sb.append("\t�յ���");
			sb.append("\t4,456.0\n");
			sb.append("**********");
			System.out.println(sb);
		}else{System.out.println("�û����������");}
		
		
			
		}
	
		public void change(){
			System.out.println("����������������Ʒ��ţ�");
			int num = sc.nextInt();
			System.out.println("����������������");
			double nums = sc.nextInt();
			double money =0;
			switch(num){
			case 1: money = nums*124.23;break;
			case 2: money = nums*4500.00;break;
			case 3: money = nums*8800.90;break;
			case 4: money = nums*5000.88;break;
			case 5: money = nums*4456.00;break;
			}
			String money1 = String.valueOf(money);
			StringBuffer sb = new StringBuffer(money1);
			for(int i=sb.length()-5;i>0;i=i-3){
				sb.insert(i, ",");
			}
			System.out.println("����Ҫ���"+sb);
			
			
			
	}
}