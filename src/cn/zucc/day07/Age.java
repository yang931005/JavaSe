package cn.zucc.day07;

public class Age {
	public void setAge(int age) throws Exception{
		if(age>=1&&age<=100){
			System.out.println("����Ϊ"+age);
		}else{
			throw new Exception("���������1-100֮��");
		}
	}
}
