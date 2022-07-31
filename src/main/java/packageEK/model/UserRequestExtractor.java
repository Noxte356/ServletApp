package packageEK.model;

import packageEK.model.User;

public class UserRequestExtractor {
    public User parsing(String request){
        User user = new User();
//        user_id=211414&user_nickName=test&user_mail=test%40mail.ru&user_password=agog
        String[] userData = request.split("=");
        String[] idParse = userData[1].split("&");
        int id = Integer.parseInt(idParse[0]);
        user.setId(id);
        String[] name = userData[2].split("&");
        user.setName(name[0]);
        String[] mail = userData[3].split("&");
        user.setMail(mail[0]);
        String[] password = userData[4].split("&");
        user.setPassword(password[0]);
        return user;
    }
}
