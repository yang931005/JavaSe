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
		System.out.println("��ӭ�����������");
		System.out.println("������Ҫ������������֣�");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println("��ѡ��Ҫ�����ĳ������ͣ���1.����2.��죩");
		switch(sc.nextInt()){
		case 1:
			System.out.println("�����빷����Ʒ�֣�");
			dog.setStrain(sc.next());
			dog.setName(name);
			dog.print();
			break;
		case 2:
			System.out.println("��ѡ�������Ա�");
			penguin.setName(name);
			penguin.setSex(sc.next());
			penguin.print();
			break;
		default :
			System.out.println("ѡ�����");
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
		System.out.println("����������");
		StringBuffer sb = new StringBuffer(sc.next());
		if(sb.length()>=6){
			System.out.println("ע��ɹ�");
		}else{
			System.out.println("���벻��С��6λ");
		}
		
		Scanner sc = new Scanner (System.in);
		System.out.println("�������û�����");
		String name = sc.next();
		System.out.println("���������룺");
		String pwd =sc.next();
		if(name.equalsIgnoreCase("Tom")&&pwd.equalsIgnoreCase("1234567")){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ�ܣ�");
		}
		
		
		Register rg = new Register();
		rg.verify();
		
		String st = "helloworld.java";
		String search = ".java";
		System.out.println(st.lastIndexOf(search)==st.length()-search.length());
		
		String st = "39434@qq.com";
		System.out.println(st.lastIndexOf("@")>-1&&st.lastIndexOf("@")<st.lastIndexOf("."));
		
		
		
		String st = "��ͤ��,�ŵ���,����";
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
		
		
		StringBuffer sb = new StringBuffer("�ഺ�޻�");
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
			System.out.println("û�ҵ�");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
