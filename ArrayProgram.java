import java.util.*;


public class ArrayProgram {
   public static void main (String[] args) {
  
  Scanner keyboard=new Scanner(System.in);
  Random rand=new Random();
  int [] anArray =new int[3];
  anArray[0]=rand.nextInt(11);
  anArray[1]=rand.nextInt(11);
  anArray[2]=rand.nextInt(11);
  
  print3IntArray(anArray);
  sort3IntArray(anArray);
  reverse(anArray);
  
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






// create an array, anArray, of 3 ints
// create an instance of the Random class
// generate a random number between 0 and 10, and place it into the 0th index of anArray
// generate a random number between 0 and 10, and place it into the 1st index of anArray
// generate a random number between 0 and 10, and place it into the 2nd index of anArray
// invoke the print3IntArray method of the ArrayProcessor class and print the anArray entries
// invoke sort3IntArray method of the ArrayProcessor class, and print the sorted array
// invoke the reverse3IntArray method of the ArrayProcessor class, and print the reversed array