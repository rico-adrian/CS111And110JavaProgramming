import java.util.*;



public class GetArea {
   public static void main(String[]args) {

//create scanner object to read input
Scanner keyboard=new Scanner(System.in);
//declaring the variable
double radius1;//radius of circle
double length;//length of rectangle
double width;//width of rectangle
double height;//height of rectangle
double radius2;//radius of cylinder
double a=0.0;//unused variable

//Display prompt and get user input 
System.out.println("enter the radius of circle:");
radius1=keyboard.nextDouble();
System.out.println("enter the length:");
length=keyboard.nextDouble();
System.out.println("enter the width:");
width=keyboard.nextDouble();
System.out.println("enter the height:");
height=keyboard.nextDouble();
System.out.println("enter the radius of cylinder:");
radius2=keyboard.nextDouble();

//Calculating the areas of circle and rectangle
//and calculating the volume of cylinder
System.out.println("The area of a circle with a radius of "+
                   radius1+ " is "+ Area.area(radius1));
System.out.println("The area of a rectangle with a length of "
                   +length+" and width of "+width+" is "+ Area.area(width,length));
System.out.println("The volume of a cylinder with radius of "
                   +radius2+" and height of "+height+" is "+ Area.area(radius2,height,a));

   
   
   }
}