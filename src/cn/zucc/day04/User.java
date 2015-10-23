package cn.zucc.day04;

public class User {
	int gender;
	
	private String uName = "tom";
	
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}
	
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [gender=" + gender + ", uName=" + uName + "]";
	}
	
}
