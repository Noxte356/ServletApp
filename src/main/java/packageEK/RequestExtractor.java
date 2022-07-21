package packageEK;

public class RequestExtractor {
    public User parsing(String request){
        User user = new User();
        String[] userData = request.split("=");
        String[] id = userData[0].split("&");
        user.setId(id[0]);
        String[] name = userData[1].split("&");
        user.setName(name[0]);
        String[] mail = userData[2].split("&");
        user.setMail(mail[0]);
        String[] password = userData[3].split("&");
        user.setPassword(password[0]);
        return user;
    }
}
