// sample game demo file

public class GameV4 {

    public static void main(String args[]) {

        // designate how many rooms are in the game
        final int NUM_ROOMS = 6;

        // declare array of rooms using SleepRoom object
        SleepRoom[] gameBoard = new SleepRoom[NUM_ROOMS];
        
        // populate the room array, using the subclass SleepRoom
        gameBoard[0] = new SleepRoom("First Room", "1 apple;pumpkin", 0, "e1;w5;n1;s5");
        gameBoard[1] = new SleepRoom("Blue Room", "3 grapes;barking Germany Shephard", 1, "w0;e2;s0;n2");
        gameBoard[2] = new SleepRoom("Green Room", "meowing kitten;", 2, "w1;e3;s1;n3");
        gameBoard[3] = new SleepRoom("Red Room", "smelly steak;pizza",3, "e4;w2;n4;s2");
        gameBoard[4] = new SleepRoom("Sleep Room", "straw bed;TV",4, "w3;e5;s3;n5");
        gameBoard[5] = new SleepRoom("Telephone Room", "3 telephones;",5, "w4;e0;s4;n0");
        
   
         

        // keep track of which room player is in 
        int playerRoomNumber = 0;

        // create player object, using the subclass CustomPlayer
        CustomPlayer player = new CustomPlayer("Rico", playerRoomNumber, "bubble gum;band-aid;toothpick",0.0);

        // play the game, as long as player object has field continuePlay set to true
        while (player.getContinuePlay() == true) {
            playerRoomNumber =
                    gameBoard[playerRoomNumber].playRoom(player);
        }
    }
}