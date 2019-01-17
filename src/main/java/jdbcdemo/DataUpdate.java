package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataUpdate {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data11", "root", "root");
		Statement stmt=con.createStatement();
		String sql="update emp set sal=sal+1000 where sal>=90000";
		int n=stmt.executeUpdate(sql);
		System.out.println(n+ " row(s) modified");
		con.close();
	}

}
