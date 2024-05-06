import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {

        String f_name = JOptionPane.showInputDialog(null, "Enter Your 1st Name: ", "This is title",
                JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog("Enter Your last Name: ");
        String name = f_name + " " + l_name;
        JOptionPane.showMessageDialog(null, "Your Full name is: " + name);
    }

}
