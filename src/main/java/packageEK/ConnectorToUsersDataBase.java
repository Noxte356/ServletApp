package packageEK;

import java.sql.*;

public class ConnectorToUsersDataBase {
    public void connect(String SqlRequest){
        String urlJdbc = "jdbc:postgresql://localhost:5432/usersDataBase";
        String sqlUserName = "postgres";
        String sqlPassword = "";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection = DriverManager.getConnection(urlJdbc,sqlUserName,sqlPassword);
//            System.out.println("Connection accept");
//
            Statement statement = connection.createStatement();
            int a = statement.executeUpdate(SqlRequest);
            ResultSet resultSet;
//            resultSet.next();
//            resultSet.getInt(0);
//            resultSet.getString("user_name");


            if (a>0){
                System.out.println("A new contact has bes inserted.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
