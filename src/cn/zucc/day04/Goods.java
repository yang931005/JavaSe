package cn.zucc.day04;

import java.util.Scanner;

public class Goods {
	Scanner sc = new Scanner(System.in);
	public void show(){
		System.out.println("请输入用户名：");
		
		String name = sc.next();
		System.out.println("请输入密码：");
		String psw = sc.next();
		if(name.equals("TOM")&&psw.equals("123")){
			System.out.println("登录成功！");
			System.out.println("*****欢迎进入商品批发城*****");
			StringBuffer sb = new StringBuffer("\t编号");
			sb.append("\t商品");
			sb.append("\t价格\n");
			sb.append("\t1");
			sb.append("\t电风扇");
			sb.append("\t124.23\n");
			sb.append("\t2");
			sb.append("\t洗衣机");
			sb.append("\t4，500.0\n");
			sb.append("\t3");
			sb.append("\t电视机");
			sb.append("\t8,800.9\n");
			sb.append("\t4");
			sb.append("\t冰箱");
			sb.append("\t5,000.88\n");
			sb.append("\t5");
			sb.append("\t空调机");
			sb.append("\t4,456.0\n");
			sb.append("**********");
			System.out.println(sb);
		}else{System.out.println("用户名密码错误");}
		
		
			
		}
	
		public void change(){
			System.out.println("请输入您批发的商品编号：");
			int num = sc.nextInt();
			System.out.println("请输入批发数量：");
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
			System.out.println("您需要付款："+sb);
			
			
			
	}
}