package array_op;
import java.util.Scanner;

 public class SetElements{
    static Scanner in = new Scanner(System.in);
    int rows;
    int col;
    public int arr[][];

    public void  SetRowsCol(int rows , int col){
        this.rows = rows;
        this.col = col;
    }
    

    public void SetElementsArr(){
        System.out.println(" ");
        System.out.println("<---Enter the elements:--->");
         arr = new int[this.rows][this.col];
         
        

        for(int i=0;i<rows;i++){
            for (int j = 0; j < col; j++) {
                System.out.print("Entering the elements for [" +i+j+ "] : "  ) ;
                arr[i][j]=in.nextInt();
            }
        }
        ShowArr obj = new ShowArr();
        obj.getMatrix(arr); 
           
    }

    public  int[][] getArr(){
        return arr;
    }
}
    
