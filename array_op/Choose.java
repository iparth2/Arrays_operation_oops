package array_op;

import java.util.Scanner;
public class Choose extends Main{
        static Scanner in = new Scanner(System.in);

    public void chalja() {
        System.out.println("Choose the operation: ");
        int chossenNo = in.nextInt();
        switch (chossenNo) {
            case 1:
            InputRowsCols m2 = new InputRowsCols();
            m2.getRowsCols();

            
             Add1.add(m2, m1);
            break;
        
            default:
                break;
        }
        
        
    }
}
