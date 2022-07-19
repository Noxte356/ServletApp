package packageEK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserSaver {
    public void save(User user) {
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
            System.out.println("Connection accept");
            String insert = "INSERT INTO public.users (user_id, user_name, user_mail, user_password)" +
                    "VALUES (12114,homyak,homa@mail.com,password)";
            Statement statement = connection.createStatement();
            int a = statement.executeUpdate(insert);
            if (a>0){
                System.out.println("A new contact has bes inserted.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
