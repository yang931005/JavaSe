package cn.zucc.day04;

public class Dog extends Pet {
	private String strain="��ʿ��";

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
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽУ�"+getName()+",�ҵĽ���ֵ��"+getHealth()+",�Һ����˵����ܶ�"+getLove()+",�ҵ�Ʒ����"+getStrain());
	}

	public void cure() {
		// TODO Auto-generated method stub
		System.out.println("���룬��ҩ");
	}
	public void catchingFlyDisc(){
		System.out.println("���˺͹�����ӷ�����Ϸ����������ֵ����10�����������ܶ�����5");
	}
	
}
