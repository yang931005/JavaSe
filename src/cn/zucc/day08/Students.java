package cn.zucc.day08;

public class Students {
	String Sname;
	int Scode;
	String Saddress;
	int Sgrade;
	String Semail;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getScode() {
		return Scode;
	}
	public void setScode(int scode) {
		Scode = scode;
	}
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	public int getSgrade() {
		return Sgrade;
	}
	public void setSgrade(int sgrade) {
		Sgrade = sgrade;
	}
	public String getSemail() {
		return Semail;
	}
	public void setSemail(String semail) {
		Semail = semail;
	}
	@Override
	public String toString() {
		return "Students [Saddress=" + Saddress + ", Scode=" + Scode
				+ ", Semail=" + Semail + ", Sgrade=" + Sgrade + ", Sname="
				+ Sname + "]";
	}
	
}
