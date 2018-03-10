public class ParkingTicket {
   
   //fields
   private ParkedCar car;
   private PoliceOfficer officer;
   private ParkingMeter meter;
   private double fine;
   private int minutes;
   public final double BASE_FINE=25.0;
   public final double HOURLY_FINE=10.0;
   
 

  
   
   //create constructor
   public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int meterMins) {
      car=aCar;
      officer=anOfficer;
      minutes=meterMins;
      
      
   }
   
   //copy constructor
   public ParkingTicket(ParkingTicket ticket) {
      car=ticket.car;
      officer=ticket.officer;
      minutes=ticket.minutes;
      
   }
   
      
   public void calculateFine(double fine) {
      this.fine=fine;
   }
   
   
     
 
   //calculate the fine for
   //different cases
   
   public int getMinutes() {
      return minutes;
   }
   
   public double getFine() {
   if (minutes <= 60 ) {
            fine=BASE_FINE;
      }  else if (minutes>=60) {
            fine=BASE_FINE+((minutes/60)*HOURLY_FINE); 
      }       
      return fine;
   }
   //create a toString method to
   //return the details of every data
   //by adding toString() method in
   //ParkedCar class and PoliceOfficer class
   //as well as the new entries in this class
   public String toString() {
      String str= car.toString()+            
                  "\n"+ officer.toString()+
                  "\n"+ "Minutes Illegally Parked: "+getMinutes() +
                  "\n"+ "Fine: "+ getFine();
                   
                  
      return str;                  
                        
                    
   }






}