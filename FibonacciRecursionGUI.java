import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FibonacciRecursionGUI extends JFrame {
   
    //fields
    private JPanel panel;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea display;
    private int numInvocations = 0;
    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 200; 
    
    // Components
    public FibonacciRecursionGUI() {
       buildPanel();
       add(panel);
       setTitle("Fibonacci Recursion");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    // build panel method
    private void buildPanel() {
       //set the value to the components or fields
       button1      = new JButton("Calculate Fibonacci Number");
       label1       = new JLabel("Which Fibonacci Number: ");
       label2       = new JLabel("The Fibonacci Number: ");
       textField1   = new JTextField(5); 
       textField2   = new JTextField(5);
       textField2.setEditable(false);
       display      = new JTextArea (5, 15);
       display.setEditable (false); 
       JScrollPane scroll = new JScrollPane ( display );
       scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); 
       button1.addActionListener(new ButtonListener());
       //adding components to the panel 
       panel = new JPanel();
       panel.add(label1);
       panel.add(textField1);
       panel.add(button1);
       panel.add(label2);
       panel.add(textField2);
       panel.add(scroll);

   }

    // fibonacci recursive method
    public int fibonacci(int n) {
       numInvocations++;
       display.append("invocation " + numInvocations + "\n"); 
       if (n == 0) { 
         return 0;
       } else if (n == 1) { 
           return 1;
       } else { 
           return fibonacci(n-1) + fibonacci(n-2); 
       } 

    }

    // the inner class; the action listener
    private class ButtonListener implements ActionListener {
         
        public void actionPerformed(ActionEvent e) {
            int userInput     = Integer.parseInt(textField1.getText());
            int fibNum        = fibonacci(userInput);
            textField2.setText(Integer.toString(fibNum));
                        
        
        }
    }

    // the main method
    public static void main(String[] args) {
       FibonacciRecursionGUI fibonacci=new FibonacciRecursionGUI();
    
    }
}