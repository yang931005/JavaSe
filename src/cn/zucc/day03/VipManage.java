package cn.zucc.day03;

public class VipManage {
	Vip vips[] =new Vip[30];
	
	public void addVip(Vip vip){
		for(int i=0;i<vips.length;i++){
			if(vips[i]==null){
				vips[i]=vip;
				break;
			}
		}
	}
	public void show(){
		System.out.println("±àºÅ\t»ý·Ö");
		for(int i =0;i<vips.length;i++){
			Vip vip = vips[i];
			if(vip ==null){
				break;
			}
			System.out.println(vip.num+"\t"+vip.score);
		}
	}
}
