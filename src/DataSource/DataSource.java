/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource;

import java.sql.*;
//import javax.sql;

/**
 *
 * @author khale
 */
public class DataSource {
    
    private static DataSource data;
    private Connection  con;
    String username = "root";
    String password = "";
    String url = "jdbc:mysql://127.0.0.1:3306/artideco";
    
    private DataSource()
    {
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connexion");
        }
        catch(SQLException ex){
            
            System.out.println(ex);
            
        }
    }
    
    public Connection getConnection()
    {
        return con;
    }
    
    public static DataSource getInstance()
    {
        if(data == null)
        {
            data= new DataSource();
        }
        
        return data;
    }
    
}
