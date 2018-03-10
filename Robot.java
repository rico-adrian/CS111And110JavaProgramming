import java.util.*;
import java.lang.StringBuilder;



public class Robot {

Scanner keyboard=new Scanner(System.in);
Random rand=new Random();
private static int numRobots=0;
private String serialID;
private RobotHead robotHead;
private RobotTorso robotTorso;
int number=rand.nextInt(100000);









public Robot() {
   serialID =("Johnny"+number);
   robotHead=new RobotHead();
   robotTorso=new RobotTorso();
   
}

public static int getRobotCount() {
   numRobots+=1;
   return numRobots;

}



public Robot copy() {
   Robot robotCopy=new Robot();
   robotCopy.setSerialID(serialID);
   return robotCopy;

}

public void setSerialID(String ID) {
   serialID=ID;

}

public Boolean equals(Robot aRobot) {
   if (serialID.equals(aRobot.serialID)) {
         return true;
   }  else {
         return false;
         
   }

}


public String getSerialID() {
   return serialID;
}


public String toString() {
   return "Serial ID: " + serialID + "," + robotHead.toString() +
      "," + robotTorso.toString();
      
}





}




















