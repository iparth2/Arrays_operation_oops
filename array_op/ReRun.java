package array_op;

import java.util.Scanner;
public class ReRun {
    static Scanner in = new Scanner(System.in);

    public void reRun() {
    
        System.out.println();
        System.out.println("If you want to Exit, Press '0' or to Continue press any other number");
        System.out.print("Enter your response: ");
        int chooseResult = in.nextInt();
        if (chooseResult == 0) {
            System.out.println("Thank you for using our application");
           
        }else{
            Main.main(null);      
        }
    }
}
