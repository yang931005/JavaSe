package cn.zucc.day04;

public abstract class Tip   {
	String title;
	String content;
	String publishTime;
	int uid;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Tip() {
		super();
	}

	public Tip(String title, String content, String publishTime, int uid) {
		super();
		this.title = title;
		this.content = content;
		this.publishTime = publishTime;
		this.uid = uid;
	}

	public void getinfo(){
		System.out.println("Ìû×ÓÐÅÏ¢");
		System.out.println(title);
		System.out.println(content);
		System.out.println(publishTime);
	}
}
