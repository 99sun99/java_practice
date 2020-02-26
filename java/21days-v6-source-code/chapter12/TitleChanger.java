import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TitleChanger extends JFrame implements ActionListener {
    JButton b1 = new JButton("Rosencrantz");
    JButton b2 = new JButton("Guildenstern");

    public TitleChanger() {
        super("Title Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }


    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == b1) {
            setTitle("Rosencrantz");
        } else if (source == b2) {
            setTitle("Guildenstern");
        }
        repaint();
    }

    public static void main(String[] arguments) {
        TitleChanger frame = new TitleChanger();
    }
}
