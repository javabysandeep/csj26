import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie")
public class CookieWriter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("Cookie set at client side");

        Cookie name = new Cookie("name","abc");
        Cookie email = new Cookie("email","abc@gmail.com");
        Cookie location = new Cookie("location","Pune");

        resp.addCookie(name);
        resp.addCookie(email);
        resp.addCookie(location);
    }
}
