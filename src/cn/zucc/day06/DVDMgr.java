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
	
		DVD dvd1 = new DVD("0","2010-7-1","�������");
	
		DVD dvd2 = new DVD("1","","�������");
		
		DVD dvd3 = new DVD("1","","��������");
		list.add(dvd1);
		list.add(dvd2);
		list.add(dvd3);
	}
	
	public void DvdMain() throws ParseException{
		System.out.println("1.����DVD");
		System.out.println("2.�鿴DVD");
		System.out.println("3.ɾ��DVD");
		System.out.println("4.���DVD");
		System.out.println("5.�黹DVD");
		System.out.println("6.�˳�");
		System.out.println("��ѡ��");
		
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
			System.out.println("ллʹ�ã�");break;
		default : 
			System.out.println("��������");break;
		}
	}
	
	public void AddDvd() throws ParseException{
		System.out.println("������DVD��");
		DVD e = new DVD();
		e.setName(sc.next());
		list.add(e);
		System.out.println("����0����");
		if(sc.nextInt()==0){
			DvdMain();
		}
		
	}
	public void CheckDvd() throws ParseException{
		System.out.println("���\t״̬\t\t����\t�������");
		for(int i =0;i<list.size();i++){
			System.out.print(i+1+"\t");
			System.out.print(list.get(i).getState()+"\t\t");
			System.out.print(list.get(i).getName()+"\t");
			System.out.println(list.get(i).getDate());
			
		}System.out.println("����0����");
		if(sc.nextInt()==0){
			DvdMain();
		}
		
	}
	public void DeleteDvd() throws ParseException{
		System.out.println("��������Ҫɾ����DVD����");
		String name = sc.next();
		for(int i = 0;i<list.size();i++){
			if(name.equals(list.get(i).getName())&&(list.get(i).getState().equals("1"))){
				list.remove(i);
				System.out.println("ɾ���ɹ�");
				System.out.println("��0����");
				if(sc.nextInt()==0){
					DvdMain();
				}
			}
		}System.out.println("δ�ҵ� ��0����");
		if(sc.nextInt()==0){
			DvdMain();
		}
	}
	public void BorrowDvd() throws ParseException{
		System.out.println("��������Ҫ�����");
		String name = sc.next();
		for(int i=0;i<list.size();i++){
			if(name.equals(list.get(i).getName())&&list.get(i).getState().equals("1")){
				list.get(i).setState("0");
				System.out.println("�������������");
				String date = sc.next();
				list.get(i).setDate(date);
				System.out.println("����ɹ�");
				System.out.println("��0����");
				if(sc.nextInt()==0){
					DvdMain();
				}
			}else if(name.equals(list.get(i).getName())&&list.get(i).getState().equals("0")){
				System.out.println("��Ҫ������Ѿ�������");
			}
		}System.out.println("δ�ҵ� ��0����");
		if(sc.nextInt()==0){
			DvdMain();
		}
	}
	public void ReturnDvd() throws ParseException{
		System.out.println("��������Ҫ������");
		String name = sc.next();
		
		for(int i=0;i<list.size();i++){
			if(name.equals(list.get(i).getName())&&list.get(i).getState().equals("0")){
					System.out.println("������黹����");
					String date = sc.next();
					
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");	
					java.util.Date date1=sdf.parse(date);  
					java.util.Date date2=sdf.parse(list.get(i).getDate()); 
					System.out.println("��Ҫ��"+((date1.getTime()-date2.getTime())/(24*3600*1000))+"Ǯ");
					
					
					list.get(i).setState("1");
					System.out.println("�黹�ɹ�");
					list.get(i).setDate("");
				
					System.out.println("��0����");
					if(sc.nextInt()==0){
						DvdMain();
					}
			}
		}System.out.println("δ�ҵ� ��0����");
		if(sc.nextInt()==0){
			DvdMain();
		}
	}
	
	
}
