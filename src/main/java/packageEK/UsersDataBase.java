package packageEK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersDataBase {
    public boolean findUser(String id){
        ConnectorToUsersDataBase connectorToUsersDataBase = new ConnectorToUsersDataBase();
        String find = "SELECT user_id, user_name, user_mail, user_password" +
                "FROM public.users" + "WHERE user_id = " + id + ";";
        connectorToUsersDataBase.connect(find);

    }
}
