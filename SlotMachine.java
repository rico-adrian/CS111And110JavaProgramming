import java.util.*;



public class SlotMachine {

//create a random object   
Random rand=new Random();
//declare 3 arrays variable
int index=3;
private int[] row1=new int[index];
private int[] row2=new int[index];
private int[] row3=new int[index];



//creating non-default constructor
public SlotMachine(int[] row1,int[] row2,int[] row3) {
   this.row1=row1;
   this.row2=row2;
   this.row3=row3;
   playMachine();
}


//creating a playMachine() method that returns nothing(void)
public void playMachine() {
   //fill each of the 3 arrays with a random number from 0 to 9
   row1[0]=rand.nextInt(10);
   row1[1]=rand.nextInt(10);
   row1[2]=rand.nextInt(10);
   row2[0]=rand.nextInt(10);
   row2[1]=rand.nextInt(10);
   row2[2]=rand.nextInt(10);
   row3[0]=rand.nextInt(10);
   row3[1]=rand.nextInt(10);
   row3[2]=rand.nextInt(10);


}




//creating an isWinner() method that returns boolean
public boolean isWinner() {
   //comparing the context of each array and
   //returns true if they are the same
   if (row1[0]==row1[1]&&row1[1]==row1[2]&&row1[0]==row1[2]) {
      return true;
   }  else if (row2[0]==row2[1]&&row2[1]==row2[2]&&row2[0]==row2[2]) {
      return true;
   }  else if (row1[0]==row3[1]&&row3[1]==row3[2]&&row3[0]==row3[2]) {
      return true;
   }  else {
      return false;
   }
      

}
   





}