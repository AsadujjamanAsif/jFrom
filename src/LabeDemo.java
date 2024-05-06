import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabeDemo extends JFrame {

    private Container c;
    private JLabel userLabel;

    LabeDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        userLabel = new JLabel();
        userLabel.setText("Enter your user name: ");
        userLabel.setBounds(30, 40, 150, 50);
        c.add(userLabel);
    }

    public static void main(String[] args) {
        LabeDemo frame = new LabeDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 500);

    }
}
