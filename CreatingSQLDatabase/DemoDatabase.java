package forClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoDatabase {

	public static final String databaseURL = "jdbc:derby:FirstDatabase;create=true";
	
	
	public static void main(String[] args) {
		
		try (Connection connection = DriverManager.getConnection(databaseURL);
					Statement statement = connection.createStatement()) {
			
			
				//This is for Student Database
				 //statement.execute(SqlStudent.createTable());
				 statement.execute(SqlStudent.insertData());
				 //statement.execute(SqlStudent.deleteData());
			     //statement.execute(SqlStudent.dropTable());
									 
							 
				ResultSet resultSet = statement.executeQuery(SqlStudent.allData());	 
				printStudentData(resultSet);
				
			
				
			    //This is for College Database
				//statement.execute(SqlCollege.createTable());
				//statement.execute(SqlCollege.insertData());
			     //statement.execute(SqlCollege.dropTable());
				
				
				ResultSet resultSetCollege = statement.executeQuery(SqlCollege.allData());
				printCollegeData(resultSetCollege);
				 
	
			   //This is for Student College Database
				//statement.execute(SqlStudentCollege.createTable());
				//statement.execute(SqlStudentCollege.insertData());
				//statement.execute(SqlStudentCollege.dropTable());
				 
				
				ResultSet resultSetStudentCollege = statement.executeQuery(SqlStudentCollege.allData());
				printStudentCollegeData(resultSetStudentCollege);
				ResultSet resultSetStudentCollegeInfo = statement.executeQuery(SqlStudentCollege.studentCollegeInfo());
		        printStudentCollegeDataInfo(resultSetStudentCollegeInfo);
		        
					
			}catch (Exception e) {
				
				e.printStackTrace();
				
			}
		

	}


	private static void printStudentCollegeDataInfo(ResultSet resultSetStudentCollegeInfo) throws SQLException {
		
		System.out.println("FirstName      LastName     College\n------------------------------------");
		
		while(resultSetStudentCollegeInfo.next()) {
			 
			String firstName = resultSetStudentCollegeInfo.getString("FirstName");
			String lastName = resultSetStudentCollegeInfo.getString("LastName");
			String collegeName = resultSetStudentCollegeInfo.getString("College");
			 
			System.out.printf("%s              %s        %s\n", firstName, lastName, collegeName);
			 
		 }
		
		System.out.println();
		
	}


	private static void printStudentCollegeData(ResultSet resultSetStudentCollege) throws SQLException {
		
		System.out.println("ID      StudentID     CollegeID\n--------------------------------");
		
		while(resultSetStudentCollege.next()) {
			 
			 int iD = resultSetStudentCollege.getInt("ID");
			 int studentID = resultSetStudentCollege.getInt("StudentID");
			 int collegeID = resultSetStudentCollege.getInt("CollegeID");
			 
			 System.out.printf("%d        %d             %d\n", iD, studentID, collegeID);
			 
		 }
		
		System.out.println();
		
	}


	private static void printCollegeData(ResultSet resultSetCollege) throws SQLException {
		
		System.out.println("ID       Name      City\n------------------------");
		
		while(resultSetCollege.next()) {
			 
			 int id = resultSetCollege.getInt("Id");
			 String name = resultSetCollege.getString("Name");
			 String city = resultSetCollege.getString("City");
			 
			 System.out.printf("%d\t %s\t   %s\n", id, name, city);
			 
		 }
		
		System.out.println();
		
	}


	private static void printStudentData(ResultSet resultSet) throws SQLException {
		
		System.out.println("ID    FirstName    LastName    Major    GradYear\n-------------------------------------------------");//	
		
		while (resultSet.next()) {
			 
			int id = resultSet.getInt("Id");
			String firstNamee = resultSet.getString("FirstName");
			String lastNamee = resultSet.getString("LastName");
			String major = resultSet.getString("Major");
			int gradYear = resultSet.getInt("GradYear");
			
			System.out.printf("%d\t%s\t     %s\t%s\t  %d\n", id, firstNamee, lastNamee, major, gradYear);
			 
		 }
		
		System.out.println();
		
	}

}