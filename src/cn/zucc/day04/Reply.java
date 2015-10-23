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
		System.out.println("回复信息");
		System.out.println("主题标题："+gettitle());
		System.out.println("主题内容："+getcontent());
		System.out.println("发表时间"+getpublishTime());
	}
}
