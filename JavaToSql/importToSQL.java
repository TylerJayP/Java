import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Tyler
 * Inserting and also deleting data from localhost database in MySQL
 *
 */
	public class importToSQL {

		public static void main(String[] args) throws SQLException {
			 
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "C83j8op0ty7!";
			 
		Connection myConn = null;
		Statement myStmt = null;
			 
		try {
			        	
	        /**
	         * Establishing a connection to the database
	         * 
	         */
	        myConn = DriverManager.getConnection(url, user, password);
			 
			/**
			 * Creating a statement
			 * 
			 */
			myStmt = myConn.createStatement();
			 
			/**
			 * Any String in here that you write is executing a query script. As you can see
			 * in the "insertSQL" String, it is using normal script writing that you would
			 * see inside of MySQL! Same thing for deleteSQL. Same code.
			 * 
			 */
//			String insertSQL = "insert into employees " + " (last_name, first_name, email)"
//		                    + " values ('Tippetts', 'Benson', 'beedo5@gmail.com')";
			
			String deleteSQL = "delete from employees where last_name = 'De La Cruz'";
			 
//			myStmt.executeUpdate(insertSQL);
			myStmt.executeUpdate(deleteSQL);
			 
			System.out.println("Insert complete.");
			            
			} catch (Exception exc) {
				
	            exc.printStackTrace();
			            
			    } finally {
			        	
	                if (myStmt != null) {
			            	
			        myStmt.close();
			                
	                }
			 
	                    if (myConn != null) {
			            	
			            myConn.close();
			                
	                   }
			            
	             }
			        
		    }
		
	}

