package packageEK;

public class UnitTestUserSaver {
    public static void main(String[] args) {
        UserSaver userSaver = new UserSaver();
        User user = new User();
        userSaver.save(user);
    }
}
