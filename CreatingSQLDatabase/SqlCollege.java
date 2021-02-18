package forClass;

public class SqlCollege {

	public static String createTable() {
		
		return "CREATE TABLE College " + "(ID int not null primary key " 
				+ "GENERATED ALWAYS AS IDENTITY" 
				+ "(START WITH 123, INCREMENT BY 1),"
				+ "Name varchar(255), City varchar(255))";
		
	}
	
	public static String dropTable() {
		
		return "DROP TABLE College";
		
	}
	
	public static String insertData() {
		
		//SLCC = 123, UofU = 124, UVU = 125, UCI = 126, MIT = 128
		
		return "INSERT INTO College " + "(Name, City)"
		+ " VALUES('SLCC', 'SLC'), ('UofU', 'SLC'), ('UVU', 'Provo'), ('UCI', 'Irvine'), ('MIT', 'Cam')";
		
	}
	
	public static String allData() {
		
		return "SELECT * FROM College";
		
	}
}
