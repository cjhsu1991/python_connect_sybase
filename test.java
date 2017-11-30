package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {

	public static void main(String[] args) {

	Connection connection = null;

	try {
	// Register JDBC Driver
	Class.forName("com.sybase.jdbc3.jdbc.SybDriver");
	connection = DriverManager.getConnection("jdbc:sybase:Tds:IP名稱:PORT埠/資料庫名稱","帳號", "密碼");

	if (null != connection) {
		System.out.println("Sucessfully "
				+ "connected to Sybase database!!!");
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM TEMPREP_MA124");
		while(rs.next()) {
			System.out.println("CLOTH_NO:"+rs.getString("CLOTH_NO"));
		}
		
	} else {
		System.out.println("Connection "
				+ "to Sybase database failed!!!");
	}

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}

}
