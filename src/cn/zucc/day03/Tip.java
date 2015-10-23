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
		System.out.println("帖子类的无参构造方法");
		System.out.println("====帖子信息====");
		System.out.println("帖子标题："+title);
		System.out.println("帖子内容："+content);
		System.out.println("发表时间："+publishTime);
	
	}
	
	
	
	
	
}
