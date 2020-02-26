import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ColorServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        String pageColor;
        String colorParameter = req.getParameter("color");
        if (colorParameter != null) {
            Cookie colorCookie = new Cookie("color", colorParameter);
            colorCookie.setMaxAge(31536000);
            res.addCookie(colorCookie);
            pageColor = colorParameter;
        } else {
            pageColor = retrieveColor(req.getCookies());
        }
        String text = req.getParameter("text");
        String translation = translate(text);
        res.setContentType("text/html");
        ServletOutputStream out = res.getOutputStream();
        out.println("<html>");
        out.println("<body bgcolor=\"" + pageColor + "\">");
        out.println("<head><title>ROT-13 Translator</title></head>");
        out.println("<h1>ROT-13 Translator</h1>");
        out.println("<p>Text to translate:");
        out.println("<form action=\"ColorServlet\" method=\"POST\">");
        out.println("<textarea name=\"text\" ROWS=8 COLS=55>");
        out.println(translation);
        out.println("</textarea>");
        out.println("<p>Background color of page:");
        out.println("<p><input type=\"text\" name=\"color\" value=\"" +
            pageColor + "\" SIZE=40>");
        out.println("<p><input type=\"submit\" value=\"submit\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        doPost(req, res);
    }

    String translate(String input) {
        StringBuffer output = new StringBuffer();
        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                char inChar = input.charAt(i);
                if ((inChar >= 'A') & (inChar <= 'Z')) {
                    inChar += 13;
                    if (inChar > 'Z')
                        inChar -= 26;
                }
                if ((inChar >= 'a') & (inChar <= 'z')) {
                    inChar += 13;
                    if (inChar > 'z')
                        inChar -= 26;
                }
                output.append(inChar);
            }
        }
        return output.toString();
    }

    String retrieveColor(Cookie[] cookies) {
        String inColor = "#FFFFFF";
        for (int i = 0; i < cookies.length; i++) {
            String cookieName = cookies[i].getName();
            if (cookieName.equals("color")) {
                inColor = cookies[i].getValue();
            }
        }
        return inColor;
    }
}
