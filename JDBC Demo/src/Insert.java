import java.sql.DriverManager;
import java .sql.*;
public class Insert {


        private static final String url="jdbc:mysql://localhost:3306/mydb";
        private static final String username="root";
        private static final String password="Anjan@123";

    public static void main(String[] args) {
        //Load Driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        //create connection
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            Statement statement=connect.createStatement();
            String query=String.format("INSERT INTO STUDENT(name,age,marks) VALUES('%s',%o,%f)","Ankita",21,99.99);
            int affectedrow=statement.executeUpdate(query);
            if (affectedrow>0){
                System.out.println("Data updated successfully");
            }else{
                System.out.println("Not updated successfully");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
