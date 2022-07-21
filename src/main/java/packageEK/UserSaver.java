package packageEK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserSaver {
//    private User user;

    public UserSaver() {
    }

    public void save(User client) {
        User user = client;
        String urlJdbc = "jdbc:postgresql://localhost:5432/usersDataBase";
        String sqlUserName = "postgres";
        String sqlPassword = "";
        String line = "VALUES (%s,'%s','%s','%s')";
        String sql = String.format(line,user.getName(),user.getMail(),user.getPassword());
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(urlJdbc,sqlUserName,sqlPassword);
            System.out.println("Connection accept");
            String insert = "INSERT INTO public.users (user_id, user_name, user_mail, user_password)" + sql;
//                    "VALUES " + "(" + user.getId() + "," + "'" + user.getName() + "'" + "," +
//                    "'" + user.getMail() + "'" + "'" + user.getPassword() + "'" + ")";
//                    "VALUES (1214,'homka','homa@mail.com','password')";
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
