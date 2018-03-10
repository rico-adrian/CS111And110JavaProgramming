/*  ** Program Meetings **
    This program asks for a digit 1-9 that correspods to
    a busy and free file. Then finds three meeting times which
    all potential attendees can meet at. 
*/

import java.io.*;
import java.util.*;


public class p31Meetings{

   public static void main(String [] args)throws IOException{
   
      int N;              //To access busyN.txt and FreeN.txt
      String busyFile;    //busyN.txt
      String freeFile;    //freeN.txt
      final int NAMEANDDAYS = 6; // 5 days but the first token will be names
      final int HOURS = 10; // 10 hours in a day available
      boolean[][] freeTimes = new boolean[NAMEANDDAYS][HOURS]; //initialize 2darray
      boolean[][] busyTimes = new boolean[NAMEANDDAYS][HOURS]; //initialize 2darray
      
      //Create Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //prompt user for information
      System.out.println("The times of the potential attendees are in two files.");
      System.out.print("Enter a digit 1-9 that will access the two files to schedule a meeting: ");
      N = keyboard.nextInt();
     
      //Files to open and read in readArray() method.
      busyFile = "busy" + N + ".txt";
      freeFile = "free" + N + ".txt";
      
      freeTimes = getTimes(freeFile); //splits freefile and assigns values to boolean[][]
      busyTimes = getTimes(busyFile); //splits busyfile and assigns values to boolean[][]
      displayTimes(freeTimes, busyTimes); //prints the available meeting times
    
   }
   
   /* This method assigns the days and hours to a boolean[][] */
   
   public static boolean[][] getTimes(String fileName)throws IOException{
      boolean[][] canMeet = new boolean[6][10];
      String[] token;
      String[] token2;
      
      File file = new File(fileName); // file to be read from
      Scanner fileToRead = new Scanner(file); //reading file 
      
      while (fileToRead.hasNext()){
         String line = fileToRead.nextLine();
         token = line.split("/"); //splits by "/"
         for(int j = 0; j < token.length; j++){
            token2 = token[j].split(" "); //splits by " "
            for(int k = 0; k < token2.length; k++){
               
               //Sets the day to the corresponding index in boolean[][]
               switch (j) {
                  case 1: 
                     if (token2[0] != "M") {
                        break;}
                     else{ 
                        continue;}
                  case 2: 
                     if (token2[0] != "T") {
                        break;}
                     else{ 
                        continue;}
                  case 3: 
                     if (token2[0] != "W") {
                        break;}
                     else{ 
                        continue;}
                  case 4: 
                     if (token2[0] != "R") {
                        break;}
                     else{ 
                        continue;}
                  case 5: 
                     if (token2[0] != "F") {
                        break;}
                     else{ 
                        continue;}
                  default: 
                     continue;
                                                   
               }
               //sets values of hours to true in corresponding index
               switch (token2[k]){
                  case "8": canMeet[j][0] = true;
                     break;
                  case "9": canMeet[j][1] = true;
                     break;
                  case "10": canMeet[j][2] = true;
                     break;
                  case "11": canMeet[j][3] = true;
                     break;
                  case "12": canMeet[j][4] = true;
                     break;
                  case "1": canMeet[j][5] = true;
                     break;
                  case "2": canMeet[j][6] = true;
                     break;
                  case "3": canMeet[j][7] = true;
                     break;
                  case "4": canMeet[j][8] = true;
                     break;
                  case "5": canMeet[j][9] = true;
                     break;
                  default:
                     break;
               }  
            }    
         }        
      }
      
      return canMeet;
   }
   
   /* This method takes the two boolean[][] and compares them to create meeting times */
   
