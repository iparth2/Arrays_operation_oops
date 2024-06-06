package array_op.Operations;
import java.util.Scanner;

import array_op.*;

public class OpNo {
        static Scanner in = new Scanner(System.in); 
        public int[][] fArr; 

    public void opNo(InputRowsCols m1,int no) {
        int[][] finalArr1 = m1.storedArr;
        fArr = new int[finalArr1.length][finalArr1[0].length];


        System.out.println("Enter the operation number: \n 1. Addition \n 2. Subtraction \n 3. Multiplication");
        System.out.print("Choose the operation: ");
        
        int chossenOpNo = in.nextInt();
        
        switch (chossenOpNo) {

            case 1:
            System.out.println("Adding the no: "+no+ " with the matrix: ");
            
            for (int i = 0; i < finalArr1.length; i++) {
             for (int j = 0; j < finalArr1[0].length; j++) {
                fArr[i][j] = finalArr1[i][j] + no;
            }
         }
         GetResultantMatrix obj = new GetResultantMatrix();
         obj.GetResultMatrix(fArr); 
         break;
            

         case 2:
         System.out.println("subtracting the no: "+no+ " with the matrix: ");
            for (int i = 0; i < finalArr1.length; i++) {
             for (int j = 0; j < finalArr1[0].length; j++) {
                fArr[i][j] = finalArr1[i][j] - no;
            }
         }
         GetResultantMatrix obj1 = new GetResultantMatrix();
         obj1.GetResultMatrix(fArr); 
         break;

         case 3:
         System.out.println("Multiplying the no: "+no+ " with the matrix: ");
            for (int i = 0; i < finalArr1.length; i++) {
             for (int j = 0; j < finalArr1[0].length; j++) {
                fArr[i][j] = finalArr1[i][j] * no;
            }
         }
         GetResultantMatrix obj2 = new GetResultantMatrix();
         obj2.GetResultMatrix(fArr); 
         break;

            default:
            System.out.println("");
            System.out.println("Your operation is not supported");
            System.out.println("<--- Please try again --->");
            System.out.println("If you want to continue, press 1");
            System.out.print("Enter your response: ");
            int cont = in.nextInt();
            if (cont == 1) {
                OpNo obj4 = new OpNo();
                obj4.opNo(m1, no);
            }else{
                System.out.println("Thank you");
                break;
            }
                break;
        }
    }

}
