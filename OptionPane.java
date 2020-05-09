import javax.swing.JOptionPane;
public class OptionPane {
  public static void main(String[] args) {
    String firstName = JOptionPane.showInputDialog(null, "Enter your first name");
    String lastName = JOptionPane.showInputDialog(null, "Enter your last name");
    String phoneNumber = JOptionPane.showInputDialog(null, "Enter your phone number");
    String fullName = firstName + " " + lastName + " " + phoneNumber;
    JOptionPane.showMessageDialog(null,"Welcome " + fullName);
  }
}
