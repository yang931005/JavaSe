package cn.zucc.day03;

public class Print {
	public void a(int num,String test){
		for (int i = 0; i<num;i++){
			for(int j=0; j<=i;j++){
				System.out.print(test);
			}
			System.out.println();
		}
	}
}
