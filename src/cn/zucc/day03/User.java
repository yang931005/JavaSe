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
		System.out.println("====�û���Ϣ====");
		System.out.println("�û�����"+uName);
		System.out.println("�û����룺"+uPass);
		System.out.println("�Ա�"+sex);
	}
}
