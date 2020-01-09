
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class connectDS  {

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 			
		connectDS();	
			
		
	}
	

	private static void connectDS() {
		
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
			"databaseName=one;integratedSecurity=true;";

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
      	try {
      		// Establish the connection.
      		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          		con = DriverManager.getConnection(connectionUrl);
          
          		// Create and execute an SQL statement that returns some data.
          		String SQL = "SELECT * FROM employee1";
          		stmt = con.createStatement();
          		rs = stmt.executeQuery(SQL);
          		
          
          		// Iterate through the data in the result set and display it.
          		while (rs.next()) {
          			System.out.println(rs.getString(1)); 
          			
          		}
          		Statement statement = con.createStatement();

          	// insert the data
          	statement.executeUpdate("INSERT INTO employee1 " + "VALUES (10012)");
          		
      	}
      
		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}


	
// signup_page

	public void passData(String sUNAME1, String sUUSERNAME1, String sUPHONE1, String sUMAIL1, String sGPASS1,String sUCONPASS1) {
		System.out.println("in db connect page");
		System.out.println(sUNAME1);
		System.out.println(sUUSERNAME1);
		System.out.println(sUPHONE1);
		System.out.println(sUMAIL1);
		System.out.println(sGPASS1);
		System.out.println(sUCONPASS1);
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
					"databaseName=one;integratedSecurity=true;";

      		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          		con = DriverManager.getConnection(connectionUrl);
          		//stmt.executeUpdate("INSERT INTO SIGN_UP " + "VALUES (sUNAME1,sUUSERNAME1,sUPHONE1,sUMAIL1,sGPASS1,sUCONPASS1)");
          		
          		String query = "INSERT INTO SIGN_UP(SUNAME1,SUUSERNAME1,SUPHONE1,SUMAIL1,SGPASS1,SUCONPASS1) values (?,?,?,?,?,?)";
          		PreparedStatement pst = con.prepareStatement(query);
          		pst.setString(1,sUNAME1);
          		pst.setString(2,sUUSERNAME1);
          		pst.setString(3,sUPHONE1);
          		pst.setString(4,sUMAIL1);
          		pst.setString(5,sGPASS1);
          		pst.setString(6,sUCONPASS1);
          		pst.executeUpdate();
          		
          		
      	}catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
		
		
	}


	public void loginpage(String username, String pass) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
      		// Establish the connection.
			String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
					"databaseName=one;integratedSecurity=true;";

      		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          		con = DriverManager.getConnection(connectionUrl);
          
          		// Create and execute an SQL statement that returns some data.
          		String SQL = "SELECT * FROM SIGN_UP";
          		stmt = con.createStatement();
          		rs = stmt.executeQuery(SQL);
          		int flag = 0;
          		while (rs.next()){
          			//System.out.println(rs.getString(1)); 
          			if(rs.getString(1).equals(username)) {
          				flag = 1;
          				if(rs.getString(5).equals(pass)) {
          					JOptionPane.showMessageDialog(null,"LOGIN SUCCESS");
          					firstPage firstPageOb = new firstPage();
          					firstPageOb.main();
          				}else 
          					
          				JOptionPane.showMessageDialog(null, "AUTENTICATION FAILED");
          			}
          		}
          		
          		if (flag==0)
          			JOptionPane.showMessageDialog(null, "AUTENTICATION FAILED");
          		Statement statement = con.createStatement();

          	// insert the data
          	//statement.executeUpdate("INSERT INTO SIGN_UP " + "VALUES (10012)");
          		
      	}
      
		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}


	public void passDatafeed(String feedback) {
				// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
					"databaseName=one;integratedSecurity=true;";

      		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          		con = DriverManager.getConnection(connectionUrl);
          		//stmt.executeUpdate("INSERT INTO SIGN_UP " + "VALUES (sUNAME1,sUUSERNAME1,sUPHONE1,sUMAIL1,sGPASS1,sUCONPASS1)");
          		
          		String query1 = "INSERT INTO FEEDBACK(feedback) values (?)";
          		PreparedStatement pst1 = con.prepareStatement(query1);
          		pst1.setString(1,feedback);
          		
          		pst1.executeUpdate();
          		
          		
      	}catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
		
		System.out.println(feedback);
		
		
	}


	public void FB(String feedback) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
					"databaseName=one;integratedSecurity=true;";

      		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          		con = DriverManager.getConnection(connectionUrl);
          		String query1 = "INSERT INTO feedback(fb) values (?)";
          		PreparedStatement pst1 = con.prepareStatement(query1);
          		pst1.setString(1,feedback);
          		
          		pst1.executeUpdate();
          		
          		
      	}catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}

}
