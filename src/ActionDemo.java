import java.awt.Color;
import java.awt.Container;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class ActionDemo extends JFrame {

    private Container c;
    private JTextField tf1, tf2;

    ActionDemo() {
        initComponents();
    }

    public void initComponents()

    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 120, 150, 50);
        c.add(tf2);
    }

    public static void main(String[] args) {
        ActionDemo frame = new ActionDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 100, 500, 400);
        frame.setTitle("Asadujjaman");
    }
}
