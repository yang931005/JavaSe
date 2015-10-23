package cn.zucc.day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Penguin pg1 = new Penguin("二货","公");
		Penguin pg2 = new Penguin("傻叉","母");
		
		List pgs = new ArrayList();
		pgs.add(pg1);
		pgs.add(pg2);
		for (int i = 0; i <pgs.size();i++){
			System.out.println(pgs.get(i));
		}
		System.out.println(pgs.size());
		pgs.remove(pg1);
		for (int i = 0; i <pgs.size();i++){
			System.out.println(pgs.get(i));
		}
		if(pgs.contains(pg2)){
			System.out.println("包含");
		}else{
			System.out.println("不包含");
		}
		
		
		
		LinkedList<Penguin> list = new LinkedList<Penguin>();
		Scanner sc = new Scanner(System.in);
		String flag;
		do{
		Penguin pg = new Penguin();
		System.out.println("请输入企鹅的名字");
		pg.setName(sc.next());
		System.out.println("请输入企鹅的性别");
		pg.setsex(sc.next());
		System.out.println("是否继续输入（y/n）");
		list.add(pg);
		flag = sc.next();
		}while("y".equals(flag));
		
		System.out.println("请输入第一只企鹅的名字");
		Penguin pg1 = new Penguin();
		pg1.setName(sc.next());
		System.out.println("请输入第一只企鹅的性别");
		pg1.setsex(sc.next());
		list.addFirst(pg1);
		
		System.out.println("请输入最后一只企鹅的名字");
		Penguin pg2 = new Penguin();
		pg2.setName(sc.next());
		System.out.println("请输入最后一只企鹅的性别");
		pg2.setsex(sc.next());
		list.addLast(pg2);
		
		
		
		System.out.println(list.getFirst());
		list.removeLast();
		for (int i = 0; i <list.size();i++){
			System.out.println(list.get(i));
		}
		list.removeLast();
		for(Penguin pg :list){
			System.out.println(pg);
		}
		*/
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(4);
		set.add(3);
		for(int i:set ){
			System.out.println(i);
		}
		
	}

}
