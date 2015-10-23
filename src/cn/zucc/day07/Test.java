package cn.zucc.day07;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Age ag = new Age();
		try {
			ag.setAge(111);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		ClassNum cn = new ClassNum();
		System.out.println("请输入数字（1-3）");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try {
			cn.show(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("欢迎下次来玩");
		}
		
		
		
		
		
	}

}
