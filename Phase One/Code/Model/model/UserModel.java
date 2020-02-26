package model;
/*
 * To do:
 * 1) Connect to database
 * 		-Have a method to store a new username and password
 * 		-Have a method to modify an existing username and password
 * 		-Have a method to retrieve username and password
 */

public class UserModel { 
	
    private String username; 
    private String password; 
    
    //Constructor
    public UserModel(String username,String password) {
    	this.username = username;
    	this.password = password;
    }
    
    //Returns the username
    public String getUsername()  { 
        return username; 
    } 
     
    //Sets a new username
    public void setUsername(String username)  { 
        this.username = username; 
    } 
     
    //Returns the password
    public String getPassword()  { 
        return password; 
    } 
     
    //Sets a new password
    public void setPassword(String password)  { 
        this.password = password; 
    } 
} 

