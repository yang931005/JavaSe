package cn.zucc.day04;

import cn.zucc.day03.Tip;

public class Reply extends Tip {
	int replyid;
	int topicid;
	public int getReplyid() {
		return replyid;
	}
	public void setReplyid(int replyid) {
		this.replyid = replyid;
	}
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public void getinfo(){
		System.out.println("�ظ���Ϣ");
		System.out.println("������⣺"+gettitle());
		System.out.println("�������ݣ�"+getcontent());
		System.out.println("����ʱ��"+getpublishTime());
	}
}
