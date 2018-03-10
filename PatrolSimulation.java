//import statements
import java.util.*;

public class PatrolSimulation {
   public static void main (String[] args) {
   
   //declare field of index
   //used for the arrays
   int index=2;
  
   
   
   
   

   // Create an array of 2 Car objects, with various minutesParked values
   ParkedCar[] car=new ParkedCar[index];
   car[0]=new ParkedCar("Volkswagen","1972", "Red","167RHZM",181);
   car[1]=new ParkedCar("Volkswagen","1972", "Red","167RHZM",121);
   
   // Create an array of 2 ParkingMeter objects, with minutes so that
   // the first Car object is in violation, while the second is not
   ParkingMeter[] parkingMeter=new ParkingMeter[index];
   parkingMeter[0]=new ParkingMeter(60);
   parkingMeter[1]=new ParkingMeter(122);
   
   // Create a PoliceOfficer object. Give the officer a name and badge
   // number
   PoliceOfficer policeOfficer=new PoliceOfficer("Joe Friday", "4788");
   
   // Create an array of 2 ParkingTicket objects
   ParkingTicket[] parkingTicket=new ParkingTicket[index];
   ParkingTicket parkingTicket1=new ParkingTicket(car[0],policeOfficer,0);
   parkingTicket[0]=new ParkingTicket(car[0],policeOfficer,121);
   parkingTicket[1]=new ParkingTicket(car[1],policeOfficer,0);
   

   // Have the officer patrol each of the Car and ParkingMeter object
   // combinations (index i for the array of Car objects should be
   // matched with index i for the array of ParkingMeter objects, which
   // should be matched with index i of the array of ParkingTicket
   // objects)
   // After the PoliceOfficer has patrolled the cars and parking
   // meters, walk over the array of ParkingTickets and invoke the
   // toString method if a ticket has been issued, otherwise indicate
   // that a ticket has not been issued
   
   policeOfficer.patrol(car[0],parkingMeter[0],parkingTicket[0]);
   policeOfficer.patrol(car[1],parkingMeter[1],parkingTicket[1]);   
   
   
   System.out.println("Car/Parking Meter 1: ");

   if (car[0].getMinutesParked() > parkingMeter[0].getMinutesPurchased()) {
       System.out.println(parkingTicket[0].toString());
     
   } else {
       System.out.println("No violation");}
      
      
      
      System.out.println("Car/Parking Meter 2: ");


   
   if (car[1].getMinutesParked() > parkingMeter[1].getMinutesPurchased()) {
       System.out.println(parkingTicket[1].toString());
   }  else {
       System.out.println("No violation");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   }
   
}