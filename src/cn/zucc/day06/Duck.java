package cn.zucc.day06;

public class Duck extends Animal implements Terrestrial {
		

	
	public int getLegNum() {
		return 2;
		// TODO Auto-generated method stub
		
	}
	
	public Duck(String name){
		super ();
		this.name = name;
	}
		








	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("¸Â");
	}

}
