package array_op.Operations;
import java.util.Scanner;

public class Game {
    Scanner in = new Scanner(System.in); 
    int [][] gameArr  = {{1,2,3},{4,5,6},{7,8,9}};
    public int target = 7;

    public void playGame() {
        System.out.println("Gusses the number between 1 to 9: ");
        int userGusessNo = in.nextInt();

        if(userGusessNo == target) {
            System.out.println("You won");
        } else {
            System.out.println("Nah, Wrong number");
            System.out.println("wanna play again? Press 1 for yes and 0 for no");
            int playAgain = in.nextInt();
            if(playAgain == 1) {
                playGame();
            }else{
                System.out.println("Thanks for playing");
            }
        }
}
}