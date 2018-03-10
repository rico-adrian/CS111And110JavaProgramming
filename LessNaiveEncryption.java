// File: LessNaiveEncryption.java
// Author: 
//
// Description: The skeleton of a program that uses StringTokenizer
// and a StringBuilder objects to reverse the letters of each word,
// but which keeps the order of the words the same. For example:
//
// Input : 123ab 445 hello
// Output: ba321 544 olleh
//

// the required import statements
import java.util.StringTokenizer;
import java.util.Scanner;

public class LessNaiveEncryption {

    public static void main(String[] args) {

        // Setup a scanner object, and receive user's input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Provide an input sentence: ");
        String userInput = keyboard.nextLine();
        //Create a StringTokenizer object
        StringTokenizer strTokenizer=new StringTokenizer(userInput," ",true);
        System.out.print("The output sentence is   : ");
        
        
        
        //Tokenize the sentence from user input and
        //build a StringBuilder object
        while(strTokenizer.hasMoreTokens()){
            StringBuilder strBuilder=new StringBuilder(strTokenizer.nextToken());
            //use the reverse method to print the reversed word
            //of user input
            System.out.print(strBuilder.reverse());
        
        }
                    
        System.out.print("\n");
    }
}

