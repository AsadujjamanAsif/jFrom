
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class demo3 extends JFrame {

    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;

    demo3() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        img = new ImageIcon(getClass().getResource("images.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50, 30, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

    }

    public static void main(String[] args) {
        demo3 frame = new demo3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 500);

    }

}
