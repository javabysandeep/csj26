import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/hello")
public class HelloController implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init method");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method");

        PrintWriter writer = servletResponse.getWriter();
        writer.write("Current date "+ LocalDateTime.now());
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy method");
    }
}
