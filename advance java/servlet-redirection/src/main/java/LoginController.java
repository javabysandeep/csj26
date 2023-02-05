import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //read username and password
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //validate the credentials
        if("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)){
            RequestDispatcher success = req.getRequestDispatcher("welcome");
            success.forward(req,resp);
        } else {
            RequestDispatcher failure = req.getRequestDispatcher("index.jsp");
            resp.getWriter().write("<h1 style=\"color: red\">Invalid Credentials</h1>");
            failure.include(req,resp);

        }

    }
}
