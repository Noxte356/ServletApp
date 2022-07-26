package packageEK;

public class UserRequestExtractor {
    public User parsing(String request){
        User user = new User();
//        user_id=211414&user_nickName=test&user_mail=test%40mail.ru&user_password=agog
        String[] userData = request.split("=");
        String[] id = userData[1].split("&");
        user.setId(id[0]);
        String[] name = userData[2].split("&");
        user.setName(name[0]);
        String[] mail = userData[3].split("&");
        user.setMail(mail[0]);
        String[] password = userData[4].split("&");
        user.setPassword(password[0]);
        return user;
    }
}
