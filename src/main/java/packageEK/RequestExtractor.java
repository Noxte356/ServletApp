package packageEK;

public class RequestExtractor {
    public User parsing(String request){
        User user = new User();
        String[] userData = request.split("&");
        user.setId(userData[0]);
        user.setName(userData[1]);
        user.setMail(userData[2]);
        user.setPassword(userData[3]);
        return user;
    }
}
