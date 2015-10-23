package cn.zucc.day04;

import java.util.Scanner;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Dog dog = new Dog("1",2,3,"4");
		System.out.println(dog.getHealth());
		
		dog.setName("2");
		dog.show();
	
		String name;

		Dog dog = new Dog();
		Penguin penguin = new Penguin();
		System.out.println("欢迎您来到宠物店");
		System.out.println("请输入要领养宠物的名字：");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("请选择要领养的宠物类型：（1.狗狗2.企鹅）");
		switch(sc.nextInt()){
		case 1:
			System.out.println("请输入狗狗的品种：");
			dog.setStrain(sc.next());
			dog.setName(name);
			dog.print();
			break;
		case 2:
			System.out.println("请选择企鹅的性别");
			penguin.setName(name);
			penguin.setSex(sc.next());
			penguin.print();
			break;
		default :
			System.out.println("选择错误！");
		}
	
		
		UsbImplement us = new UsbImplement();
		us.service();
		us.print();
		
		
		Scanner sc = new Scanner(System.in);
		Master m = new Master();
		Pet pet = new Dog();
		m.cure(pet);
		
		Master m = new Master();
		Pet pet = new Penguin();
		m.play(pet);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入密码");
		StringBuffer sb = new StringBuffer(sc.next());
		if(sb.length()>=6){
			System.out.println("注册成功");
		}else{
			System.out.println("密码不能小于6位");
		}
		
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入用户名：");
		String name = sc.next();
		System.out.println("请输入密码：");
		String pwd =sc.next();
		if(name.equalsIgnoreCase("Tom")&&pwd.equalsIgnoreCase("1234567")){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败！");
		}
		
		
		Register rg = new Register();
		rg.verify();
		
		String st = "helloworld.java";
		String search = ".java";
		System.out.println(st.lastIndexOf(search)==st.length()-search.length());
		
		String st = "39434@qq.com";
		System.out.println(st.lastIndexOf("@")>-1&&st.lastIndexOf("@")<st.lastIndexOf("."));
		
		
		
		String st = "长亭外,古道边,芳草";
		String[] st1=st.split(",");
		for(int i =0;i<st1.length;i++){
		System.out.println(st1[i]);
		}
		
		
		
		String st = "sdfsasdeasd";
		int num=0;
		for(int i = 0;i<st.length();i++){
			if(st.charAt(i)=='s'){
				num++;
			}
		}
		System.out.println(num);
		
		
		StringBuffer sb = new StringBuffer("青春无悔");
		StringBuffer sb1 = sb.append("2");
		System.out.println(sb1);
		
		
		StringBuffer sb = new StringBuffer("1234567801");
		for(int i=sb.length()-3;i>0;i=i-3){
			sb.insert(i, ",");
			
		}
		System.out.println(sb);
		
		Goods good = new Goods();
		good.show();
		good.change();
		
		
		Post po = new Theme();
		po.show();
		
		
		
		Topic tp = new Topic();
		tp.setTitle("a");
		tp.setContent("2");
		tp.setPublishTime("2013-2-4");
		tp.getinfo();
		
		Reply rp = new Reply();
		rp.settitle("b");
		rp.setcontent("3");
		rp.setpublishTime("2023-3-4");
		rp.getinfo();
		
		Topic tp1 = new Topic("22","22","22",22);
		tp1.getinfo();
		*/
		
		UserDao userDao = new UserDaoImpl();
		User user = new User();
		String name= "tom";
		if (userDao.findUser(name)!=null) {
			System.out.println(userDao.findUser(name));
		}else {
			System.out.println("没找到");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
