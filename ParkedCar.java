public class ParkedCar {
   
   //fields
   private String make;
   private String model;
   private String color;
   private String licenseNumber;
   private int minutesParked;
   
   //create constructor
   public ParkedCar(String mk, String mdel, String col,String lic,int minParked) {
      make=mk;
      model=mdel;
      color=col;
      licenseNumber=lic;
      minutesParked=minParked;
   
   }
   
   //copy constructor
   public ParkedCar(ParkedCar car2) {
      make=car2.make;
      model=car2.model;
      color=car2.color;
      licenseNumber=car2.licenseNumber;
      minutesParked=car2.minutesParked;
      
   }
   
   //setter and getter method for each fields
   public void setMake(String make) {
      this.make=make;
   
   }
   
   
   public String getMake() {
      return make;
   
   }
   
   public void setModel(String model) {
      this.model=model;
   
   }
   
   public String getModel() {
      return model;
   
   }
   
   public void setColor(String color) {
      this.color=color;
   
   }
   
   public String getColor() {
      return color;
   
   }
   
   public void setLicenseNumber(String licenseNumber) {
      this.licenseNumber=licenseNumber;
   
   }
   
   public String getLicenseNumber() {
      return licenseNumber;
   
   }
   
   public void setMinutesParked(int minutesParked) {
      this.minutesParked=minutesParked;
   
   }
   
   public int getMinutesParked() {
      return minutesParked;
   
   }
   
   //create a toString method to
   //return the details of make, model
   //color, license number, and minutes parked
   public String toString() {
      String str= "Make: "+ make+
                  "\n"+"Model: "+ model+
                  "\n"+"Color: "+ color+
                  "\n"+"License Number: "+ licenseNumber+
                  "\n"+"Minutes Parked: "+ minutesParked;
      return str;
   }
   




   
   
      
}