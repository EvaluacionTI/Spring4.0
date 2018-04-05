package etg.bbva.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CV0101v01ConexionJDBCPostgres {
	static String jdbcUrl = "jdbc:postgresql://localhost:5432/aemsadesarrollo";
    static String username = "postgres";
    static String password = "aemsa152027";

    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    
	public static void main(String[] args) throws ClassNotFoundException {
	    try {
	      // Step 1 - Load driver
	      Class.forName("org.postgresql.Driver"); // Class.forName() is not needed since JDBC 4.0

	      // Step 2 - Open connection
	      conn = DriverManager.getConnection(jdbcUrl, username, password);

	      // Step 3 - Execute statement
	      stmt = conn.createStatement();
	      rs = stmt.executeQuery("SELECT version()");

	      // Step 4 - Get result
	      if (rs.next()) {
	        System.out.println(rs.getString(1));
	      }

	    } catch (SQLException e) {
	      e.printStackTrace();
	    } finally {
	      try {

	        // Step 5 Close connection
	        if (stmt != null) {
	          stmt.close();
	        }
	        if (rs != null) {
	          rs.close();
	        }
	        if (conn != null) {
	          conn.close();
	        }
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    }

	}

}
