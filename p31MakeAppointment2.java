import java.util.*;
import java.io.*;

public class p31MakeAppointment2
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      String filename1;
      String filename2;
      
      String readBusyPeople;
      String readFreePeople;
      
      final int SIZE = 3;
      String[] busyArray = new String[SIZE];
      String[] freeArray = new String[SIZE];
      int i = 0;
      int j = 0;
      
      String[][] timetable1 = new String[11][6];
      String[][] timetable2 = new String[11][6];
      String[][] resultTable = new String[11][6];
      int stopCount = 0;
      
      System.out.print("Enter a file 1 having busy people: ");
      filename1 = keyboard.nextLine();
      
      System.out.print("Enter a file 2 having free people: ");
      filename2 = keyboard.nextLine();
      
      File fileBusyPeople = new File(filename1);
      Scanner inputFileOne = new Scanner(fileBusyPeople);
      
      File fileFreePeople = new File(filename2);
      Scanner inputFileTwo = new Scanner(fileFreePeople);
      
      System.out.println("-----------Busy People Line-----------");
      while (inputFileOne.hasNext())
      {
         readBusyPeople = inputFileOne.nextLine();
         System.out.println(readBusyPeople);
         busyArray[i] = readBusyPeople;
         i++;   
      }
      
      for (int a = 0; a < i; a++)
      {
         if (busyArray[a].indexOf("/M") != -1)
         {
            timetable1[0][1] = "Monday";
            
            if (busyArray[a].indexOf("8") != -1)
               timetable1[1][1] = "8";
            else
               timetable1[1][1] = null;
                  
            if (busyArray[a].indexOf("9") != -1)
               timetable1[2][1] = "9";
            else
               timetable1[2][1] = null;
                  
            if (busyArray[a].indexOf("10") != -1)
               timetable1[3][1] = "10";
            else
               timetable1[3][1] = null;
                  
            if (busyArray[a].indexOf("11") != -1)
               timetable1[4][1] = "11";
            else
               timetable1[4][1] = null;
                  
            if (busyArray[a].indexOf("12") != -1)
               timetable1[5][1] = "12";
            else
               timetable1[5][1] = null;
                  
            if (busyArray[a].indexOf("1") != -1)
               timetable1[6][1] = "1";
            else
               timetable1[6][1] = null;
                  
            if (busyArray[a].indexOf("2") != -1)
               timetable1[7][1] = "2";
            else
               timetable1[7][1] = null;
                  
            if (busyArray[a].indexOf("3") != -1)
               timetable1[8][1] = "3";
            else
               timetable1[8][1] = null;
                  
            if (busyArray[a].indexOf("4") != -1)
               timetable1[9][1] = "4";
            else
               timetable1[9][1] = null;
                  
            if (busyArray[a].indexOf("5") != -1)
               timetable1[10][1] = "5";
            else
               timetable1[10][1] = null;
         } 
         else
            timetable1[0][1] = null;
          
            
         if (busyArray[a].indexOf("/T") != -1)
         {
            timetable1[0][2] = "Tuesday";
            
            if (busyArray[a].indexOf("8") != -1)
               timetable1[1][2] = "8";
            else
               timetable1[1][2] = null;
                  
            if (busyArray[a].indexOf("9") != -1)
               timetable1[2][2] = "9";
            else
               timetable1[2][2] = null;
                  
            if (busyArray[a].indexOf("10") != -1)
               timetable1[3][2] = "10";
            else
               timetable1[3][2] = null;
                  
            if (busyArray[a].indexOf("11") != -1)
               timetable1[4][2] = "11";
            else
               timetable1[4][2] = null;
                  
            if (busyArray[a].indexOf("12") != -1)
               timetable1[5][2] = "12";
            else
               timetable1[5][2] = null;
                  
            if (busyArray[a].indexOf("1") != -1)
               timetable1[6][2] = "1";
            else
               timetable1[6][2] = null;
                  
            if (busyArray[a].indexOf("2") != -1)
               timetable1[7][2] = "2";
            else
               timetable1[7][2] = null;
                  
            if (busyArray[a].indexOf("3") != -1)
               timetable1[8][2] = "3";
            else
               timetable1[8][2] = null;
                  
            if (busyArray[a].indexOf("4") != -1)
               timetable1[9][2] = "4";
            else
               timetable1[9][2] = null;
                  
            if (busyArray[a].indexOf("5") != -1)
               timetable1[10][2] = "5";
            else
               timetable1[10][2] = null;
         } 
         else
            timetable1[0][2] = null;
            
            
         if (busyArray[a].indexOf("/W") != -1)
         {
            timetable1[0][3] = "Wednesday";
            
            if (busyArray[a].indexOf("8") != -1)
               timetable1[1][3] = "8";
            else
               timetable1[1][3] = null;
                  
            if (busyArray[a].indexOf("9") != -1)
               timetable1[2][3] = "9";
            else
               timetable1[2][3] = null;
                  
            if (busyArray[a].indexOf("10") != -1)
               timetable1[3][3] = "10";
            else
               timetable1[3][3] = null;
                  
            if (busyArray[a].indexOf("11") != -1)
               timetable1[4][3] = "11";
            else
               timetable1[4][3] = null;
                  
            if (busyArray[a].indexOf("12") != -1)
               timetable1[5][3] = "12";
            else
               timetable1[5][3] = null;
                  
            if (busyArray[a].indexOf("1") != -1)
               timetable1[6][3] = "1";
            else
               timetable1[6][3] = null;
                  
            if (busyArray[a].indexOf("2") != -1)
               timetable1[7][3] = "2";
            else
               timetable1[7][3] = null;
                  
            if (busyArray[a].indexOf("3") != -1)
               timetable1[8][3] = "3";
            else
               timetable1[8][3] = null;
                  
            if (busyArray[a].indexOf("4") != -1)
               timetable1[9][3] = "4";
            else
               timetable1[9][3] = null;
                  
            if (busyArray[a].indexOf("5") != -1)
               timetable1[10][3] = "5";
            else
               timetable1[10][3] = null;
         } 
         else
            timetable1[0][3] = null;
            
            
         if (busyArray[a].indexOf("/R") != -1)
         {
            timetable1[0][4] = "Thursday";
            
            if (busyArray[a].indexOf("8") != -1)
               timetable1[1][4] = "8";
            else
               timetable1[1][4] = null;
                  
            if (busyArray[a].indexOf("9") != -1)
               timetable1[2][4] = "9";
            else
               timetable1[2][4] = null;
                  
            if (busyArray[a].indexOf("10") != -1)
               timetable1[3][4] = "10";
            else
               timetable1[3][4] = null;
                  
            if (busyArray[a].indexOf("11") != -1)
               timetable1[4][4] = "11";
            else
               timetable1[4][4] = null;
                  
            if (busyArray[a].indexOf("12") != -1)
               timetable1[5][4] = "12";
            else
               timetable1[5][4] = null;
                  
            if (busyArray[a].indexOf("1") != -1)
               timetable1[6][4] = "1";
            else
               timetable1[6][4] = null;
                  
            if (busyArray[a].indexOf("2") != -1)
               timetable1[7][4] = "2";
            else
               timetable1[7][4] = null;
                  
            if (busyArray[a].indexOf("3") != -1)
               timetable1[8][4] = "3";
            else
               timetable1[8][4] = null;
                  
            if (busyArray[a].indexOf("4") != -1)
               timetable1[9][4] = "4";
            else
               timetable1[9][4] = null;
                  
            if (busyArray[a].indexOf("5") != -1)
               timetable1[10][4] = "5";
            else
               timetable1[10][4] = null;
         } 
         else
            timetable1[0][4] = null;
            
            
         if (busyArray[a].indexOf("/F") != -1)
         {
            timetable1[0][5] = "Friday";
            
            if (busyArray[a].indexOf("8") != -1)
               timetable1[1][5] = "8";
            else
               timetable1[1][5] = null;
                  
            if (busyArray[a].indexOf("9") != -1)
               timetable1[2][5] = "9";
            else
               timetable1[2][5] = null;
                  
            if (busyArray[a].indexOf("10") != -1)
               timetable1[3][5] = "10";
            else
               timetable1[3][5] = null;
                  
            if (busyArray[a].indexOf("11") != -1)
               timetable1[4][5] = "11";
            else
               timetable1[4][5] = null;
                  
            if (busyArray[a].indexOf("12") != -1)
               timetable1[5][5] = "12";
            else
               timetable1[5][5] = null;
                  
            if (busyArray[a].indexOf("1") != -1)
               timetable1[6][5] = "1";
            else
               timetable1[6][5] = null;
                  
            if (busyArray[a].indexOf("2") != -1)
               timetable1[7][5] = "2";
            else
               timetable1[7][5] = null;
                  
            if (busyArray[a].indexOf("3") != -1)
               timetable1[8][5] = "3";
            else
               timetable1[8][5] = null;
                  
            if (busyArray[a].indexOf("4") != -1)
               timetable1[9][5] = "4";
            else
               timetable1[9][5] = null;
                  
            if (busyArray[a].indexOf("5") != -1)
               timetable1[10][5] = "5";
            else
               timetable1[10][5] = null;
         } 
         else
            timetable1[0][5] = null;   
      }
      
      System.out.println();
      System.out.println("-----------Free People Line-----------");
      while (inputFileTwo.hasNext())
      {
         readFreePeople = inputFileTwo.nextLine();
         System.out.println(readFreePeople);
         freeArray[j] = readFreePeople;
         j++;
      }
      
      for (int b = 0; b < j; b++)
      {
         if (freeArray[b].indexOf("/M") != -1)
         {
            timetable2[0][1] = "Monday";
            
            if (freeArray[b].indexOf("8") != -1)
               timetable2[1][1] = "8";
            else
               timetable2[1][1] = null;
                  
            if (freeArray[b].indexOf("9") != -1)
               timetable2[2][1] = "9";
            else
               timetable2[2][1] = null;
                  
            if (freeArray[b].indexOf("10") != -1)
               timetable2[3][1] = "10";
            else
               timetable2[3][1] = null;
                  
            if (freeArray[b].indexOf("11") != -1)
               timetable2[4][1] = "11";
            else
               timetable2[4][1] = null;
                  
            if (freeArray[b].indexOf("12") != -1)
               timetable2[5][1] = "12";
            else
               timetable2[5][1] = null;
                  
            if (freeArray[b].indexOf("1") != -1)
               timetable2[6][1] = "1";
            else
               timetable2[6][1] = null;
                  
            if (freeArray[b].indexOf("2") != -1)
               timetable2[7][1] = "2";
            else
               timetable2[7][1] = null;
                  
            if (freeArray[b].indexOf("3") != -1)
               timetable2[8][1] = "3";
            else
               timetable2[8][1] = null;
                  
            if (freeArray[b].indexOf("4") != -1)
               timetable2[9][1] = "4";
            else
               timetable2[9][1] = null;
                  
            if (freeArray[b].indexOf("5") != -1)
               timetable2[10][1] = "5";
            else
               timetable2[10][1] = null;
         } 
         else
            timetable2[0][1] = null;
          
          
         if (freeArray[b].indexOf("/T") != -1)
         {
            timetable2[0][2] = "Tuesday";
            
            if (freeArray[b].indexOf("8") != -1)
               timetable2[1][2] = "8";
            else
               timetable2[1][2] = null;
                  
            if (freeArray[b].indexOf("9") != -1)
               timetable2[2][2] = "9";
            else
               timetable2[2][2] = null;
                  
            if (freeArray[b].indexOf("10") != -1)
               timetable2[3][2] = "10";
            else
               timetable2[3][2] = null;
                  
            if (freeArray[b].indexOf("11") != -1)
               timetable2[4][2] = "11";
            else
               timetable2[4][2] = null;
                  
            if (freeArray[b].indexOf("12") != -1)
               timetable2[5][2] = "12";
            else
               timetable2[5][2] = null;
                  
            if (freeArray[b].indexOf("1") != -1)
               timetable2[6][2] = "1";
            else
               timetable2[6][2] = null;
                  
            if (freeArray[b].indexOf("2") != -1)
               timetable2[7][2] = "2";
            else
               timetable2[7][2] = null;
                  
            if (freeArray[b].indexOf("3") != -1)
               timetable2[8][2] = "3";
            else
               timetable2[8][2] = null;
                  
            if (freeArray[b].indexOf("4") != -1)
               timetable2[9][2] = "4";
            else
               timetable2[9][2] = null;
                  
            if (freeArray[b].indexOf("5") != -1)
               timetable2[10][2] = "5";
            else
               timetable2[10][2] = null;
         } 
         else
            timetable2[0][2] = null;
         
         
         if (freeArray[b].indexOf("/W") != -1)
         {
            timetable2[0][3] = "Wednesday";
            
            if (freeArray[b].indexOf("8") != -1)
               timetable2[1][3] = "8";
            else
               timetable2[1][3] = null;
                  
            if (freeArray[b].indexOf("9") != -1)
               timetable2[2][3] = "9";
            else
               timetable2[2][3] = null;
                  
            if (freeArray[b].indexOf("10") != -1)
               timetable2[3][3] = "10";
            else
               timetable2[3][3] = null;
                  
            if (freeArray[b].indexOf("11") != -1)
               timetable2[4][3] = "11";
            else
               timetable2[4][3] = null;
                  
            if (freeArray[b].indexOf("12") != -1)
               timetable2[5][3] = "12";
            else
               timetable2[5][3] = null;
                  
            if (freeArray[b].indexOf("1") != -1)
               timetable2[6][3] = "1";
            else
               timetable2[6][3] = null;
                  
            if (freeArray[b].indexOf("2") != -1)
               timetable2[7][3] = "2";
            else
               timetable2[7][3] = null;
                  
            if (freeArray[b].indexOf("3") != -1)
               timetable2[8][3] = "3";
            else
               timetable2[8][3] = null;
                  
            if (freeArray[b].indexOf("4") != -1)
               timetable2[9][3] = "4";
            else
               timetable2[9][3] = null;
                  
            if (freeArray[b].indexOf("5") != -1)
               timetable2[10][3] = "5";
            else
               timetable2[10][3] = null;
         } 
         else
            timetable2[0][3] = null;
            
            
         if (freeArray[b].indexOf("/R") != -1)
         {
            timetable2[0][4] = "Thursday";
            
            if (freeArray[b].indexOf("8") != -1)
               timetable2[1][4] = "8";
            else
               timetable2[1][4] = null;
                  
            if (freeArray[b].indexOf("9") != -1)
               timetable2[2][4] = "9";
            else
               timetable2[2][4] = null;
                  
            if (freeArray[b].indexOf("10") != -1)
               timetable2[3][4] = "10";
            else
               timetable2[3][4] = null;
                  
            if (freeArray[b].indexOf("11") != -1)
               timetable2[4][4] = "11";
            else
               timetable2[4][4] = null;
                  
            if (freeArray[b].indexOf("12") != -1)
               timetable2[5][4] = "12";
            else
               timetable2[5][4] = null;
                  
            if (freeArray[b].indexOf("1") != -1)
               timetable2[6][4] = "1";
            else
               timetable2[6][4] = null;
                  
            if (freeArray[b].indexOf("2") != -1)
               timetable2[7][4] = "2";
            else
               timetable2[7][4] = null;
                  
            if (freeArray[b].indexOf("3") != -1)
               timetable2[8][4] = "3";
            else
               timetable2[8][4] = null;
                  
            if (freeArray[b].indexOf("4") != -1)
               timetable2[9][4] = "4";
            else
               timetable2[9][4] = null;
                  
            if (freeArray[b].indexOf("5") != -1)
               timetable2[10][4] = "5";
            else
               timetable2[10][4] = null;
         } 
         else
            timetable2[0][4] = null;
            
            
         if (freeArray[b].indexOf("/F") != -1)
         {
            timetable2[0][5] = "Friday";
            
            if (freeArray[b].indexOf("8") != -1)
               timetable2[1][5] = "8";
            else
               timetable2[1][5] = null;
                  
            if (freeArray[b].indexOf("9") != -1)
               timetable2[2][5] = "9";
            else
               timetable2[2][5] = null;
                  
            if (freeArray[b].indexOf("10") != -1)
               timetable2[3][5] = "10";
            else
               timetable2[3][5] = null;
                  
            if (freeArray[b].indexOf("11") != -1)
               timetable2[4][5] = "11";
            else
               timetable2[4][5] = null;
                  
            if (freeArray[b].indexOf("12") != -1)
               timetable2[5][5] = "12";
            else
               timetable2[5][5] = null;
                  
            if (freeArray[b].indexOf("1") != -1)
               timetable2[6][5] = "1";
            else
               timetable2[6][5] = null;
                  
            if (freeArray[b].indexOf("2") != -1)
               timetable2[7][5] = "2";
            else
               timetable2[7][5] = null;
                  
            if (freeArray[b].indexOf("3") != -1)
               timetable2[8][5] = "3";
            else
               timetable2[8][5] = null;
                  
            if (freeArray[b].indexOf("4") != -1)
               timetable2[9][5] = "4";
            else
               timetable2[9][5] = null;
                  
            if (freeArray[b].indexOf("5") != -1)
               timetable2[10][5] = "5";
            else
               timetable2[10][5] = null;
         } 
         else
            timetable2[0][5] = null;
      }
      
      inputFileOne.close();
      inputFileTwo.close();
      
      
      for (int a = 0; a < 6; a++)
      {
         if (a == 1)
         {
            resultTable[0][a] = "Monday";
         }
         
         if (a == 2)
         {
            resultTable[0][a] = "Tuesday";
         }
         
         if (a == 3)
         {
            resultTable[0][a] = "Wednesday";
         }
         
         if (a == 4)
         {
            resultTable[0][a] = "Thursday";
         }
         
         if (a == 5)
         {
            resultTable[0][a] = "Friday";
         }   
      
         for (int b = 0; b < 11; b++)
         {
            if (b == 0)
            {
               resultTable[1][0] = "8";
               resultTable[2][0] = "9";
               resultTable[3][0] = "10";
               resultTable[4][0] = "11";
               resultTable[5][0] = "12";
               resultTable[6][0] = "1";
               resultTable[7][0] = "2";
               resultTable[8][0] = "3";
               resultTable[9][0] = "4";
               resultTable[10][0] = "5";
            }
            
            else if (b >= 1 && a >= 1)
            {
               if (timetable1[b][a] == timetable2[b][a])
                  resultTable[b][a] = "I";
               
               else
                  resultTable[b][a] = "P";
            }
         }
      }
      
      System.out.println();
      
      for (int c = 5; c >= 0; c--)
      {
         for (int d = 0; d < 11; d++)
         {
            if (resultTable[d][c] == "P" && stopCount < 3)
            {
               System.out.println(resultTable[0][c] + " " + resultTable[d][0] + ":00");
               stopCount++;
            }
         }
      }      
      
      System.out.println();
                                    
      System.out.print(timetable1[0][1]);
      System.out.print(timetable1[1][1]);
      System.out.print(timetable1[2][1]);
      System.out.print(timetable1[3][1]);
      System.out.print(timetable1[4][1]);
      System.out.print(timetable1[5][1]);
      System.out.print(timetable1[6][1]);
      System.out.print(timetable1[7][1]);
      System.out.print(timetable1[8][1]);
      System.out.print(timetable1[9][1]);
      System.out.println(timetable1[10][1]);
      System.out.print(timetable1[0][2]);
      System.out.print(timetable1[1][2]);
      System.out.print(timetable1[2][2]);
      System.out.print(timetable1[3][2]);
      System.out.print(timetable1[4][2]);
      System.out.print(timetable1[5][2]);
      System.out.print(timetable1[6][2]);
      System.out.print(timetable1[7][2]);
      System.out.print(timetable1[8][2]);
      System.out.print(timetable1[9][2]);
      System.out.println(timetable1[10][2]);
      System.out.print(timetable1[0][3]);
      System.out.print(timetable1[1][3]);
      System.out.print(timetable1[2][3]);
      System.out.print(timetable1[3][3]);
      System.out.print(timetable1[4][3]);
      System.out.print(timetable1[5][3]);
      System.out.print(timetable1[6][3]);
      System.out.print(timetable1[7][3]);
      System.out.print(timetable1[8][3]);
      System.out.print(timetable1[9][3]);
      System.out.println(timetable1[10][3]);
      System.out.print(timetable1[0][4]);
      System.out.print(timetable1[1][4]);
      System.out.print(timetable1[2][4]);
      System.out.print(timetable1[3][4]);
      System.out.print(timetable1[4][4]);
      System.out.print(timetable1[5][4]);
      System.out.print(timetable1[6][4]);
      System.out.print(timetable1[7][4]);
      System.out.print(timetable1[8][4]);
      System.out.print(timetable1[9][4]);
      System.out.println(timetable1[10][4]);
      System.out.print(timetable1[0][5]);
      System.out.print(timetable1[1][5]);
      System.out.print(timetable1[2][5]);
      System.out.print(timetable1[3][5]);
      System.out.print(timetable1[4][5]);
      System.out.print(timetable1[5][5]);
      System.out.print(timetable1[6][5]);
      System.out.print(timetable1[7][5]);
      System.out.print(timetable1[8][5]);
      System.out.print(timetable1[9][5]);
      System.out.println(timetable1[10][5]);
      
      System.out.println();
      
      System.out.print(timetable2[0][1]);
      System.out.print(timetable2[1][1]);
      System.out.print(timetable2[2][1]);
      System.out.print(timetable2[3][1]);
      System.out.print(timetable2[4][1]);
      System.out.print(timetable2[5][1]);
      System.out.print(timetable2[6][1]);
      System.out.print(timetable2[7][1]);
      System.out.print(timetable2[8][1]);
      System.out.print(timetable2[9][1]);
      System.out.println(timetable2[10][1]);
      System.out.print(timetable2[0][2]);
      System.out.print(timetable2[1][2]);
      System.out.print(timetable2[2][2]);
      System.out.print(timetable2[3][2]);
      System.out.print(timetable2[4][2]);
      System.out.print(timetable2[5][2]);
      System.out.print(timetable2[6][2]);
      System.out.print(timetable2[7][2]);
      System.out.print(timetable2[8][2]);
      System.out.print(timetable2[9][2]);
      System.out.println(timetable2[10][2]);
      System.out.print(timetable2[0][3]);
      System.out.print(timetable2[1][3]);
      System.out.print(timetable2[2][3]);
      System.out.print(timetable2[3][3]);
      System.out.print(timetable2[4][3]);
      System.out.print(timetable2[5][3]);
      System.out.print(timetable2[6][3]);
      System.out.print(timetable2[7][3]);
      System.out.print(timetable2[8][3]);
      System.out.print(timetable2[9][3]);
      System.out.println(timetable2[10][3]);
      System.out.print(timetable2[0][4]);
      System.out.print(timetable2[1][4]);
      System.out.print(timetable2[2][4]);
      System.out.print(timetable2[3][4]);
      System.out.print(timetable2[4][4]);
      System.out.print(timetable2[5][4]);
      System.out.print(timetable2[6][4]);
      System.out.print(timetable2[7][4]);
      System.out.print(timetable2[8][4]);
      System.out.print(timetable2[9][4]);
      System.out.println(timetable2[10][4]);
      System.out.print(timetable2[0][5]);
      System.out.print(timetable2[1][5]);
      System.out.print(timetable2[2][5]);
      System.out.print(timetable2[3][5]);
      System.out.print(timetable2[4][5]);
      System.out.print(timetable2[5][5]);
      System.out.print(timetable2[6][5]);
      System.out.print(timetable2[7][5]);
      System.out.print(timetable2[8][5]);
      System.out.print(timetable2[9][5]);
      System.out.println(timetable2[10][5]);
            
      System.out.println();
      
      System.out.print(resultTable[0][1]);
      System.out.print(resultTable[1][1]);
      System.out.print(resultTable[2][1]);
      System.out.print(resultTable[3][1]);
      System.out.print(resultTable[4][1]);
      System.out.print(resultTable[5][1]);
      System.out.print(resultTable[6][1]);
      System.out.print(resultTable[7][1]);
      System.out.print(resultTable[8][1]);
      System.out.print(resultTable[9][1]);
      System.out.println(resultTable[10][1]);
      System.out.print(resultTable[0][2]);
      System.out.print(resultTable[1][2]);
      System.out.print(resultTable[2][2]);
      System.out.print(resultTable[3][2]);
      System.out.print(resultTable[4][2]);
      System.out.print(resultTable[5][2]);
      System.out.print(resultTable[6][2]);
      System.out.print(resultTable[7][2]);
      System.out.print(resultTable[8][2]);
      System.out.print(resultTable[9][2]);
      System.out.println(resultTable[10][2]);
      System.out.print(resultTable[0][3]);
      System.out.print(resultTable[1][3]);
      System.out.print(resultTable[2][3]);
      System.out.print(resultTable[3][3]);
      System.out.print(resultTable[4][3]);
      System.out.print(resultTable[5][3]);
      System.out.print(resultTable[6][3]);
      System.out.print(resultTable[7][3]);
      System.out.print(resultTable[8][3]);
      System.out.print(resultTable[9][3]);
      System.out.println(resultTable[10][3]);
      System.out.print(resultTable[0][4]);
      System.out.print(resultTable[1][4]);
      System.out.print(resultTable[2][4]);
      System.out.print(resultTable[3][4]);
      System.out.print(resultTable[4][4]);
      System.out.print(resultTable[5][4]);
      System.out.print(resultTable[6][4]);
      System.out.print(resultTable[7][4]);
      System.out.print(resultTable[8][4]);
      System.out.print(resultTable[9][4]);
      System.out.println(resultTable[10][4]);
      System.out.print(resultTable[0][5]);
      System.out.print(resultTable[1][5]);
      System.out.print(resultTable[2][5]);
      System.out.print(resultTable[3][5]);
      System.out.print(resultTable[4][5]);
      System.out.print(resultTable[5][5]);
      System.out.print(resultTable[6][5]);
      System.out.print(resultTable[7][5]);
      System.out.print(resultTable[8][5]);
      System.out.print(resultTable[9][5]);
      System.out.println(resultTable[10][5]);
      
      System.out.println();
      
      /*for (int m = 0; m < SIZE; m++)
      {
         System.out.println(busyArray[m]);
      }
      
      for (int n = 0; n < SIZE; n++)
      {
         System.out.println(freeArray[n]);
      }*/
   }
}