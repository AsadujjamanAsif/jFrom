import javax.swing.JFrame;

public class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 300);
        // frame.setLocationRelativeTo(null);
        // frame.setLocation(200, 50);
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Asadujjaman Asif");
        frame.setResizable(false);
    }
}
