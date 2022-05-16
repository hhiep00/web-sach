/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tach.web.connect;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maiva
 */
public class ConnectDatabase{
    protected Connection conn = null;
    
    public ConnectDatabase()  {
       try {
        String databaseName="WebDocSach";
        String user="sa";
        String password="hunterboy95";
        String port="1433";
        String dbURL = String.format("jdbc:sqlserver://localhost:%s;databaseName=%s;user=%s;password=%s",port,databaseName,user,password);
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         conn = DriverManager.getConnection(dbURL);
        if (conn != null) {
          System.out.println("Connected");
          DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
          System.out.println("Driver name: " + dm.getDriverName());
          System.out.println("Driver version: " + dm.getDriverVersion());
          System.out.println("Product name: " + dm.getDatabaseProductName());
          System.out.println("Product version: " + dm.getDatabaseProductVersion());
        }
        else{
             System.err.println("Cannot connect database, ");
        }
       } catch (Exception ex) {
         System.err.println("Cannot connect database, " + ex);
       }

    }
    public static void main(String[] args) {
        ConnectDatabase s=new ConnectDatabase();
        System.out.println(s.conn);
    }

}
