package cn.zucc.day08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class JdbcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("无法找到驱动类");
			e.printStackTrace();
		}
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			System.out.println("连接成功");
			
			Statement stmt = null;
			stmt = con.createStatement();
		//	String sql = "insert into students(Sname,Sgrade,Semail)value('s',2,'23@qq.com')";
		//	stmt.execute(sql);
		//	System.out.println("添加成功");
			
			String sql = "select * from students";
			Set<Students> set = new HashSet<Students>();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				Students st =new Students();
				st.setSname(rs.getString("Sname"));
				st.setScode(rs.getInt("Scode"));
				st.setSaddress(rs.getString("Saddress"));
				st.setSgrade(rs.getInt("Sgrade"));
				st.setSemail(rs.getString("Semail"));
				set.add(st);
			}
			for(Students st :set){
				System.out.println(st);
			}
			
		}catch(SQLException e){
			System.out.println("连接失败");
			e.printStackTrace();
		}
		
		
	}

}
