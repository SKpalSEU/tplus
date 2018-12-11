/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author subrato
 */
public class Sir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       
         Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/subrato","root","");
         Statement s= c.createStatement();
         String queary = ("insert into friend values(1,'kkp')");
         //s.executeUpdate(queary);
         ResultSet r= s.executeQuery("select * from friend");
         while(r.next())
             System.out.println(r.getString("name")+" " +r.getInt("id"));
         
    }
    
}
