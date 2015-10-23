package cn.zucc.day03;

public class User {
	private char sex;
	private String uName;
	private String uPass;
	
	public void setsex(char sex){
		this.sex=sex;
	}
	public char getuid(){
		return sex;
	}
	public void setuName(String uName){
		this.uName=uName;
	}
	public String getuName(){
		return uName;
	}
	public void setuPass(String uPass){
		this.uPass=uPass;
	}
	public String getuPass(){
		return uName;
	}
	
	public void getUserinfo(){
		System.out.println("====用户信息====");
		System.out.println("用户名："+uName);
		System.out.println("用户密码："+uPass);
		System.out.println("性别："+sex);
	}
}
