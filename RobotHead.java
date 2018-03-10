import java.util.*;


public class RobotHead {
  
  private String eyeColor="";
  
  
  
  
public RobotHead()   {
   int number;
   Random rand=new Random();
   number=rand.nextInt(5);
   
   if (number==0) {
          eyeColor= "blue";
      } else if (number==1) {
          eyeColor= "green";
      } else if (number==2) {
          eyeColor= "evil red";
      } else if (number==3) {
          eyeColor= "creepy yellow";
      } else if (number==4) {
          eyeColor= "black";
      }

  }
  
  public String toString()
  {
      String str="eye color is:"+ eyeColor;
      return str;
  }


}