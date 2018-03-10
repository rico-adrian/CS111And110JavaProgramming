public class PoliceOfficer {
   
   //fields
   private String name;
   private String badgeNumber;
   
   //create constructor
   public PoliceOfficer(String officeName,String badgeNumber) {
      name=officeName;
      badgeNumber=this.badgeNumber;
   
   }
   
   //copy constructor
   public PoliceOfficer(PoliceOfficer officer) {
      name=officer.name;
      badgeNumber=officer.badgeNumber;
      
   }
   
   public ParkingTicket patrol(ParkedCar car, ParkingMeter meter, ParkingTicket ticket) {
      if (car.getMinutesParked() > meter.getMinutesPurchased() ) {
           return ticket;
      }  else {
           return null;
      }             
      
   
   }
   
   //setter and getter method for each fields
   public void setName(String name) {
      this.name=name;
   
   }
   
   
   public String getName() {
      return name;
   
   }
   
         
   public void setBadgeNumber(String badgeNumber) {
      this.badgeNumber=badgeNumber;
   
   }
   
   public String getBadgeNumber() {
      return badgeNumber;
   
   }
   
      
   //create a toString method to
   //return the details of police name
   //and badge number
   public String toString() {
      String str= "Officer Data"+ 
                  "\n"+ "Name: "+ name+
                  "\n"+ "BadgeNumber: "+ badgeNumber;
      return str;
   }






}