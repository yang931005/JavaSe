package cn.zucc.day02;

import java.util.Scanner;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ѽ�");
		int money = sc.nextInt();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������1ƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml����1ƿ");
		System.out.println("3����100Ԫ����10Ԫ����5�������");
		System.out.println("4����200Ԫ����10Ԫ����1���ղ������˹�");
		System.out.println("5����200Ԫ����20Ԫ����ŷ����ˬ��ˮ1ƿ");
		System.out.println("0��������");
		
		System.out.println("��ѡ��");
		int num = sc.nextInt();
	    if(money>=200){
	    	switch(num){
	    	case 1:
	    		System.out.println("���������ܽ�"+(money+2));
	    		System.out.println("�ɹ����������¿�������1ƿ");break;
	    	case 2:
	    		System.out.println("���������ܽ�"+(money+3));
	    		System.out.println("�ɹ�������500ml����1ƿ");break;
	    	case 3:
	    		System.out.println("���������ܽ�"+(money+10));
	    		System.out.println("�ɹ�������5�������");break;
	    	case 4:
	    		System.out.println("���������ܽ�"+(money+10));
	    		System.out.println("�ɹ�������1���ղ������˹�");break;
	    	case 5:
	    		System.out.println("���������ܽ�"+(money+20));
	    		System.out.println("�ɹ�������ŷ����ˬ��ˮ1ƿ");break;
	    	case 0:
	    		System.out.println("���������ܽ�"+money);
	    		System.out.println("�ɹ���������");break;
	    	default:
	    		System.out.println("��������");
	    	}
	    	
		}else if(money>=100){
			switch(num){
			case 1:
	    		System.out.println("���������ܽ�"+(money+2));
	    		System.out.println("�ɹ����������¿�������1ƿ");break;
	    	case 2:
	    		System.out.println("���������ܽ�"+(money+3));
	    		System.out.println("�ɹ�������500ml����1ƿ");break;
	    	case 3:
	    		System.out.println("���������ܽ�"+(money+10));
	    		System.out.println("�ɹ�������5�������");break;
	    	default:
	    		System.out.println("���������ܽ�"+money);
	    		System.out.println("����������������ѵĶ�Ȳ���");break;
			}
			
		}else if(money>=50){
			switch(num){
			case 1:
				System.out.println("���������ܽ�"+(money+2));
	    		System.out.println("�ɹ����������¿�������1ƿ");break;
	    	default:
	    		System.out.println("���������ܽ�"+money);
	    		System.out.println("����������������ѵĶ�Ȳ���");break;
			}
		}else{
			System.out.println("���������ܽ�"+money);
			System.out.println("�������ѵĶ�Ȳ����޷��μӻ");
		}
		
		
	}

}
