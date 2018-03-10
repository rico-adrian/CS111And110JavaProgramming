//import statements
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*; 

public class TempConverter extends JFrame {
   
   //fields
   private JPanel panel;
   private JButton converterButton;
   private JLabel temperature ;
   private JTextField temperatureNumber ;
   private JLabel temperatureScale ;
   private JTextField temperatureCOrF ;
   private final int WINDOW_WIDTH = 330, WINDOW_HEIGHT = 200;
   
   
   //constructor
   //building and adding panel inside it
   //and set things like title and window size
   public TempConverter() {
      buildPanel();
      add(panel);
      setTitle("C/F converter");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   //build panel method
   private void buildPanel() {
      //fill the textField, label and button fields
      converterButton   = new JButton("Convert Temperature");
      temperature       = new JLabel("Temperature: ");
      temperatureNumber = new JTextField(10);
      temperatureScale  = new JLabel("Temperature Scale: ");
      temperatureCOrF   = new JTextField(10);
      //add listener
      converterButton.addActionListener(new CalcButtonListener());
      //adding all the fields into panel
      panel = new JPanel(); 
      panel.add(temperature);
      panel.add(temperatureNumber);
      panel.add(temperatureScale);
      panel.add(temperatureCOrF);
      panel.add(converterButton);

   }
   
   //listener method to calculate output
   private class CalcButtonListener implements ActionListener {
      double output;
      
      public void actionPerformed(ActionEvent e) {
         
         //calculate the result based on user input
         //celcius or fahrenheit and temperature number 
         if (temperatureCOrF.getText().equalsIgnoreCase("Celcius")) {
             String fahrenheit;
             fahrenheit= temperatureNumber.getText();
             double temp = Double.parseDouble(fahrenheit);
             output = (5 * (temp-32.0))/9;
             output = Math.round(output *100) / 100.0;
             JOptionPane.showMessageDialog(null, "The equivalent Celcius temp: "+ output+ " degrees");
         }  
         
         else if (temperatureCOrF.getText().equalsIgnoreCase("fahrenheit")) {
             String celcius;
             celcius= temperatureNumber.getText();
             double temp = Double.parseDouble(celcius);
             output = (temp * 1.8)+32.0;
             output = Math.round(output *100) / 100.0;
             JOptionPane.showMessageDialog(null, "The equivalent Fahrenheit temp: "+ output+ " degrees");
         }
         
         else {
            JOptionPane.showMessageDialog(null, "invalid temp Scale entered");

         
         }
     
      
      }

   }

   
   //main class
   public static void main(String[] args) {
      TempConverter temp = new TempConverter();
   
   }
   
   
   
} 