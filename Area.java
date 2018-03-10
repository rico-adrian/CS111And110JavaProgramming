import java.util.*;



public class Area {
   
//declaring variables
double radius1;
double length;
double width;
double height;
double radius2;
double a;

//Creating a constuctor
public Area(double r1, double w, double l,double h,double r2,double a) {
   radius1=r1;
   length=l;
   width=w;
   height=h;
   radius2=r2;
   this.a=a;
}


//create the first static method
//which is the area of circle
public static double area(double radius1) {
   return Math.PI*radius1*radius1;
   
}




//create the second static method
//which is the area of rectangle
public static double area(double width,double length) {
   return width*length;
   
}


//create the third static method
//which is the volume of cylinder
//note: add 'a' variable to the parameter
//in order to avoid similarity(same number of parameter) between
//the area of rectangle and volume of cylinder methods
//Therefore, variable 'a' is not used on this method
public static double area(double radius2,double height,double a) {
   return Math.PI*radius2*radius2*height;
 
}







}