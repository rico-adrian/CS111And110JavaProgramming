import java.util.*;


public class RobotTorso {
  
  private int numArms;
  Random rand=new Random();
  
  
  
  
  
  public RobotTorso()
  {
      numArms=rand.nextInt(10);
  }
  
  public String toString()
  {
      String str="number of arms:"+numArms;
      return str;
  }


}
 