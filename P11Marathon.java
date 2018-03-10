import java.util.Scanner;  // Needed for the Scanner class

/*
  This program calculates the average speed of 
  the runner during the race in meters per second and kilometers per hour,
  given the times in hours, minutes and seconds for a person 
  to complete a Marathon race. Also, the distance travelled is given in
  Kilometers and meters.  

*/

public class P11Marathon
{
   public static void main(String[] args)
   {
      // Identifier declarations
      double timeInHours;
      double timeInMinutes;
      double timeInSeconds;
      double speedMPS;
      double speedKPH;
      double distanceInM;
      double distanceInKm;
      double convertToHours;
      double convertToSeconds;
                    
      

      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Display prompts and get input.(time in hours, seconds and minutes)
      System.out.print("Time in hours:    ");
      timeInHours = keyboard.nextDouble();
      System.out.print("Time in minutes:   ");
      timeInMinutes = keyboard.nextDouble();
      System.out.print("Time in seconds:  ");
      timeInSeconds = keyboard.nextDouble();
      
      //Type the distance in meters
      System.out.print("Distance in meters:  ");
      distanceInM = keyboard.nextDouble();
      //Calculate the distance in kilometers
      distanceInKm=distanceInM/1000;
      System.out.println("Distance in Kilometers:" + distanceInKm);
      
      
      // Perform the calculations.(average of speed)
      //Calculate the average of speed in kilometers per hour
      convertToHours= (timeInHours/1)+(timeInMinutes/60)+(timeInSeconds/3600);
      speedKPH= distanceInKm/convertToHours;
      speedKPH = Math.round(speedKPH * 100.0) / 100.0; //Converting the speedKPH into 2 decimals
      //Calculate the average of speed in meters per second
      convertToSeconds=(timeInHours*3600)+(timeInMinutes*60)+(timeInSeconds*1);
      speedMPS=distanceInM/convertToSeconds;  //Converting the speedMPS into 2 decimals
      speedMPS = Math.round(speedMPS * 100.0) / 100.0;
      //speedMPS=speedKPH*1000/3600;(alternative formula)
      //Note: We can also calculate the speed in meters per second using speedKPH*1000/3600
      

      
            
      
      // Display the results.
      System.out.println("Average of speed in kilometers per hour:"+ speedKPH);
      System.out.println("Average of speed in meters per second:"+ speedMPS);

      
            
      
            
       }
}
