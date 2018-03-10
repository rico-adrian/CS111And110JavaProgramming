import java.util.*;


public class RobotGarage {
   public static void main(String[]args) {

  Scanner keyboard=new Scanner(System.in);
  Robot robot=new Robot();
  int index=3;
  Robot [] anArray =new Robot[index];
  anArray[0]=new Robot();
  anArray[1]=new Robot();
  anArray[2]=anArray[1].copy();
   
  for (int i=0;i<anArray.length;i++) {
      System.out.println("Robot"+" "+(i+1)+":"+" "+ anArray[i].toString());
      System.out.println("Number of total robots:"+ " "+ robot.getRobotCount());
  } 
   
   
  if (anArray[0].equals(anArray[1])) {
         System.out.println("Robots 1 and 2 have the same ID");
  
  }   else if (anArray[1].equals(anArray[2])) {
         System.out.println("Robots 2 and 3 have the same ID");
  
  }   else if (anArray[0].equals(anArray[2])) {
         System.out.println("Robots 1 and 3 have the same ID");
  }
   
   
     
    
  
 




   }
}