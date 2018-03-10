import java.util.Scanner;  // Needed for the Scanner class

/*
   This program calculates the user's gross pay.

 Lab01 :  Study what the program does and improve the prompts.
*/

public class Pay
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Identifier declarations
      double hours;  // Number of hours worked
      double rate;   // Hourly pay rate
      double pay=0;    // Gross pay

      // Display prompts and get input. 
      System.out.print("How many ...  ");
      hours = keyboard.nextDouble();
      System.out.print("How much ... ? ");
      rate = keyboard.nextDouble();

      // Perform the calculations.
      if(hours == 40^hours==50)
         pay = hours * rate;
     

      // Display results.
      System.out.println("You earned $" + pay);
   }
}
