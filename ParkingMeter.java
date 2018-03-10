public class ParkingMeter {
   
   //fields
   private int minutesPurchased;
   
   //create constructor
   public ParkingMeter(int numMinPurchased) {
      minutesPurchased=numMinPurchased;
   
   }
   
   //setter and getter methods
   public void setMinutesPurchased(int minutesPurchased) {
      this.minutesPurchased=minutesPurchased;
   
   }
   
   public int getMinutesPurchased() {
      return minutesPurchased;
   
   }
   
   //create a toString method to
   //return the details of minutes purchased
   public String toString() {
      String str="Minutes Purchased: "+minutesPurchased;
      return str;
   }
















}