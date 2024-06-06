package array_op;
import array_op.Operations.*;
import java.util.Scanner;
public class Choose {
        static Scanner in = new Scanner(System.in); 
       public static InputRowsCols m1 = new InputRowsCols();
       public static InputRowsCols m2 = new InputRowsCols();
 

    public void chooseOperations() {
        System.out.println("Enter:- \n 1. for Matrix Addition " + " \n 2. for Matrix Subtraction " + " \n 3. for Matrix Multiplication" + " \n 4. for Operations on a 'No'" + " \n 5. for Transpose Matrix");
        System.out.print("Choose the operation: ");
        
        int chossenNo = in.nextInt();
        System.out.println("");
       
        switch (chossenNo) {
            case 1:
            printRequiredMessage();
            Add object = new Add();
            object.add(m1, m2);  
            break;


            case 2:
            printRequiredMessage();
            Sub obj = new Sub();
            obj.sub(m2, m1);
            break;

            case 3:
            printRequiredMessage();
            Multipication obj1 = new Multipication();
            obj1.multipication(m1, m2);
            break;

            case 4:
            System.out.println("Enter Values for the Matrix -->");
            m1.getRowsCols();
            System.out.print("Enter the 'No' for the Operation: ");
            int opNo = in.nextInt();
            OpNo obj2 = new OpNo();
            obj2.opNo(m1,opNo);
            break;

            case 5:
            System.out.println("Enter Values for first Matrix -->");
            m1.getRowsCols();
            TransposeMatrix obj12 = new TransposeMatrix();
            obj12.inverse(m1);
            break;

            case 6:
            System.out.println("Enter Values for first Matrix -->");
            m1.getRowsCols();
            Diagonals obj121 = new Diagonals ();
            obj121.diagonals(m1);
            break;

            default:
                break;
        }
        
        
    }

    public void printRequiredMessage () {
        System.out.println("Enter Values for first Matrix -->");
            m1.getRowsCols();
            System.out.println("Enter Values for second Matrix -->");
            m2.getRowsCols();
    }

}
