package packageEK.model;

import packageEK.model.User;

public interface UserDAO {
    User save(User user);
    User findById(int id);

}
