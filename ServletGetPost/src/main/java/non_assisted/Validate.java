package non_assisted;

import java.io.PrintWriter;
import java.sql.*;

public class Validate {
    public static boolean checkUser(String email,String pass) 
    { 
    	boolean st =true;
    	 
        if (email=="abc@gmail.com")
        {
        	if(pass=="123")
        	{
        		return true;
        	}
        	
        }
        else {
        return st; }
		return st;
    }   
}