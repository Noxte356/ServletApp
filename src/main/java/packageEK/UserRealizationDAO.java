package packageEK;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRealizationDAO implements UserDAO{
    @Override
    public User save(User user) {
        String string = "INSERT INTO public.users (user_id, user_name, user_mail, user_password)" +
                "VALUES (" + user.getId() + ",'%s','%s','%s')";
        String sqlInsert = String.format(string,user.getName(),user.getMail(),user.getPassword());
//        ConnectorToUsersDataBase connector = new ConnectorToUsersDataBase();
//        connector.connect(sqlInsert);
        ConnectorToDB connectorToDB = new ConnectorToDB();
        try {
            Statement statement = connectorToDB.getConnection().createStatement();
            int a = statement.executeUpdate(sqlInsert);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public User findById(int id) {
        User user = new User();
        String select = "SELECT * FROM public.users WHERE user_id = " + id;
        ConnectorToDB connectorToDB = new ConnectorToDB();
        try {
            Statement statement = connectorToDB.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()){
                user.setId(resultSet.getInt("user_id"));
                user.setName(resultSet.getString("user_name"));
                user.setMail(resultSet.getString("user_mail"));
                user.setPassword(resultSet.getString("user_password"));
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
