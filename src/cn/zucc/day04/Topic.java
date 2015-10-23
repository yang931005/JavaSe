package cn.zucc.day04;

public  class Topic extends Tip {
	int topicid;
	int boardid;
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public int getBoardid() {
		return boardid;
	}
	public void setBoardid(int boardid) {
		this.boardid = boardid;
	}
	
	public void getinfo(){
		System.out.println("主题信息");
		System.out.println("主题标题："+getTitle());
		System.out.println("主题内容："+getContent());
		System.out.println("发表时间"+getPublishTime());
	}
	public Topic() {
		super();
	}
	
	public Topic(String title, String content, String publishTime, int uid) {
		super(title, content, publishTime, uid);
		System.out.println("主题类的有参构造方法");
	}
	
	
	
	
	
}
