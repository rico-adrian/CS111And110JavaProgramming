// import statements
import java.lang.*;
import java.util.StringTokenizer;


public class CustomPlayer extends Player {
    
    //fields
    private double vitalityPoints=22.0;
  
    

    //constructor
    public CustomPlayer(String name, int room, String inventory,double vitalityPoints) {
        super("Filip", 0, "bubble gum;");
   
    }
    
    
    //method to add points to initial vitality points
    protected void addToVitalityPoints(double pointsToAdd,int hours) {  
         vitalityPoints=vitalityPoints+pointsToAdd*hours;
         System.out.println(vitalityPoints);
    }
    
    
    //method to print the vitality points
    protected void printVitalityPoints()  {
         System.out.println(vitalityPoints);
 
    }
    
    
    //modified method of getter function to get a listing of inventory
    public void printInventory() {
        
        StringTokenizer strT = new StringTokenizer(getInventory(), ";");
        System.out.println(getName() + "'s items: ");
        int numItems = 0;
        while (strT.hasMoreTokens()) {
            System.out.println("  " + strT.nextToken());
            numItems++;
        }
        
        System.out.println("  A total of " + numItems + " item(s)");
        System.out.println("Vitality: ");
        printVitalityPoints();
    }

    
    
}