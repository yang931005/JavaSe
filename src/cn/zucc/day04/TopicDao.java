package cn.zucc.day04;

public interface TopicDao {
	public Topic findTopic(int topicid);
	public int addTopic(Topic topic);
	public int deleteTopic(int topicid);
	public int updateTopic(Topic topic);
}
