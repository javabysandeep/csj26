import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getCookies")
public class CookieReader extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Cookie which are set in the browser</h1>");

        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            writer.println(cookie.getName() + "\t" +
                    cookie.getValue() + "\t");
        }

    }
}
