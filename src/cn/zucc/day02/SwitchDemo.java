package cn.zucc.day02;

import java.util.Scanner;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		int money = sc.nextInt();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
		System.out.println("2：满100元，加3元换购500ml可乐1瓶");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满200元，加10元换购1个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元换购欧莱雅爽肤水1瓶");
		System.out.println("0：不换购");
		
		System.out.println("请选择：");
		int num = sc.nextInt();
	    if(money>=200){
	    	switch(num){
	    	case 1:
	    		System.out.println("本次消费总金额："+(money+2));
	    		System.out.println("成功换购：百事可乐饮料1瓶");break;
	    	case 2:
	    		System.out.println("本次消费总金额："+(money+3));
	    		System.out.println("成功换购：500ml可乐1瓶");break;
	    	case 3:
	    		System.out.println("本次消费总金额："+(money+10));
	    		System.out.println("成功换购：5公斤面粉");break;
	    	case 4:
	    		System.out.println("本次消费总金额："+(money+10));
	    		System.out.println("成功换购：1个苏泊尔炒菜锅");break;
	    	case 5:
	    		System.out.println("本次消费总金额："+(money+20));
	    		System.out.println("成功换购：欧莱雅爽肤水1瓶");break;
	    	case 0:
	    		System.out.println("本次消费总金额："+money);
	    		System.out.println("成功换购：无");break;
	    	default:
	    		System.out.println("输入有误");
	    	}
	    	
		}else if(money>=100){
			switch(num){
			case 1:
	    		System.out.println("本次消费总金额："+(money+2));
	    		System.out.println("成功换购：百事可乐饮料1瓶");break;
	    	case 2:
	    		System.out.println("本次消费总金额："+(money+3));
	    		System.out.println("成功换购：500ml可乐1瓶");break;
	    	case 3:
	    		System.out.println("本次消费总金额："+(money+10));
	    		System.out.println("成功换购：5公斤面粉");break;
	    	default:
	    		System.out.println("本次消费总金额："+money);
	    		System.out.println("输入有误或您所消费的额度不够");break;
			}
			
		}else if(money>=50){
			switch(num){
			case 1:
				System.out.println("本次消费总金额："+(money+2));
	    		System.out.println("成功换购：百事可乐饮料1瓶");break;
	    	default:
	    		System.out.println("本次消费总金额："+money);
	    		System.out.println("输入有误或您所消费的额度不够");break;
			}
		}else{
			System.out.println("本次消费总金额："+money);
			System.out.println("您所消费的额度不够无法参加活动");
		}
		
		
	}

}
