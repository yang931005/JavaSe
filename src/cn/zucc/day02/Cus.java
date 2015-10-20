package cn.zucc.day02;

public class Cus {
	String name;
	int age;
	public void ticket(){
		if(age>18){
		System.out.println(name+"的年龄为："+age+"，门票的价格为：20");
		}else{System.out.println(name+"的年龄为："+age+"，门票的价格为：10");}
	}
}
