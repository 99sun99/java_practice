import javax.swing.*;

public class MessageFrame extends JFrame {
    public MessageFrame() {
        super("E-mail");
        setSize(320, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MessagePanel mPanel = new MessagePanel();
        add(mPanel);
        setVisible(true);
    }
    
    public static void main(String[] arguments) {
        new MessageFrame();
    }
}