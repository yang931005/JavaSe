package cn.zucc.day03;

public class Tip {
	private String title;
	private String content;
	private String publishTime;
	private int uid;
	
	
	public void settitle(String title){
		this.title=title;
	}
	
	public String gettitle(){
		return title;
	}
	public void setcontent(String content){
		this.content = content;
	}
	public String getcontent(){
		return content;
	}
	public void setpublishTime(String publishTime){
		this.publishTime=publishTime;
	}
	public String getpublishTime(){
		return publishTime;
	}

	public void getinfo(){
		System.out.println("��������޲ι��췽��");
		System.out.println("====������Ϣ====");
		System.out.println("���ӱ��⣺"+title);
		System.out.println("�������ݣ�"+content);
		System.out.println("����ʱ�䣺"+publishTime);
	
	}
	
	
	
	
	
}
