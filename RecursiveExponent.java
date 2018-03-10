import java.util.*;

public class RecursiveExponent {
   // the main method
   public static void main(String[] args) {
       
       //fields
       int base;
       int exponent;
       
       //prompt user input
       Scanner keyboard=new Scanner(System.in);
       System.out.println("What is the base? ");
       base=keyboard.nextInt();
       System.out.println("What is the exponent? ");
       exponent=keyboard.nextInt();
       
       //calling the exponentiation method
       //and displaying the result
       int result= exponentiation(base,exponent);
       System.out.println(base+ " raised to the power " +exponent+" is "+ result); 
       
   }
   
   //create method to calculate the exponentiation
   //with recursion
   public static int exponentiation(int base, int exponent) {
      
       if (base == 0) { 
         return 0;
       } else if (base == 1 || exponent == 0) { 
           return 1;
       } else { 
           return base*exponentiation(base, exponent-1); 
       } 

   }
 
}   