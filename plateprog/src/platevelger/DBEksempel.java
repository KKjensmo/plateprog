package platevelger;

import java.sql.*;

public class DBEksempel {
	static Connection conn;
	
	
	public static void main(String[] args) {
		try {
			derp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void derp() throws Exception {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
		} catch (Exception e) {
			System.exit(0);
		}
		String command = "jdbc:derby:Database";
		//følgende legges til om databasen må opprettes. Må den bare en gang.
		//command += ";create=true";
		try {
			conn = DriverManager.getConnection(command);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DEERRPPP");
		}
		
		PreparedStatement ps;
		
//		try {
//			ps = conn.prepareStatement("CREATE TABLE Test (" +
//					"Ting SMALLINT)");
//			ps.execute();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ps = conn.prepareStatement("INSERT INTO Test VALUES (?)");
		ps.setInt(1, 3);
		ps.execute();
		
		ResultSet rs;
		ps = conn.prepareStatement("SELECT * FROM Test");
		ps.execute();
		
		rs = ps.getResultSet();
		//int tall = 0;
		/*while (rs.next()) {
			tall = rs.getInt("forfatter");
			rs.getString("navn)");
		}*/
		System.out.println(rs);
	}
}
