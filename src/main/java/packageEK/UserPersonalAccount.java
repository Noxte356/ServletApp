package packageEK;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/PersonalAccount/"})
public class UserPersonalAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        UrlExtractor urlExtractor = new UrlExtractor();
        String idFromUrl = urlExtractor.parsing(req.getRequestURI());
        UsersDataBase usersDataBase = new UsersDataBase();
        usersDataBase.findUser();




    }
}
