import java.util.*;



public class Play1000SlotMachines {
   public static void main (String[]args) {
   
//Declare variables and initialize method from SlotMachine class    
Scanner keyboard=new Scanner(System.in);
int index=3;
int winners=0;
int[] r1=new int[index];
int[] r2=new int[index];
int[] r3=new int[index];

SlotMachine slotMachine= new SlotMachine( r1, r2, r3);
//declare an array variable
SlotMachine [] anArray=new SlotMachine[1000];

//using for loop to play the slot machine 1000 times
for (int i=0;i<1000;i++)  {
   anArray[i]=new SlotMachine( r1, r2, r3);
   //Counter for the winner
   if (slotMachine.isWinner()) {
       winners+=1;
   }
   
}   

//printing the result(winners)
System.out.println("From 1000 slot machines,"+ " "+winners+" were winners");

   
   
   
   }
}
