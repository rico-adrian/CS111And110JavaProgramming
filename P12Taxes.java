import java.util.Scanner;  // Needed for the Scanner class

/*
  This program calculates the price totals and taxes of a product,
  given the type of product, numbers of items purchased, and
  the price of item. The taxes of every type of products would be different.
  
*/

public class P12Taxes
{
   public static void main(String[] args)
   {
      // Identifier declarations
      double priceOfItem;
      double numberOfItems;
      String typeOfProduct;
      final double TAX_TYPE_A = 0.045;
      final double TAX_TYPE_B = 0.055;
      final double TAX_TYPE_C_1 = 0.06;
      final double TAX_TYPE_C_2 = 0.05;
      final double TAX_TYPE_D = 0.05;
      double taxPrice=0;
      double totalPrice=0;
      double priceBeforeTax;
              
      

      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Display prompts and get input.(Type of product,Number of Items Purchased and Price of Item)
      System.out.print("Type of product:  ");
      typeOfProduct = keyboard.nextLine();
      System.out.print("Number of Item(s):  ");
      numberOfItems = keyboard.nextDouble();
      System.out.print("Price of Item:  $");
      priceOfItem = keyboard.nextDouble();
    
      
            
      
      // Perform the calculations.(Total Price and Taxes of type A,B,C,and D)
      
      
         priceBeforeTax=priceOfItem*numberOfItems; //calculate the price before tax
     

        //Calculating the tax price and total price using conditional statements if
        //since there are 4 different possible computations. The reason is because
        //the taxes on product A,B,C and D are different. As a result, the total 
        //price will also be different.
        
         if (typeOfProduct.equals("A"))      { 
         taxPrice = (priceOfItem*numberOfItems) * TAX_TYPE_A;
         totalPrice=(priceOfItem*numberOfItems)+taxPrice;
        }
          

         else if (typeOfProduct.equals("B")){        
          taxPrice = (priceOfItem*numberOfItems) * TAX_TYPE_B;
        totalPrice=(priceOfItem*numberOfItems)+taxPrice;}
           

       else if (typeOfProduct.equals("C")){
         taxPrice = (priceOfItem *numberOfItems* TAX_TYPE_C_1)+(priceOfItem*numberOfItems * TAX_TYPE_C_2);
         totalPrice=(priceOfItem*numberOfItems)+taxPrice;}
                  
        else if (typeOfProduct.equals("D")){
         taxPrice = (priceOfItem*numberOfItems) * TAX_TYPE_D;
         totalPrice=(priceOfItem*numberOfItems)+taxPrice;
        }
        
        
        //Converting the tax price and total price into 2 decimals
        taxPrice = Math.round(taxPrice * 100.0) / 100.0;
        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        





    
      
      
      // Display the results.
      System.out.print("Price before Tax         $");
      System.out.println(priceBeforeTax);
      System.out.print("Tax          $");
      System.out.println(taxPrice);
      System.out.print("Total        $");
      System.out.println(totalPrice);

      
            
      
            
       }
}
