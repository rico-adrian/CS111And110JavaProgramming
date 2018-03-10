//Author: Rico H Adrian
//import statements
import java.util.*;
import javax.swing.*;
import java.awt.event.*; 
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.awt.BorderLayout;


public class DiceRoll extends JFrame {
   
   //fields
   private JPanel panel;
   private JPanel panel1;
   private JPanel panel2;
   private JPanel panel3;
   private JPanel panel4;
   private JButton player1Score1;
   private JButton player1Score2;
   private JButton player2Score1;
   private JButton player2Score2;
   private JButton player1TotalScore;
   private JButton player2TotalScore;
   private JButton winner;
   private JButton reset;
   private JButton quit;
   private JTextField displayPlayer1Score1;
   private JTextField displayPlayer1Score2;
   private JTextField displayPlayer2Score1;
   private JTextField displayPlayer2Score2;
   private JTextField displayPlayer1Result;
   private JTextField displayPlayer2Result;
   private JTextField displayWinner;
   private JLabel player1Score1Label;
   private JLabel player1Score2Label;
   private JLabel player2Score1Label;
   private JLabel player2Score2Label;
   private JLabel player1ResultLabel;
   private JLabel player2ResultLabel;
   private JLabel displayWinnerLabel;
   private final int WINDOW_WIDTH = 1400, WINDOW_HEIGHT = 1000;
   private ImageIcon image;
   private JLabel imageLabel1;
   private JLabel imageLabel2;
   private JLabel imageLabel3;
   private JLabel imageLabel4;

   
   
   //constructor
   //building and adding panel inside it
   //and set things such as title and window size
   public DiceRoll() {
      buildPanel();
      setLayout(new FlowLayout());
      add(panel);
      add(panel1);
      add(panel2);
      add(panel3);
      add(panel4);
      setTitle("Dice Roller Competition");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   }
   
   //build panel method
   private void buildPanel() {
         
         //set the textField 
         displayPlayer1Result = new JTextField(10);
         displayPlayer1Result.setEditable(false);
         displayPlayer2Result = new JTextField(10);
         displayPlayer2Result.setEditable(false);
         displayPlayer1Score1 = new JTextField(10);
         displayPlayer1Score1.setEditable(false);
         displayPlayer1Score2 = new JTextField(10);
         displayPlayer1Score2.setEditable(false);
         displayPlayer2Score1 = new JTextField(10);
         displayPlayer2Score1.setEditable(false);
         displayPlayer2Score2 = new JTextField(10);
         displayPlayer2Score2.setEditable(false);
         displayWinner = new JTextField(10);
         displayWinner.setEditable(false);
         
         //set the label fields
         player1Score1Label = new JLabel("Player 1 Roll 1 Score: ");
         player1Score2Label = new JLabel("Player 1 Roll 2 Score: ");
         player2Score1Label = new JLabel("Player 2 Roll 1 Score: ");
         player2Score2Label = new JLabel("Player 2 Roll 2 Score: ");
         player1ResultLabel = new JLabel("Player 1 Total Score: ");
         player2ResultLabel = new JLabel("Player 2 Total Score: ");
         displayWinnerLabel = new JLabel("The Winner is: ");         
         
         //set the button fields
         player1Score1 = new JButton("Player 1 Roll 1");
         winner = new JButton("Display Winner");
         winner.setPreferredSize(new Dimension(200, 100));
         player1Score2 = new JButton("Player 1 Roll 2");
         player2Score1 = new JButton("Player 2 Roll 1");
         player2Score2 = new JButton("Player 2 Roll 2");
         reset = new JButton("Reroll");
         quit  = new JButton("Quit the game");
         
         //set the image label field
         image = new ImageIcon("dice1.png");
         imageLabel1 = new JLabel();
         imageLabel1.setIcon(image);
         imageLabel2 = new JLabel();
         imageLabel2.setIcon(image);
         imageLabel3 = new JLabel();
         imageLabel3.setIcon(image);
         imageLabel4 = new JLabel();
         imageLabel4.setIcon(image);
         
         //add different action listeners
         //to each button below
         player1Score1.addActionListener(new displayButtonsOutput());
         player1Score2.addActionListener(new displayButtonsOutput());
         player2Score1.addActionListener(new displayButtonsOutput());
         player2Score2.addActionListener(new displayButtonsOutput());
         winner.addActionListener(new displayButtonsOutput());
         reset.addActionListener(new displayButtonsOutput());
         quit.addActionListener(new displayButtonsOutput());
         
         //declaring the panels
         panel  = new JPanel();
         panel1 = new JPanel();
         panel2 = new JPanel();
         panel3 = new JPanel();
         panel4 = new JPanel();
         
         //set the layout of the panels
         panel.setLayout(new FlowLayout(FlowLayout.LEFT,60,80));
         panel1.setLayout(new FlowLayout(FlowLayout.RIGHT,60,80));
         panel2.setLayout(new FlowLayout(FlowLayout.CENTER,160,80));
         panel3.setLayout(new FlowLayout(FlowLayout.LEFT,60,80));
         panel4.setLayout(new FlowLayout(FlowLayout.LEFT,160,80));
         
         //adding all the fields to the panel
         panel.add(player1Score1);
         panel.add(player1Score2);
         panel.add(player1Score1Label);
         panel.add(displayPlayer1Score1);
         panel.add(player1Score2Label);
         panel.add(displayPlayer1Score2);
         panel.add(imageLabel1);
         panel.add(imageLabel2);
         panel1.add(player2Score1);
         panel1.add(player2Score2);
         panel1.add(player2Score1Label);
         panel1.add(displayPlayer2Score1);
         panel1.add(player2Score2Label);
         panel1.add(displayPlayer2Score2);
         panel1.add(imageLabel3);
         panel1.add(imageLabel4);
         panel2.add(player1ResultLabel);
         panel2.add(displayPlayer1Result);
         panel2.add(player2ResultLabel);
         panel2.add(displayPlayer2Result);
         panel3.add(winner);
         panel3.add(displayWinnerLabel);
         panel3.add(displayWinner);
         panel3.add(reset);
         panel4.add(quit);
         panel.setBackground(Color.RED);
         panel1.setBackground(Color.YELLOW);
         panel2.setBackground(Color.WHITE);
         panel3.setBackground(Color.LIGHT_GRAY);
         panel4.setBackground(Color.BLUE);
         
     

   }
   
   
   
