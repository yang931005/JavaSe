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
		System.out.println("������Ϣ");
		System.out.println("������⣺"+getTitle());
		System.out.println("�������ݣ�"+getContent());
		System.out.println("����ʱ��"+getPublishTime());
	}
	public Topic() {
		super();
	}
	
	public Topic(String title, String content, String publishTime, int uid) {
		super(title, content, publishTime, uid);
		System.out.println("��������вι��췽��");
	}
	
	
	
	
	
}
