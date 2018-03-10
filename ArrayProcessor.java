import java.util.*;


public class ArrayProcessor {
   public static void main (String[] args) {
  
  Scanner keyboard=new Scanner(System.in);
  int [] numbers=new int[3];
  System.out.println("number 1:");
  numbers[0]=keyboard.nextInt();
  System.out.println("number 2:");
  numbers[1]=keyboard.nextInt();
  System.out.println("number 3:");
  numbers[2]=keyboard.nextInt();
  
  print3IntArray(numbers);
  sort3IntArray(numbers);
  reverse(numbers);
  
}
  
  
  
  public static void print3IntArray(int [] array) {
  
  Scanner keyboard=new Scanner(System.in);
  for (int i=0;i<array.length;i++) 
  {
   System.out.println("Original array number" +" "+ (i+1)+ ":");
   System.out.println(array [i]);
  }
 }
  
  
  
    
   public static int[] sort3IntArray(int [] array) { 
   final int length=array.length;
   Scanner keyboard=new Scanner(System.in);
   for (int i=0;i<length;i++) 
   {
      Arrays.sort(array);
      System.out.println("sort array"+" "+ (i+1)+ " "+ ":");
      System.out.println(array[i]);
   }
   return array;
 }
  
  
public static int[] reverse(int[] array){
Scanner keyboard=new Scanner(System.in);
int[] reversedArray = new int[array.length];
for(int i = 0 ; i<array.length; i++)
{
reversedArray[i] = array[array.length -1 -i];
System.out.println("reverse array "+ (i+1)+" "+":");
System.out.println(reversedArray[i]);

   }
   return reversedArray;
}
 
 
  
  
}
  
  
  
 
  
 
   