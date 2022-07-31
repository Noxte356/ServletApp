package packageEK;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/personalAccount/*"})
public class UserPersonalAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        UrlExtractor urlExtractor = new UrlExtractor();
        int idFromUrl = urlExtractor.parsing(req.getRequestURI());
//        UserRealizationDAO userFinder = new UserRealizationDAO();
        UserDAO userFinder = new UserRealizationDAO();
        User user = userFinder.findById(idFromUrl);
        writer.println(user);







    }
}
