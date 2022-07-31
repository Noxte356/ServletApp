package packageEK;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/user"})

public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        // спросить про датуБейз во всех классах
//        UsersDataBase usersDataBase = new UsersDataBase();
        // создам экстрактор + ридер + райтер
        UserRequestExtractor extractor = new UserRequestExtractor();
        BufferedReader reader = req.getReader();
        PrintWriter writer = resp.getWriter();
        // прочитаю тело запроса post
        String postBody = reader.readLine();
        // спаршу тело ответа на поля класса User
        User user = extractor.parsing(postBody);
        UserDAO userDAO  = new UserRealizationDAO();
        userDAO.save(user);
        String location = "/ServletAppi/personalAccount/" + user.getId();
        resp.sendRedirect(location);


    }
}
