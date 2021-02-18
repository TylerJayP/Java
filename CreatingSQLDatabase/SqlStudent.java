package forClass;

public class SqlStudent {

	public static String createTable() {
		
		return "CREATE TABLE Artists " + "(ArtistNameID int not null primary key " 
				+ "GENERATED ALWAYS AS IDENTITY" 
				+ "(START WITH 200, INCREMENT BY 1),"
				+ "Artist_Name varchar(255)";
		
	}
	
	public static String dropTable() {
		
		return "DROP TABLE Artists";
		
	}
	
	public static String insertData() {
		
		return "INSERT INTO Artists " + "(Artist_Name)"
		+ " VALUES('Led Zepplelin'),('Nirvana'),('Juice Wrld')";
		
	}
	
	public static String allData() {
		
		return "SELECT * FROM Artists";
		
	}
	
}
