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
			System.out.println("请输入宠物名字");
			String name = sc.next();
			System.out.println("请输入宠物种类");
			String stain = sc.next();
			map.put(name, stain);
			System.out.println("是否继续输入（y/n）");
			flag = sc.next();
		}while(flag.equals("y"));
		
		System.out.println("请输入需要查找的宠物名字");
		String name  = sc.next();
		if(map.get(name)!=null){
		System.out.println("名字为"+name+"的宠物品种是："+map.get(name));
		}else{System.out.println("没有该宠物");
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
		Animal cat = new Cat("小猫",4);
		Animal duck = new Duck("唐老鸭",2);
		Animal dAnimal = new Delphin("海豚");
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
		
		System.out.println("动物名字\t\t腿数\t\t动物叫");
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
