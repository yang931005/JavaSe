package cn.zucc.day06;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*	Map map = new HashMap();
		Scanner sc = new Scanner(System.in);
		
		
		String flag;
		do{
			System.out.println("�������������");
			String name = sc.next();
			System.out.println("�������������");
			String stain = sc.next();
			map.put(name, stain);
			System.out.println("�Ƿ�������루y/n��");
			flag = sc.next();
		}while(flag.equals("y"));
		
		System.out.println("��������Ҫ���ҵĳ�������");
		String name  = sc.next();
		if(map.get(name)!=null){
		System.out.println("����Ϊ"+name+"�ĳ���Ʒ���ǣ�"+map.get(name));
		}else{System.out.println("û�иó���");
	}
	
		
		Map <String,String> map = new HashMap<String,String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {  
			  
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
		  
		}  
		
		List<Animal> animals = new ArrayList<Animal>();
		Animal cat = new Cat("Сè",4);
		Animal duck = new Duck("����Ѽ",2);
		Animal dAnimal = new Delphin("����");
		animals.add(cat);
		animals.add(duck);
		animals.add(dAnimal);
		System.out.println("d");
		for (Animal animal : animals) {
			System.out.print(animal.getName()+"\t\t");
			animal.show();
			System.out.println("\t\t"+animal.getLegNum()+"\t\t");
		}
		
		List<Animal> animals = new ArrayList<Animal>();
		Animal cat = new Cat("xx");
		Animal duck = new Duck("ss");
		Animal del = new Delphin("dd");
		animals.add(cat);
		animals.add(duck);
		animals.add(del);
		
		System.out.println("��������\t\t����\t\t�����");
		for(Animal animal:animals){
			System.out.print(animal);
			
			if(animal instanceof Cat){
				System.out.print("\t\t"+((Cat)animal).getLegNum()+"\t\t");
			}
			else if(animal instanceof Duck){
				System.out.print("\t\t"+((Duck)animal).getLegNum()+"\t\t");
			}else{
				System.out.print("\t\t"+"0"+"\t\t");
			}
			animal.show();
		}
		*/
		DVDMgr dmg = new DVDMgr();
		dmg.initial();
		dmg.DvdMain();
	}
}
