package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataEntry {

	public static void main(String[] args) {


		try {
			//step-1 (driver-loading)
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			//step-2 (connection-establishment)
			String url="jdbc:mysql://localhost:3306/data11";
			String uid="root";
			String pwd="root";
			Connection con=DriverManager.getConnection(url, uid, pwd);
			System.out.println("Connected Successfully");
			//step-3 (dispatch sql-statement to DB)
			String sql="insert into emp values(114,'ddd',85000)";
			Statement stmt=con.createStatement();
			int n=stmt.executeUpdate(sql);
			System.out.println(n+ " row created ");
			//step-4 (close the connection)
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