   //listener method to display output of
   //all the buttons
   private class displayButtonsOutput implements ActionListener {
      
       public void actionPerformed(ActionEvent e) {
          String   whichButtonPressed   =   e.getActionCommand();
          Random rand = new Random();
   
          switch (whichButtonPressed) {
            
            //button "Player 1 Roll 1" displays
            //the score of the first roll of the player 1
            case "Player 1 Roll 1":
               displayWinner.setText("");
               int diceRoll1=rand.nextInt(6)+1;
               displayPlayer1Score1.setText(Integer.toString(diceRoll1));
               if (diceRoll1 == 1) {
                  image = new ImageIcon("dice1.png");
                  imageLabel1.setIcon(image);
               } 
               else if (diceRoll1 == 2) {
                  image = new ImageIcon("dice2.png");
                  imageLabel1.setIcon(image);
               } 
               else if (diceRoll1 == 3) {
                  image = new ImageIcon("dice3.png");
                  imageLabel1.setIcon(image);
               } 
               else if (diceRoll1 == 4) {
                  image = new ImageIcon("dice4.png");
                  imageLabel1.setIcon(image);
               } 
               else if (diceRoll1 == 5) {
                  image = new ImageIcon("dice5.png");
                  imageLabel1.setIcon(image);
               } 
   
               else if (diceRoll1 == 6) {
                  image = new ImageIcon("dice6.gif");
                  imageLabel1.setIcon(image);
               } 
   
               if (!displayPlayer1Score1.getText().equals("")&&!displayPlayer1Score2.getText().equals("")) {
                  int score1 = Integer.parseInt(displayPlayer1Score1.getText());
                  int score2 = Integer.parseInt(displayPlayer1Score2.getText());
                  int total=score1 + score2;
                  displayPlayer1Result.setText(Integer.toString(total));
               } 
               
               player1Score1.setEnabled(false);
               break;
            
            
            //button "Player 1 Roll 2" displays
            //the score of the second roll of the player 1
            case "Player 1 Roll 2":
               displayWinner.setText("");
               int diceRoll2=rand.nextInt(6)+1;
               displayPlayer1Score2.setText(Integer.toString(diceRoll2));
               if (diceRoll2 == 1) {
                  image = new ImageIcon("dice1.png");
                  imageLabel2.setIcon(image);
               } 
               else if (diceRoll2 == 2) {
                  image = new ImageIcon("dice2.png");
                  imageLabel2.setIcon(image);
               } 
               else if (diceRoll2 == 3) {
                  image = new ImageIcon("dice3.png");
                  imageLabel2.setIcon(image);
               } 
               else if (diceRoll2 == 4) {
                  image = new ImageIcon("dice4.png");
                  imageLabel2.setIcon(image);
               } 
               else if (diceRoll2 == 5) {
                  image = new ImageIcon("dice5.png");
                  imageLabel2.setIcon(image);
               } 
   
               else if (diceRoll2 == 6) {
                  image = new ImageIcon("dice6.gif");
                  imageLabel2.setIcon(image);
               } 
   
               if (!displayPlayer1Score1.getText().equals("")&&!displayPlayer1Score2.getText().equals("")) {
                  int score1 = Integer.parseInt(displayPlayer1Score1.getText());
                  int score2 = Integer.parseInt(displayPlayer1Score2.getText());
                  int total=score1 + score2;
                  displayPlayer1Result.setText(Integer.toString(total));
               } 
               
               player1Score2.setEnabled(false);
               break;
               
            
            //button "Player 2 Roll 1"
            //the score of the first roll of the player 2
            case "Player 2 Roll 1":
               displayWinner.setText("");
               int diceRoll3=rand.nextInt(6)+1;
               displayPlayer2Score1.setText(Integer.toString(diceRoll3));
               if (diceRoll3 == 1) {
                  image = new ImageIcon("dice1.png");
                  imageLabel3.setIcon(image);
               } 
               else if (diceRoll3 == 2) {
                  image = new ImageIcon("dice2.png");
                  imageLabel3.setIcon(image);
               } 
               else if (diceRoll3 == 3) {
                  image = new ImageIcon("dice3.png");
                  imageLabel3.setIcon(image);
               } 
               else if (diceRoll3 == 4) {
                  image = new ImageIcon("dice4.png");
                  imageLabel3.setIcon(image);
               } 
               else if (diceRoll3 == 5) {
                  image = new ImageIcon("dice5.png");
                  imageLabel3.setIcon(image);
               } 
   
               else if (diceRoll3 == 6) {
                  image = new ImageIcon("dice6.gif");
                  imageLabel3.setIcon(image);
               } 
   
               if (!displayPlayer2Score1.getText().equals("")&&!displayPlayer2Score2.getText().equals("")) {
                  int score1 = Integer.parseInt(displayPlayer2Score1.getText());
                  int score2 = Integer.parseInt(displayPlayer2Score2.getText());
                  int total=score1 + score2;
                  displayPlayer2Result.setText(Integer.toString(total));
               } 
               
               player2Score1.setEnabled(false);
               break;
               
            //button "Player 2 Roll 2" displays 
            //the score of the second roll of the player 2
            case "Player 2 Roll 2":
               displayWinner.setText("");
               int diceRoll4=rand.nextInt(6)+1;
               displayPlayer2Score2.setText(Integer.toString(diceRoll4));
               if (diceRoll4 == 1) {
                  image = new ImageIcon("dice1.png");
                  imageLabel4.setIcon(image);
               } 
               else if (diceRoll4 == 2) {
                  image = new ImageIcon("dice2.png");
                  imageLabel4.setIcon(image);
               } 
               else if (diceRoll4 == 3) {
                  image = new ImageIcon("dice3.png");
                  imageLabel4.setIcon(image);
               } 
               else if (diceRoll4 == 4) {
                  image = new ImageIcon("dice4.png");
                  imageLabel4.setIcon(image);
               } 
               else if (diceRoll4 == 5) {
                  image = new ImageIcon("dice5.png");
                  imageLabel4.setIcon(image);
               } 
   
               else if (diceRoll4 == 6) {
                  image = new ImageIcon("dice6.gif");
                  imageLabel4.setIcon(image);
               } 
   
               if (!displayPlayer2Score1.getText().equals("")&&!displayPlayer2Score2.getText().equals("")) {
                  int score1 = Integer.parseInt(displayPlayer2Score1.getText());
                  int score2 = Integer.parseInt(displayPlayer2Score2.getText());
                  int total=score1 + score2;
                  displayPlayer2Result.setText(Integer.toString(total));
               } 
               
               player2Score2.setEnabled(false);
               break;
               
   
               
            //button "Display Winner" displays 
            //the winner of the dice roll contest
            case "Display Winner":
                try {
                  int player1TotalScore = Integer.parseInt(displayPlayer1Result.getText());
                  int player2TotalScore = Integer.parseInt(displayPlayer2Result.getText());
                  
                  if (player1TotalScore > player2TotalScore) {
                      displayWinner.setText("Player 1");
                  }
                  else if (player2TotalScore > player1TotalScore) {
                      displayWinner.setText("Player 2");
                  } 
                  else if (player1TotalScore == player2TotalScore) {
                      displayWinner.setText("Even");
                  } 
                  
                
                }
                
                catch (NumberFormatException f) {
                  JOptionPane.showMessageDialog(null, "Data is not complete yet, please roll all dices");
                  System.out.println(f.getMessage());
                
                }             
               
                break;      
            
            
            //button "Reroll"
            //reset all the textfields and button
            //to start a new game
            case "Reroll":
               displayPlayer1Result.setText("");
               displayPlayer2Result.setText("");
               displayPlayer1Score1.setText("");
               displayPlayer1Score2.setText("");
               displayPlayer2Score1.setText("");
               displayPlayer2Score2.setText("");
               displayWinner.setText("");
               player1Score1.setEnabled(true);
               player1Score2.setEnabled(true);
               player2Score1.setEnabled(true);
               player2Score2.setEnabled(true);
               image=new ImageIcon("dice1.png");
               imageLabel1.setIcon(image);
               imageLabel2.setIcon(image);
               imageLabel3.setIcon(image);
               imageLabel4.setIcon(image);
               break;
            
            //button "Quit the game" is to
            //quit the game(exit the system)
            case "Quit the game":
               System.exit(0);
               break;
   
          }             
      
       }

   }
   
     

   //main routine
   public static void main(String[] args)throws IOException {
      DiceRoll diceRoll=new DiceRoll();
    
   
   }
   
   
   
} 