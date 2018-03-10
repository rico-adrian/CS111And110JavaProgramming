import java.util.*;

public class PasswordVerifier {
   
   //fields
   private final static int MIN_PASSWORD_LENGTH=6;
   
   
   
   //create static methods to see if the password is valid
   //or not   
   public static boolean isValid(String str) {
      if (str.length()==MIN_PASSWORD_LENGTH&&hasDigit(str)&&
            hasUpperCase(str)&&
               hasLowerCase(str)) {
            return true;
      }  else {
            return false;
      }
  
      
   }
  
  //static method to see if the password
  //has upper case or not
  private static boolean hasUpperCase(String str) {
      for( int i = 0; i< str.length(); i++ ) {
         if( Character.isUpperCase( str.charAt(i))) {
            return true;
            
         }  
      } 
         return false;
   }
   
   //static method to see if the password
   //has lower case or not
   private static boolean hasLowerCase(String str) {
      for( int i = 0; i< str.length(); i++ ) {
         if( Character.isLowerCase( str.charAt(i))){         
            return true;
         } 
      
      }
         return false;

   }
  
  //static method to see if the password
  //has digit or not 
  private static boolean hasDigit(String str) {
      for( int i = 0; i< str.length(); i++ ) {
         if( Character.isDigit( str.charAt(i))) {
            return true;
         } 

      }
            return false;
   }
   






























}