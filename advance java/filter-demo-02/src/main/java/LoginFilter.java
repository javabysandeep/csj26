import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/servlet1"})
public class LoginFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if("abc".equalsIgnoreCase(username)&& "abc".equalsIgnoreCase(password)){
            chain.doFilter(request,response);
        }
        else{
            response.getWriter().write("<h1 style=color:red> Invalid creds</h1>");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.include(request,response);
        }

    }
}
