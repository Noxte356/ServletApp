package packageEK;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(urlPatterns = {"/user"})

public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        // спросить про датуБейз во всех классах
//        UsersDataBase usersDataBase = new UsersDataBase();
        // создам экстрактор + ридер + райтер
        RequestExtractor extractor = new RequestExtractor();
        BufferedReader reader = req.getReader();
        PrintWriter writer = resp.getWriter();
        // прочитаю тело запроса post
        String postBody = reader.readLine();
        // спаршу тело ответа на поля класса User
        User user = extractor.parsing(postBody);
        UserSaver userSaver = new UserSaver();
        userSaver.save(user);
        // подключу jdbc

//        usersDataBase.add(user);
//        writer.println(usersDataBase.get().toString());
        writer.println("DataBase");
    }
}
