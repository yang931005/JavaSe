package cn.zucc.day06;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DVDMgr {
	
	Scanner sc = new Scanner(System.in);
	List<DVD> list = new ArrayList<DVD>();
	public void initial() {
	
		DVD dvd1 = new DVD("0","2010-7-1","罗马假日");
	
		DVD dvd2 = new DVD("1","","风声鹤唳");
		
		DVD dvd3 = new DVD("1","","浪漫满屋");
		list.add(dvd1);
		list.add(dvd2);
		list.add(dvd3);
	}
	
	public void DvdMain() throws ParseException{
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("6.退出");
		System.out.println("请选择：");
		
		switch(sc.nextInt()){
		case 1: 
			AddDvd();break;
		case 2: 
			CheckDvd();break;
		case 3: 
			DeleteDvd();break;
		case 4: 
			BorrowDvd();break;
		case 5:
			ReturnDvd();break;
		case 6:
			System.out.println("谢谢使用！");break;
		default : 
			System.out.println("输入有误");break;
		}
	}
	
	public void AddDvd() throws ParseException{
		System.out.println("请输入DVD名");
		DVD e = new DVD();
		e.setName(sc.next());
		list.add(e);
		System.out.println("输入0返回");
		if(sc.nextInt()==0){
			DvdMain();
		}
		
	}
	public void CheckDvd() throws ParseException{
		System.out.println("序号\t状态\t\t名称\t借出日期");
		for(int i =0;i<list.size();i++){
			System.out.print(i+1+"\t");
			System.out.print(list.get(i).getState()+"\t\t");
			System.out.print(list.get(i).getName()+"\t");
			System.out.println(list.get(i).getDate());
			
		}System.out.println("输入0返回");
		if(sc.nextInt()==0){
			DvdMain();
		}
		
	}
	public void DeleteDvd() throws ParseException{
		System.out.println("请输入需要删除的DVD名字");
		String name = sc.next();
		for(int i = 0;i<list.size();i++){
			if(name.equals(list.get(i).getName())&&(list.get(i).getState().equals("1"))){
				list.remove(i);
				System.out.println("删除成功");
				System.out.println("按0返回");
				if(sc.nextInt()==0){
					DvdMain();
				}
			}
		}System.out.println("未找到 按0返回");
		if(sc.nextInt()==0){
			DvdMain();
		}
	}
	public void BorrowDvd() throws ParseException{
		System.out.println("请输入你要借的书");
		String name = sc.next();
		for(int i=0;i<list.size();i++){
			if(name.equals(list.get(i).getName())&&list.get(i).getState().equals("1")){
				list.get(i).setState("0");
				System.out.println("请输入借书日期");
				String date = sc.next();
				list.get(i).setDate(date);
				System.out.println("借书成功");
				System.out.println("按0返回");
				if(sc.nextInt()==0){
					DvdMain();
				}
			}else if(name.equals(list.get(i).getName())&&list.get(i).getState().equals("0")){
				System.out.println("你要借的书已经被借走");
			}
		}System.out.println("未找到 按0返回");
		if(sc.nextInt()==0){
			DvdMain();
		}
	}
	public void ReturnDvd() throws ParseException{
		System.out.println("请输入你要还的书");
		String name = sc.next();
		
		for(int i=0;i<list.size();i++){
			if(name.equals(list.get(i).getName())&&list.get(i).getState().equals("0")){
					System.out.println("请输入归还日期");
					String date = sc.next();
					
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");	
					java.util.Date date1=sdf.parse(date);  
					java.util.Date date2=sdf.parse(list.get(i).getDate()); 
					System.out.println("需要付"+((date1.getTime()-date2.getTime())/(24*3600*1000))+"钱");
					
					
					list.get(i).setState("1");
					System.out.println("归还成功");
					list.get(i).setDate("");
				
					System.out.println("按0返回");
					if(sc.nextInt()==0){
						DvdMain();
					}
			}
		}System.out.println("未找到 按0返回");
		if(sc.nextInt()==0){
			DvdMain();
		}
	}
	
	
}
