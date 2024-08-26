import java .sql.*;
public class Main {
    //THESE ARE THE ATTRIBUTES OF DATABASE
   private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="Anjan@123";

    public static void main(String[] args) {
        //LOAD DRIVER
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        try{
            //CONNECTION ESTABLISHED
            Connection connection=DriverManager.getConnection(url,username,password);
            //CREATE STATEMENT
            Statement statement=connection.createStatement();//to execute a sql statement we need Statement Interface
            String query="select * from student";
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                int age=resultSet.getInt("age");
                double marks=resultSet.getDouble("marks");
                System.out.println("ID : " + id + ", Name: "+name+", Age: "+age +" marks: "+marks);
//                System.out.println("Name :"+name);
//                System.out.println("Age "+ age);
//                System.out.println("Marks: "+marks);
            }
        }catch(SQLException e){
           System.out.println(e.getMessage());

        }
    }
}