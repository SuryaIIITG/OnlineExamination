/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    
    public static Connection DatabaseConnect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_DB","root","root");
            
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Connection Failure ");
            return null;
        }
        
    }
    
    
}
