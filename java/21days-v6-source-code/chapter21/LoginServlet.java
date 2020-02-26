import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        HttpSession session = req.getSession();
        Boolean loggedIn = (Boolean) session.getAttribute("loggedIn");
        if (loggedIn == null) {
            loggedIn = new Boolean(false);
        }
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Date lastVisit;
        res.setContentType("text/html");
        ServletOutputStream out = res.getOutputStream();
        out.println("<html>");
        out.println("<body>");
        out.println("<head><title>Login Page</title></head>");
        if (loggedIn.booleanValue() == true) {
            // user is already logged in
            username = (String) session.getAttribute("username");
            password = (String) session.getAttribute("password");
            lastVisit = (Date) session.getAttribute("lastVisit");
            out.println("<p>Welcome back, " + username);
            out.println("<p>You last visited on " + lastVisit);
            lastVisit = new Date();
            session.setAttribute("lastVisit", lastVisit); 
        } else {
            if (username == null) {
                // user has not submitted the form required to log in
                out.println("<h1>Log In</h1>");
                out.println("<form action=\"LoginServlet\" " +
                    "method=\"POST\">");
                out.println("<p>Username:");
                out.println("<input type=\"text\" name=\"username\" " +
                    "value=\"\" SIZE=30>");
                out.println("<p>Password:");
                out.println("<input type=\"password\" name=\"password\" " +
                    "value=\"\" SIZE=30>");
                out.println("<p><input type=\"submit\" value=\"log in\">");
                out.println("</form>");
            } else {
                // user has submitted the log in form
                out.println("Logging in " + username);
                session.setAttribute("username", username);
                session.setAttribute("password", password);
                session.setAttribute("loggedIn", new Boolean(true));
                session.setAttribute("lastVisit", new Date());
                out.println("<a href=\"LoginServlet\">Reload Page</a>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        doPost(req, res);
    }
}
