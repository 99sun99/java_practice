import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class NewWatch extends JApplet {
    private Color butterscotch = new Color(255, 204, 102);
    Rectangle2D.Float background;
    Graphics2D screen2D;
    Color primary;

    public void init() {
        String parameter = getParameter("primary");
        if (parameter != null) {
            try {
                primary = Color.decode(parameter);
            } catch (NumberFormatException e) {
                showStatus("Bad parameter " + parameter);
                primary = Color.black;
            }
        }
        setBackground(primary);
    }

    public void paint(Graphics screen) {
        super.paint(screen);
        Graphics2D screen2D = (Graphics2D)screen;
        Font type = new Font("Monospaced", Font.BOLD, 20);
        screen2D.setFont(type);
        screen2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        if (background == null) {
            // set up the background rectangle
            background = new Rectangle2D.Float(
                0F, 0F, (float)getSize().width, (float)getSize().height
            );
        }
        screen2D.setColor(primary);
        screen2D.fill(background);
        GregorianCalendar day = new GregorianCalendar();
        String time = day.getTime().toString();
        screen2D.setColor(butterscotch);
        screen2D.drawString(time, 5, 25);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // do nothing
        }
        repaint();
    }
}
