import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Container;

public class FramDemo extends JFrame {
    private ImageIcon icon;
    private Container c;

    FramDemo() {
        initcomponents();
    }

    public void initcomponents() {

        c = this.getContentPane();
        c.setBackground(Color.BLACK);

        icon = new ImageIcon(getClass().getResource("Images.png"));
        this.setIconImage(icon.getImage());

    }

    public static void main(String[] args) {
        FramDemo frame = new FramDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 400, 500);
        frame.setTitle("Asif Fram");
        frame.setResizable(false);
    }
}
