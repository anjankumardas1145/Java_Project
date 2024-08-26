import java.sql.*;
import java.util.Scanner;

public class PreparedBatch {
    // THESE ARE THE ATTRIBUTES OF DATABASE
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "Anjan@123";

    public static void main(String[] args) {
        // LOAD DRIVER
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
                // CONNECTION ESTABLISHED
                Connection connection = DriverManager.getConnection(url, username, password);
                String query = "INSERT INTO Student (name, age, marks)VALUES (?,?,?)";
                PreparedStatement prest = connection.prepareStatement(query);
                Scanner sc = new Scanner(System.in);

            while (true) {
                // CREATE STATEMENT
                System.out.println("Enter your name:");
                String name = sc.nextLine();

                System.out.println("Enter your age:");
                int age = sc.nextInt();
                sc.nextLine(); // consume the leftover newline

                System.out.println("Enter your marks:");
                double marks = sc.nextDouble();
                sc.nextLine(); // consume the leftover newline

                System.out.println("Enter your choice:(Y/N) ");
                String choice = sc.nextLine();
                prest.setString(1,name);
                prest.setInt(2,age);
                prest.setDouble(3,marks);



                prest.addBatch();

                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }
            // Execute the batch
            int[] arr = prest.executeBatch();

            for (int i=0;i< arr.length;i++){
                if(arr[i]==0){
                    System.out.println("Query "+ i +" is not execute successfully");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

