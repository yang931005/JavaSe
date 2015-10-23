package cn.zucc.day04;

public class UserDaoImpl implements UserDao {

	User user= new User();
	@Override
	public int addUser(User user) {
		
		return 0;
	}
	
	@Override
	public User findUser(String uName) {
		if (uName.equals(user.getuName())) {
			return user;
		}
		return null;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