   public static void displayTimes (boolean[][] free, boolean[][] busy){
      int count = 0;
      
      //Displays meeting times for Friday
      if ((free[5][9] != busy[5][9])){
         System.out.println("A meeting can be scheduled Friday a 5:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][8] != busy[5][8])){
         System.out.println("A meeting can be scheduled Friday at 4:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][7] != busy[5][7])){
         System.out.println("A meeting can be scheduled Friday at 3:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][6] != busy[5][6])){
         System.out.println("A meeting can be scheduled Friday at 2:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][5] != busy[5][5])){
         System.out.println("A meeting can be scheduled Friday at 1:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][4] != busy[5][4])){
         System.out.println("A meeting can be scheduled Friday at 12:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][3] != busy[5][3])){
         System.out.println("A meeting can be scheduled Friday at 11:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][2] != busy[5][2])){
         System.out.println("A meeting can be scheduled Friday at 10:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][1] != busy[5][1])){
         System.out.println("A meeting can be scheduled Friday at 9:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[5][0] != busy[5][0])){
         System.out.println("A meeting can be scheduled Friday at 8:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
   
      //Displays meeting times for Thursday
      if ((free[4][9] != busy[4][9])){
         System.out.println("A meeting can be scheduled Thursday a 5:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][8] != busy[4][8])){
         System.out.println("A meeting can be scheduled Thursday at 4:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][7] != busy[4][7])){
         System.out.println("A meeting can be scheduled Thursday at 3:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][6] != busy[4][6])){
         System.out.println("A meeting can be scheduled Thursday at 2:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][5] != busy[4][5])){
         System.out.println("A meeting can be scheduled Thursday at 1:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][4] != busy[4][4])){
         System.out.println("A meeting can be scheduled Thursday at 12:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][3] != busy[4][3])){
         System.out.println("A meeting can be scheduled Thursday at 11:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][2] != busy[4][2])){
         System.out.println("A meeting can be scheduled Thursday at 10:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][1] != busy[4][1])){
         System.out.println("A meeting can be scheduled Thursday at 9:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[4][0] != busy[4][0])){
         System.out.println("A meeting can be scheduled Thursday at 8:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      
      //Displays meeting times for Wednesday
      if ((free[3][9] != busy[3][9])){
         System.out.println("A meeting can be scheduled Wednesday a 5:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][8] != busy[3][8])){
         System.out.println("A meeting can be scheduled Wednesday at 4:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][7] != busy[3][7])){
         System.out.println("A meeting can be scheduled Wednesday at 3:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][6] != busy[3][6])){
         System.out.println("A meeting can be scheduled Wednesday at 2:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][5] != busy[3][5])){
         System.out.println("A meeting can be scheduled Wednesday at 1:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][4] != busy[3][4])){
         System.out.println("A meeting can be scheduled Wednesday at 12:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][3] != busy[3][3])){
         System.out.println("A meeting can be scheduled Wednesday at 11:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][2] != busy[3][2])){
         System.out.println("A meeting can be scheduled Wednesday at 10:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][1] != busy[3][1])){
         System.out.println("A meeting can be scheduled Wednesday at 9:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[3][0] != busy[3][0])){
         System.out.println("A meeting can be scheduled Wednesday at 8:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      
      //Displays meeting times for Tuesday
      if ((free[2][9] != busy[2][9])){
         System.out.println("A meeting can be scheduled Tuesday a 5:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][8] != busy[2][8])){
         System.out.println("A meeting can be scheduled Tuesday at 4:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][7] != busy[2][7])){
         System.out.println("A meeting can be scheduled Tuesday at 3:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][6] != busy[2][6])){
         System.out.println("A meeting can be scheduled Tuesday at 2:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][5] != busy[2][5])){
         System.out.println("A meeting can be scheduled Tuesday at 1:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][4] != busy[2][4])){
         System.out.println("A meeting can be scheduled Tuesday at 12:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][3] != busy[2][3])){
         System.out.println("A meeting can be scheduled Tuesday at 11:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][2] != busy[2][2])){
         System.out.println("A meeting can be scheduled Tuesday at 10:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][1] != busy[2][1])){
         System.out.println("A meeting can be scheduled Tuesday at 9:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[2][0] != busy[2][0])){
         System.out.println("A meeting can be scheduled Tuesday at 8:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      
      //Displays meeting times for Monday
      if ((free[1][9] != busy[1][9])){
         System.out.println("A meeting can be scheduled Monday a 5:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][8] != busy[1][8])){
         System.out.println("A meeting can be scheduled Monday at 4:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][7] != busy[1][7])){
         System.out.println("A meeting can be scheduled Monday at 3:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][6] != busy[1][6])){
         System.out.println("A meeting can be scheduled Monday at 2:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][5] != busy[1][5])){
         System.out.println("A meeting can be scheduled Monday at 1:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][4] != busy[1][4])){
         System.out.println("A meeting can be scheduled Monday at 12:00 PM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][3] != busy[1][3])){
         System.out.println("A meeting can be scheduled Monday at 11:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][2] != busy[1][2])){
         System.out.println("A meeting can be scheduled Monday at 10:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][1] != busy[1][1])){
         System.out.println("A meeting can be scheduled Monday at 9:00 AM");
         count++;
         if (count == 3){
            return;
         }
      }
      if ((free[1][0] != busy[1][0])){
         System.out.println("A meeting can be scheduled Monday at 8:00 AM");
         count++;
         if (count == 3){
            return;
         }
     
      }
       for(int i = count; i < 3; i++){
         System.out.println("A meeting time is N/A");
         }
   }  
} 

  
   
     
   
