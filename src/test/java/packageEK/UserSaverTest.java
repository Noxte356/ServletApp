package packageEK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserSaverTest {
    UserSaver userSaver = new UserSaver();
    @Test
    void save(){
        User user = new User();
        userSaver.save(user);

    }
}