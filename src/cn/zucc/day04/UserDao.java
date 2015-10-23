package cn.zucc.day04;



public interface UserDao {
	public boolean findUser(String uName);
	public void addUser(User user);
	public void updateUser();

	
}
