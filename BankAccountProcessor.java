import java.util.*;
import java.io.*;


public class BankAccountProcessor {
     public static void main(String[]args) throws FileNotFoundException {
      
      //prompts user to input a file name
      File file = new File("accountsFile.txt");
      Scanner inputFile = new Scanner(file);
      
      
       
      //create a boolean field runProgram
      boolean runProgram=true;
      
      //while loop to keep inputting the next line
      //if bank account is valid
      //with try-block statements included
      while (runProgram==true) {
         try {
            while (inputFile.hasNext()) {
                  String fileLine = inputFile.nextLine();
               if (isValid(fileLine)) {
                  System.out.println(fileLine+ " succesfully processed");
               }  
                
            }
         }
           
         catch (BankAccountException e) {
            Scanner keyboard=new Scanner(System.in);
            System.out.println(e.getMessage());
            System.out.println("error, do you wish to continue?");
            String input=keyboard.nextLine();
            switch(input) {
               case "no": System.exit(0);
            }

       }
         
    
      
      }
      
    }
    
    
        //creating an isValid method to see if the bank account
        //is valid or not 
         
         private static boolean isValid(String accountLine) throws BankAccountException {
            boolean isValid1=false;
            StringTokenizer token=new StringTokenizer(accountLine,";", false);
      
            while (token.hasMoreTokens()) {
               String d=token.nextToken();
               String l=token.nextToken();
         
               for (int i=0;i<d.length();i++) {
                    if(!Character.isDigit(d.charAt(i)) || d.length()!=10) {
                       isValid1= false;
                       throw new BankAccountException("Account number has non-digit character: "+ d);
                    } else { 
                        isValid1=true;
                    }
               }
           
                 
               for (int i=0;i<l.length();i++) {
                     if(!Character.isLetter(l.charAt(i))&& l.length()< 3) {
                        isValid1=false;
                        throw new BankAccountException("Invalid account number: "+ l);
                     } else { 
                         isValid1=true;
                     }
         
               }
               
             }
              
               return isValid1;   
           }          


}