package cn.zucc.day04;

public abstract class Pet {
	private String name;
	private int health=100;
	private int love=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	public Pet() {
		super();
	}
	public abstract void print();
	public abstract void cure();
	
}	
