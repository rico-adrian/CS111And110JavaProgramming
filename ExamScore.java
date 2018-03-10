import java.util.Scanner;


public class ExamScore
{
   public static void main (String [] args)
   {
   
   Scanner keyboard = new Scanner(System.in);
   int choice;
   int SENTINEL = -1;    
   double score=0;
   int count = 1;
   int outstanding = 0;
   int satisfactory = 0;
   int unsatisfactory =0;        							
   double average;
   int passingCount=0;
   double totalScore=0;
   double passingRate;
   System.out.print("Enter press '1' to start a calculating program for grades. " +
                       "Otherwise, enter '-1 or other numbers' to quit the calculation : ");
      choice = keyboard.nextInt();
   
   
     				

   while (choice != SENTINEL)
   {
   System.out.println("Please enter a score number " + count + " : ");
   score=keyboard.nextDouble();
   
      count++;
      totalScore += score;
      
      
      	  if (score >= 90)
 { 
 System.out.println("It is an outstanding grade!");

 
	 passingCount++;
	outstanding++;	  
}
else if (score >=60){
System.out.println("It is a satisfactory grade!");

passingCount++;
satisfactory++;
}
else {
System.out.println("It is an unsatisfactory grade!");
unsatisfactory++;
}

totalScore += score;          
         System.out.print("Do you want to continue to proceed the program? " +
                          "If yes, press '1'. If no, press '-1' : ");
         choice = keyboard.nextInt(); 
    if (choice == 1)                 
   count++;
            
         else if (choice == -1)   
                     break;
                     
                     }


     if (count > 0)
   {
      average = totalScore / count;
      passingRate = (double)passingCount / (double)count;
      System.out.println("Choose 1 to calculate the average, passing rate and choose -1 to quit the program");
      
      choice = keyboard.nextInt();          
      if (choice == 1)           {
         System.out.printf("The average grade is %.2f.\n", average);
         System.out.printf("The passing rate is %.2f percents.\n", passingRate * 100);
         System.out.println("The total number of outstanding scores is " + outstanding);
         System.out.println("The total number of satisfactory scores is " + satisfactory);
         System.out.println("The total number of unsatisfactory scores is " + unsatisfactory);
      }
      
      else     
               System.out.println("Quit the program.");


    
   }
   
} 
}
     

