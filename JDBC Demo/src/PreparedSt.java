
import java .sql.*;
public class PreparedSt {
    //THESE ARE THE ATTRIBUTES OF DATABASE
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="Anjan@123";

    public static void main(String[] args) {
        //LOAD DRIVER
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        try{
//            //for INSERT DATA
//            Connection connection=DriverManager.getConnection(url,username,password);
//            String query="INSERT INTO STUDENT(name,age,marks) VALUES(?,?,?)";
//            PreparedStatement presta=connection.prepareStatement(query);
//            presta.setString(1,"Anjan");
//            presta.setInt(2,22);
//            presta.setDouble(3,50);
//            int roweffected=presta.executeUpdate();
//            if(roweffected>0){
//                System.out.println("Data inserted successfully");
//            }else{
//                System.out.println("Data not inserted successfully");
//            }
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//
//        }


        //Retiving DaTa fOrM the existing table
//                                                    try{
//                                                        Connection connect=DriverManager.getConnection(url,username,password);
//                                                        String query="SELECT marks,name FROM student WHERE id=?";
//                                                        PreparedStatement presta= connect.prepareStatement(query);
//                                                        presta.setInt(1,4);
//                                                        // HERE ResultSet interface is need
//
//                                                        ResultSet resultset=presta.executeQuery();
//                                                        while(resultset.next()){
//                                                            double mark=resultset.getDouble("marks");
//                                                            String name=resultset.getString("name");
//                                                            System.out.println("mark :" +mark+  " name : "+name);
//                                                        }
//
//                                                    }catch(SQLException e){
//                                                        System.out.println(e.getMessage());
//                                                    }


        //UPDATE DATA
//        try{
//
//           Connection connection=DriverManager.getConnection(url,username,password);
//           String query="UPDATE STUDENT set marks=? WHERE id=?";
//
//
//            PreparedStatement presta=connection.prepareStatement(query);
//           presta.setDouble(1,95.98);
//           presta.setInt(2,3);
//
//           int roweffected=presta.executeUpdate();
//          if(roweffected>0){
//              System.out.println("Data updated successfully");
//            }else{
//                System.out.println("Data not update successfully");
//            }
//       }catch(SQLException e){
//           System.out.println(e.getMessage());
//
//        }
//DELETE QUERY
        try{

            Connection connection=DriverManager.getConnection(url,username,password);
            String query="DELETE FROM STUDENT WHERE id=? ";


            PreparedStatement presta=connection.prepareStatement(query);
            presta.setInt(1,4);

            int roweffected=presta.executeUpdate();
            if(roweffected>0){
                System.out.println("Data deleted successfully");
            }else{
                System.out.println("Data not deleted successfully");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());

        }


    }
}