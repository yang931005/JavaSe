package cn.zucc.day04;

public class Penguin extends Pet {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Penguin() {
		super();
	}

	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}
	
	public void print(){
		System.out.println("我的名字叫："+getName()+",我的健康值是"+getHealth()+",我和主人的亲密度"+getLove()+",我的性别是"+getSex());
	}

	public void cure() {
		// TODO Auto-generated method stub
		System.out.println("吃药疗伤");
	}
	public void swimming(){
		System.out.println("主人和企鹅玩游泳游戏，企鹅健康值减少10，与主人亲密度增加5");
	}

}
