package cn.zucc.day06;

public class Cat extends Animal implements Terrestrial{
	
	public void show() {
		System.out.println("ίχ");
	}
	public Cat(String name){
		super();
		this.name = name;
	}
	@Override
	public int getLegNum() {
		// TODO Auto-generated method stub
		return 4;
	}


}
