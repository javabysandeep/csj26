import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(false);
        PrintWriter printWriter = resp.getWriter();
        String username = (String) httpSession.getAttribute("username");
        String password = (String) httpSession.getAttribute("password");

        if ("abc".equalsIgnoreCase(username) && "abc".equalsIgnoreCase(password)) {
            printWriter.println("<h1>Welcome " + username + "</h1>");
        } else {
            httpSession.invalidate();
            printWriter.println("<h1> Invalid credentials</h1>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req, resp);
        }
        printWriter.println(" <form action=\"logout\" method=\"post\">" +
                " Logout : <input type=\"submit\" value=\"Logout\"> " +
                "</form>  ");

    }
}
