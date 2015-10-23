package cn.zucc.day04;



public interface UserDao {
	public User findUser(String uName);
	public int addUser(User user);
	public int updateUser(User user);
	
}
