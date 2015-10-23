package cn.zucc.day06;


public class DVD {
	private String state="1" ;
	private String date="";
	private String name;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DVD(String state, String date, String name) {
		super();
		this.state = state;
		this.date = date;
		this.name = name;
	}
	public DVD() {
		super();
	}

	
	
}
