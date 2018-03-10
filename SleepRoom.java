// import statements
import java.util.Scanner;

public class SleepRoom extends Room {
    
    //// Create a Scanner object to read from the keyboard.
    Scanner keyboard=new Scanner(System.in);
    //Create the CustomPlayer object
    CustomPlayer customplayer=new CustomPlayer("Filip", 0, "bubble gum;",22.0);
    
    //Constructor
    public SleepRoom(String roomName, String objects, int roomNum, String listOfExits) {
        super(roomName,objects,roomNum,listOfExits);
        

    }
    
    
    //copying and overriding playRoom method from Room class
    //The method function is to return getNextRoom method
    //Also, the method is invoking CustomPlayer object
    public int playRoom(CustomPlayer player) {
         return getNextRoom(player);
        
    }
      
    
      
    //create a new method sleepOnStraw, invoking Player object
    //the method only works specifically if the room name is "Sleep Room"
    //its function is to add vitality points everytime the user
    //enter "sleep" in Sleep Room 
    protected void sleepOnStraw(Player player) {
         int hours;
         if (getRoomName().equals("Sleep Room")) {
             System.out.println("How many hours do you want to sleep?");
             hours=keyboard.nextInt();
             System.out.println("Ah. Good Idea! Before you lay down ...");
             System.out.print("You have ");
             customplayer.printVitalityPoints();
             System.out.print(" points");
             System.out.println(" You awake after "+hours+ " hours, and then ...");
             System.out.print("You have ");
             customplayer.addToVitalityPoints(12.5,hours);
             System.out.println(" points");
         
         }  else {
               System.out.println("Sleep command only works in sleep room");
         }
      
     
     }
    
    
      
    //create a new getNextRoom method from superclass Room
    //since the one in the superclass is private
    //Also, adding a case "sleep" to the switch    
    private int getNextRoom(Player player) {
  
        // inform the player of his/her current room
        System.out.println("The room number is: "+ getRoomNum());
        System.out.println("You are in the " + getRoomName());
        System.out.println("What would you like to do?");

        // variables for player interaction
        String command;
        int newRoomNum = getRoomNum();
        Scanner keyboard = new Scanner(System.in);
        command = keyboard.nextLine();

        // switch on the user's command
        switch (command) {
            case "exits":
                printListOfExits();
                break;
            case "look":
                printObjectsInRoom();
                break;
            case "sleep":
                 sleepOnStraw(player);
                 break;
            case "inventory":
                player.printInventory();
                break;
            case "go west":
            case "go east":
            case "go south":
            case "go north":
                newRoomNum = leaveRoom(command);
                break;
            case "quit":
                player.setContinuePlay(false);
                break;
            case "pick up":
                userPicksUp(player);
                break;
            case "drop":
                userDrops(player);
                break;
            case "help":
                Utilities.printHelp();
                break;
            default:
                System.out.println("Invalid command. Type help for details.");
        }
        return newRoomNum;
    }       
   
    

}