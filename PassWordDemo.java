//import statements
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class PassWordDemo {
   public static void main(String[]args) {
   
      //field
      String input;
      //create a box that show input dialog
      input=JOptionPane.showInputDialog("Enter a password:");
      
      //check if the password is valid or not
      //and print the result
      if (PasswordVerifier.isValid(input)) {
            JOptionPane.showMessageDialog(null, "Password is valid","Password", JOptionPane.INFORMATION_MESSAGE);
      }  else {
            JOptionPane.showMessageDialog(new JFrame(), "Password is invalid","Password", JOptionPane.ERROR_MESSAGE);
      }
   
   

   }
}