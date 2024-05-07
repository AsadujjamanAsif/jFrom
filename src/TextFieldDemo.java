import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;

import java.awt.Color;
import java.awt.Container;

public class TextFieldDemo extends JFrame {
    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    TextFieldDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 16);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        // tf1.setText("Asadujjaman");
        tf1.setForeground(Color.GREEN);
        tf1.setBackground(Color.PINK);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);

        tf2 = new JTextField();
        // tf2.setText("Asadujjaman");
        tf2.setBounds(50, 200, 200, 50);
        c.add(tf2);

    }

    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Asadujjaman Asif");
    }
}
