package array_op;
import array_op.Operations.*;
import java.util.Scanner;
public class Choose {
        static Scanner in = new Scanner(System.in); 
       public static InputRowsCols m1 = new InputRowsCols();
       public static InputRowsCols m2 = new InputRowsCols();
 

    public void chooseOperations() {
        System.out.println("Enter:- \n 1. for Addition" + " \n 2. for Subtraction" + " \n 3. for Multiplication" + " \n 4. for eterminant" + " \n 5. for inverse");
        System.out.print("Choose the operation: ");
        
        int chossenNo = in.nextInt();
       
        switch (chossenNo) {
            case 1:
            System.out.println("Enter Values for first Matrix -->");
            m1.getRowsCols();
            System.out.println("Enter Values for second Matrix -->");
            m2.getRowsCols();

            Add object = new Add();
            object.add(m1, m2);  
            break;

            case 2:
            System.out.println("Enter Values for first Matrix -->");
            m1.getRowsCols();
            System.out.println("Enter Values for second Matrix -->");
            m2.getRowsCols();
            
            Sub obj = new Sub();
            obj.sub(m2, m1);
            break;

            case 3:
            System.out.println("Enter Values for first Matrix -->");
            m1.getRowsCols();
            System.out.println("Enter Values for second Matrix -->");
            m2.getRowsCols();
            
            Multipication obj1 = new Multipication();
            obj1.multipication(m1, m2);
            break;
        
        
            default:
                break;
        }
        
        
    }
}
