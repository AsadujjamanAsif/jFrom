import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class LabeDemo2 extends JFrame {

    private Container c;
    private JLabel userLabel, passLabel;
    private Font f;

    LabeDemo2() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial", Font.BOLD, 15);

        userLabel = new JLabel();
        userLabel.setText("Enter your user name: ");
        userLabel.setBounds(30, 40, 200, 50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.CYAN);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.LIGHT_GRAY);
        userLabel.setToolTipText("Enter your User namr: ");
        c.add(userLabel);

        passLabel = new JLabel("Enter your Password");
        passLabel.setBounds(30, 100, 200, 50);
        passLabel.setFont(f);
        c.add(passLabel);
    }

    public static void main(String[] args) {
        LabeDemo2 frame = new LabeDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 500);

    }
}
