package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.aBean;

public class SQLcon {

	static Connection conn = null;
	static PreparedStatement stmt = null;
	static ResultSet rs = null;

	public static boolean connectSQL() throws IllegalStateException {

		try {

			// driver setup
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception ex) {
			// handle the error
			System.out.println("Exception Driver: " + ex);
			return false;
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/merc?serverTimezone=UTC",
					DatabaseLogin.getuName(), DatabaseLogin.getuPass());
			return true;

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}

	}

	public static void stateSQL(aBean bean) {

		// test a query
		try {
			// "SELECT * FROM `merchants` WHERE `Merchants_Name` LIKE \"%sys%\""

			String requestQuery = "SELECT * FROM `merchants` WHERE `Merchants_Name` LIKE  ? ";

			stmt = conn.prepareStatement(requestQuery);

			stmt.setString(1, "%" + bean.getmName() + "%");

			rs = stmt.executeQuery();

			// ResultSet return
			while (rs.next()) {

				// print them
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
				// add to result
				bean.getQueryName().add(rs.getString(2));

				bean.getQueryPhone().add(rs.getString(3));

			}
			conn.endRequest();
			conn.close();

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		}

	}

}
