package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;

public class Connect  {
   private static final String url="jdbc:mysql://localhost:3306/bankSystem";
 private static final  String username="root";
    private static final String password="Anjan@123";
    //public PreparedStatement statement;
Statement ss;
    public Connect(){
        try{
          Connection connection=DriverManager.getConnection(url,username,password);
            ss=connection.createStatement();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

    }
}
