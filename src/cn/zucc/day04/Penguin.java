package cn.zucc.day04;

public class Penguin extends Pet {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Penguin() {
		super();
	}

	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}
	
	public void print(){
		System.out.println("�ҵ����ֽУ�"+getName()+",�ҵĽ���ֵ��"+getHealth()+",�Һ����˵����ܶ�"+getLove()+",�ҵ��Ա���"+getSex());
	}

	public void cure() {
		// TODO Auto-generated method stub
		System.out.println("��ҩ����");
	}
	public void swimming(){
		System.out.println("���˺��������Ӿ��Ϸ����콡��ֵ����10�����������ܶ�����5");
	}

}
