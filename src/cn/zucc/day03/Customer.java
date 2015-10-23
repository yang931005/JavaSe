package cn.zucc.day03;

import java.util.Scanner;

public class Customer {
	Scanner sc=new Scanner(System.in);
	String[] cus = new String[30];
	public void insert(String name){
		
		for(int i=0;i<cus.length;i++){
			
			if(cus[i]==null){
				cus[i]=name;
				break;
			}
				
			
		}
	}
	public void show(){
		
		System.out.println("*****************");
		System.out.println("\t客户姓名列表");
		System.out.println("*****************");
		for(int i =0;i<cus.length;i++)
		{
			if(cus[i]==null){
				break;
			}else{
			System.out.print(cus[i]+"\t");
			}
		}
	}
	
	public boolean search(String names){
	
		for(int i=0;i<cus.length;i++){
			if(cus[i]!=null){
				if(cus[i].equals(names)){
				return true;
				}
			}else{break;}
		}
		return false;
		

	}
}
