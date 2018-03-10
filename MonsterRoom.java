// import statements
import java.util.StringTokenizer;
import java.util.Scanner;


public class MonsterRoom extends Room {
    
    
    //Constructor
    public MonsterRoom(String roomName, String objects, int roomNum, String listOfExits) {
        super(roomName,objects,roomNum,listOfExits);
        

    }
   
    
    
     //copying and overriding playRoom method from Room class
     //The method function is to return getNextRoom method
     //Also, the method is invoking player object
     public int playRoom(Player player) {
         return getNextRoom(player);
        
      }
      
    
      

    
  
    //copying and overriding userPicksUp method from the superclass Room
    //and modifying(adding new lines and details) it
    protected void userPicksUp(Player player) {
        
        System.out.println("What would you like to pick up?");
        Scanner keyboard = new Scanner(System.in);
        String itemToPickUp = keyboard.nextLine();
        String getRoomObjects = getRoomObjects();
       
        if (Utilities.isItemInContainer(itemToPickUp,getRoomObjects)&&!itemToPickUp.equals("12-headed monster")) {
            player.addToInventory(itemToPickUp);
            getRoomObjects=Utilities.removeFromList(itemToPickUp, getRoomObjects); 
        }   else if (itemToPickUp.equals("12-headed monster")) {
               System.out.println("You try to pick up the monster ... hgrrrghhh");
               System.out.println("But it sits on you and you are trapped.");
               System.out.println("What were you thinking!");
               System.out.println("Game Over!");
               player.setContinuePlay(false);
        }   else {
               System.out.println("That item is not in the room");
        }
        
    }
    
    //create a new getNextRoom method from superclass Room
    //since the one in the superclass is private  
    private int getNextRoom(Player player) {
  
        // inform the player of his/her current room
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