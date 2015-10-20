package cn.zucc.day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] score={10,20,30};
		/*double[] money=new double[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		for(int i =0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"笔购物金额");
			money[i]=sc.nextDouble();
		}
		System.out.println();
		System.out.print("序号");
		System.out.println("\t\t\t金额");
		for (int j = 0; j<5;j++){
		System.out.print(j+1);
		System.out.println("\t\t\t"+money[j]);
		}
		System.out.print("总金额");
		double sum=0 ;
		for (int k=0 ; k<5; k++){
			
			sum=sum+money[k];
		}
		System.out.println("\t\t\t"+sum);
	
		int[] grade=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		for(int i=0;i<5;i++){
			grade[i]=sc.nextInt();
		
			}
			Arrays.sort(grade);
			System.out.print("学员成绩按升序排列：");
			for(int j =0;j<5;j++){
				System.out.print(grade[j]);
		}
		
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[5];
		System.out.println("请输入5位学生的Java考试成绩：");
		for(int i =0;i<5;i++){
			grade[i]=sc.nextInt();
		}
		Arrays.sort(grade);
		System.out.println("考试最高分为"+grade[4]);
		
		int[] grade={99,85,82,63,60};
		Arrays.sort(grade);
		System.out.println("请输入新增成绩：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] grade1=new int[6];
		for(int i =0;i<5;i++){
			grade1[i]=grade[i];
		}
		grade1[5]=num;
		Arrays.sort(grade1);
		for(int j=0;j<6;j++){
			if(grade1[j]==num){
				System.out.println("插入成绩的下标是："+(5-j));
		}
			}
		System.out.println("插入后的成绩信息是：");
		for(int k=grade1.length-1;k>=0;k--){
			System.out.print(grade1[k]+"\t ");
		}	
		
		
		
		
		int[] grade1=new int[6];
		int[] grade={99,85,82,63,60};
		System.out.println("请输入新增成绩：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int index = grade1.length;
		
		for(int i =0;i<5;i++){
			grade1[i]=grade[i];
		}

		for(int j=0;j<grade1.length;j++){
			if(num>grade1[j]){
				index = j;
				break;
			}
		}
	for(int k=grade1.length-1;k>=index;k--){
			grade1[k]=grade1[k-1];
		}
		grade1[index]=num;
		
		
		
		System.out.println("插入成绩的下标是："+index);
		System.out.println("插入后的成绩信息是：");
		for(int h =0;h<grade1.length;h++){
		System.out.print(grade1[h]+"\t");}
		*/
		

	}	

}
