/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
      Connection cn;
    
   public conexion(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://barcia.ctay20i24d23.us-east-1.rds.amazonaws.com:3306/banco_db", "snayder", "snayder1234");
    } catch (Exception e)  {
            System.out.println("Error:"+ e);
    }
  }    
   public Connection getConnection(){
       return cn;
   }
}

