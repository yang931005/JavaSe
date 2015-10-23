package cn.zucc.day03;

import java.util.Arrays;
import java.util.Scanner;

public class Stu {
	Scanner sc = new Scanner(System.in);
	String[] student=new String[5];

	public boolean searchName(int start,int end,String name){
		boolean find = false;
		for(int i =start-1;i<end;i++){
			if(student[i].equals(name)){
	
				find = true;
				break;
			}
		}
		return find;
		
	}
	public void insert(){
		Scanner sc=new Scanner(System.in);
	
		
		
		for(int j=0;j<5;j++){
			System.out.println("请输入学生姓名：");
			student[j]=sc.next();
		}
		
	}
		public void show(){
			System.out.println("本班学生列表：");
			Arrays.sort(student);
			for(int i=0;i<=4;i++){
				System.out.print(student[i]+"\t");
			}
		}
	
	

}
