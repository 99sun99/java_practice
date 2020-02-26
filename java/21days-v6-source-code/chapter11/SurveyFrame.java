import java.awt.*;
import javax.swing.*;

public class SurveyFrame extends JFrame {
    public SurveyFrame() {
        super("Survey");
        setSize(290, 140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SurveyWizard wiz = new SurveyWizard();
        add(wiz);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        SurveyFrame surv = new SurveyFrame();
    }
} 
