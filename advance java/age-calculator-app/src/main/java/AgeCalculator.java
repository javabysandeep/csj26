import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet("/age")
public class AgeCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //read the request details
        LocalDate dateOfBirth = LocalDate.parse(req.getParameter("dob"));
        LocalDate today = LocalDate.now();
        int year = today.getYear() - dateOfBirth.getYear();
        int months = today.getMonthValue()- dateOfBirth.getMonthValue();
        int days = today.getDayOfMonth() - dateOfBirth.getDayOfMonth();

        //write the response back to the client
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Your age in years : " + year + "</h1>");
        writer.write("<h1>Your age months : " + months + "</h1>");
        writer.write("<h1>Your age days : " + days + "</h1>");

    }
}
