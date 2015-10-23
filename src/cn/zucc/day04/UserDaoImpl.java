package cn.zucc.day04;

import java.util.Scanner;


public class UserDaoImpl implements UserDao {


Scanner sc = new Scanner(System.in);

User[] users=new User[99];
@Override
public void addUser(User user) {
	// TODO Auto-generated method stub
	for(int i=0;i<users.length;i++){
		if(users[i]==null){
			users[i]=user;
			break;
		}
	}

}

@Override
public boolean findUser(String uName) {
	// TODO Auto-generated method stub
	for(int i=0;i<users.length;i++){
		
		if(users[i].uName.equals(uName)){
			
			
			
			return true;
		}else{
			return false;
		}
	}
	return false;
}


public void updateUser() {
	// TODO Auto-generated method stub
	
	
	System.out.println("请输入要修改的用户名");
	
	for(int i=0;i<users.length;i++){
			
			String use = sc.next();
			if(users[i].uName.equals(use)){
				System.out.println("请输入要修改的密码");
				String psw = sc.next();
				users[i].psw=psw;
				System.out.println("修改成功");
			}else{
				System.out.println("用户名错误");
			}
	}
}

	

}
