import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",urlPatterns = {"/servlet1"})
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init method");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter doFilter method");
        chain.doFilter(request,response);
    }

    public void destroy() {
        System.out.println("Filter destroy method");
    }
}
















