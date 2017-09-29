package com.kaitzen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBClient {
	private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private Connection dbConnection;
    
    public  Person insert (String name) throws SQLException{
    	Person person = null;
    	init();
    	PreparedStatement insertPS = dbConnection.prepareStatement(
    			"INSERT INTO PERSON (Name) value(?)");
    	insertPS.setString(1, name);
    	insertPS.executeUpdate();
    	ResultSet rs = insertPS.getGeneratedKeys();
    	if (rs.first()){
    		int personaId = rs.getInt(1);
    		PreparedStatement selectPS = dbConnection.prepareStatement("select = from PERSON where id = ?");
    		selectPS.setInt(1, personaId);
    		ResultSet selectRS = selectPS.executeQuery();
        	if (selectRS.first()){
        		person = new Person (selectRS.getInt("id"), selectRS.getString("name"));
        	}
    		selectRS.close();
    		selectPS.close();
    	}
    	rs.close();
    	insertPS.close();
    	return person;
    }
    
    public void init(){
    	if (dbConnection != null){
    		connect ();
    	}
    }
    
    private void connect (){
    		try {
				Class.forName(DB_DRIVER);
				dbConnection = DriverManager.getConnection(DB_CONNECTION);
				generateDB();
			} catch (ClassNotFoundException e) {
				System.out.println("ERROR: No existe el driver");
			} catch (SQLException e) {
				System.out.println("ERROR: No se pudo conectar a la base de datos");				e.printStackTrace();
			}
    }
    
    private void generateDB (){
    	try {
			dbConnection.setAutoCommit(true);
			PreparedStatement createPS = dbConnection.prepareStatement(
	    			"CREATE TABLE PERSON ( id int primary key AUTOINCREMENT, name varchar (255))");
			createPS.executeUpdate();
	   		createPS.close();
		} catch (SQLException e) {
			System.out.println("ERROR: Bo se pudo crear la base de datos");
		}    	
    }

}
