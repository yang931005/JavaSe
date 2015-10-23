package cn.zucc.day04;

public class Dog extends Pet {
	private String strain="哈士奇";

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	

	public Dog() {
		super();
	}

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
		
	}

	public void print(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫："+getName()+",我的健康值是"+getHealth()+",我和主人的亲密度"+getLove()+",我的品种是"+getStrain());
	}

	public void cure() {
		// TODO Auto-generated method stub
		System.out.println("打针，吃药");
	}
	public void catchingFlyDisc(){
		System.out.println("主人和狗狗玩接飞盘游戏，狗狗健康值减少10，与主人亲密度增加5");
	}
	
}
