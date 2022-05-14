package tach.web.connect;

import java.sql.SQLException;

public class Connection {

  public static Connection getMyConnection() throws SQLException,
          ClassNotFoundException {
    
      return  (Connection) SQLServerConnect.getSQLServerConnection();
  }

  //
  // Test Connection ...
  //
  public static void main(String[] args) throws SQLException,
          ClassNotFoundException {

      System.out.println("Get connection ... ");

      Connection conn = Connection.getMyConnection();

      System.out.println("Get connection " + conn);

      System.out.println("Done!");
  }

}