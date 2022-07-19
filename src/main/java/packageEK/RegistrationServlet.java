package packageEK;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

@WebServlet(urlPatterns = {"/registrationForm"})
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String filePath =  RegistrationServlet.class.getClassLoader().getResource("RegistrationForm.html").getPath();
        FileReader fileReader = new FileReader();
//        Path path = Paths.get("RegistrationForm.html");
//        String absolutePath = path.toAbsolutePath().toString();
        String file = fileReader.read(filePath);
        PrintWriter writer = resp.getWriter();
        writer.println(file);
    }
}
