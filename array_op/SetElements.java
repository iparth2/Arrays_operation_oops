package array_op;
import java.util.Scanner;

public class SetElements{
    int rows;
    int col;

    public void  SetRowsCol(int rows , int col){
        this.rows = rows;
        this.col = col;
    }
    static Scanner in = new Scanner(System.in);
    public void SetElementsArr(){
        
        System.out.println("Enter the elements:--");
        System.out.println(rows+ "    "+ col);
        
        int finalArr[][]=new int[this.rows][this.col];
        

 for(int i=0;i<rows;i++){
            for (int j = 0; j < col; j++) {
                System.out.print("Entering the elements for [" +i+j+ "] : "  ) ;
                finalArr[i][j]=in.nextInt();
            }
        }

        GetResultantMatrix obj = new GetResultantMatrix();
        obj.GetResultMatrix(finalArr);
   
        
    }

    }
    
