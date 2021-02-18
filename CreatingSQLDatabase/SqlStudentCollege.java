package forClass;



public class SqlStudentCollege {

	
public static String createTable() {
		
		return "CREATE TABLE StudentCollege " + "(ID int not null primary key " 
				+ "GENERATED ALWAYS AS IDENTITY" 
				+ "(START WITH 4321, INCREMENT BY 1),"
				+ "StudentID int, CollegeID int)";
		
	}
	
	public static String dropTable() {
		
		return "DROP TABLE StudentCollege";
		
	}
	
	public static String insertData() {
			
		return "INSERT INTO StudentCollege " + "(StudentID, CollegeID)"
		+ " VALUES(21, 123), (22, 124), (23, 125), (24, 126), (25, 127), (26, 128), (21, 124),(21, 125), (27, 123), (28, 123)";
		
	}
	
	public static String allData() {
		
		return "SELECT * FROM StudentCollege";
		
	}
	
	public static String studentCollegeInfo() {
		
		return "SELECT s.FirstName, s.LastName, c.Name as College "
				+ "FROM Student s "
				+ "INNER JOIN StudentCollege sc ON s.ID = sc.StudentID "
				+ "INNER JOIN College c ON sc.CollegeID = c.ID ";
        }
		

}