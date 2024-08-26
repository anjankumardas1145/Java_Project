import java.sql.*;
import java.util.Scanner;

public class Batch {
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

        try (
                // CONNECTION ESTABLISHED
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                Scanner sc = new Scanner(System.in)
        ) {
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

                // Correct SQL INSERT query
                String query = String.format("INSERT INTO STUDENT (name, age, marks) VALUES ('%s', %d, %f)", name, age, marks);

                statement.addBatch(query);

                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }
            // Execute the batch
            int[] arr = statement.executeBatch();
            System.out.println("Batch executed. Number of rows affected: " + arr.length);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
