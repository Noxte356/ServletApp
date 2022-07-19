package packageEK;

import java.util.ArrayList;
import java.util.List;

public class UsersDataBase {
    private List<User> usersList = new ArrayList<>();

    public UsersDataBase() {

    }
    public void add(User user){
        usersList.add(user);
    }
    public User get(){
        return usersList.get(0);
    }
}
