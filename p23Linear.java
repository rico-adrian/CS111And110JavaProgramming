import java.util.Scanner;

public class p23Linear
{
   public static void main(String[] args)
   {
            
       // Identifier declarations          
      double m1;
      double b1;
      double m2;
      double b2;
      

       // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);   
      
      System.out.print("enter the value of 'm1,b1,m2 and b2' in order ");
      m1 = keyboard.nextDouble();   
      b1 = keyboard.nextDouble();
      m2 = keyboard.nextDouble();
      b2 = keyboard.nextDouble();
      

      
      SolveLinear(m1, b1, m2, b2); //calling the method
   }
      
   public static void SolveLinear(double m1, double b1, double m2, double b2)    {
      double x;
      double y;
      
      //solve the formula and find the intersecting point
      x = (b2 - b1) / (m1 - m2); 
      
       if ((m1 - m2) != 0)
      {
         y = (m2 * x) + b2;
         System.out.println("The intersecting point is (" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ").");
      }
      
       else
      {
                  if ((b2 - b1) == 0&(m1 - m2)==0)
            System.out.println("There are infinite solutions to get an intersecting point because '(m1 - m2) = 0 and (b2 - b1) = 0'.");
             
         else
            System.out.println("There is no solution to get an intersecting point because '(m1 - m2) = 0 and (b2 - b1) != 0'.");
      }
   }
}