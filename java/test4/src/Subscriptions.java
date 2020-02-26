import javax.swing.*;

public class Subscriptions extends JFrame {
    String[] subs = { "0xDECAFBAD", "Cafe au Lait",
        "Hack the Planet", "Ideoplex", "Inessential", "Intertwingly",
        "Markpasc", "Postneo", "RC3", "Workbench" };
    JList subList = new JList(subs);
    
    public Subscriptions() {
        super("Subscriptions");
        setSize(150, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("RSS Subscriptions:");
        panel.add(subLabel);
        subList.setVisibleRowCount(8);
        JScrollPane scroller = new JScrollPane(subList);
        panel.add(scroller);
        add(panel);
        setVisible(true);
    } 

    public static void main(String[] arguments) {
        Subscriptions app = new Subscriptions();
    }
}
