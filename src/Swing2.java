import javax.swing.JFrame;

public class Test extends JFrame {
    Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 100, 400, 500);
        setTitle("Asif");
    }

    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);

    }
}
