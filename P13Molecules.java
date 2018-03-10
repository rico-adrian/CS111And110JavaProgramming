import java.util.Scanner;  // Needed for the Scanner class

/*
  This program calculates the number of molecules of a substance, 
  given the molecular weight(m), and a quantity in grams or in ounces. 

*/

public class P13Molecules
{
   public static void main(String[] args)
   {
      // Identifier declarations
      double molecularWeight;
      double quantityOrMass;
      double numberOfMoles=0;
      double numberOfMolecules=0;
      String substance;
      final double AVOGADRO_NUMBER=6.022E22;
      String quantityOrMassUnit;
      final double OUNCES_TO_GRAMS=28.35;

      
                       
      

      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Display prompts and get input.(time in hours, seconds and minutes)
      System.out.print("Is it in grams or ounces:          ");
      quantityOrMassUnit = keyboard.nextLine();
      System.out.print("Name of Substance:    ");
      substance = keyboard.nextLine();
      System.out.print("Molecular Weight in grams/mol:        ");
      molecularWeight = keyboard.nextDouble();
      System.out.print("Quantity/Mass:          ");
      quantityOrMass = keyboard.nextDouble();

       
      
      // Perform the calculations.(Number of Moles and Molecules)
      
     if (quantityOrMassUnit.equals("ounces")){
     
         numberOfMoles= quantityOrMass* OUNCES_TO_GRAMS/molecularWeight;
         numberOfMolecules=numberOfMoles*AVOGADRO_NUMBER;
     }

      
      if (quantityOrMassUnit.equals("grams")){
         numberOfMoles= quantityOrMass/molecularWeight;
         numberOfMolecules=numberOfMoles*AVOGADRO_NUMBER;
      }
                  
        //Converting the number of Moles into 2 decimals
        numberOfMoles = Math.round(numberOfMoles * 100.0) / 100.0;       
      
      // Display the results.
      System.out.print("\n");
      System.out.print("Number of Moles        ");
      System.out.println(numberOfMoles);
      System.out.print("Number of Molecules     ");
      System.out.println(numberOfMolecules);
          
       }
}
