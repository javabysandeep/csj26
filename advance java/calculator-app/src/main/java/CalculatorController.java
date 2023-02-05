import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculatorController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //read the request form
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
        String operation = request.getParameter("operation");

        //calculate result
        String result = "";

        switch (operation) {
            case "+":
                result = String.valueOf(number1 + number2);
                break;
            case "-":
                result = String.valueOf(number1 - number2);
                break;
            case "*":
                result = String.valueOf(number1 * number2);
                break;
            case "/":
                result = String.valueOf(number1 / number2);
                break;
            case "%":
                result = String.valueOf(number1 % number2);
                break;
            default:
                result = "Invalid operation";
                break;
        }

        // return the result back to the client
        PrintWriter writer = response.getWriter();
        writer.write("Result is " + result);
    }
}
