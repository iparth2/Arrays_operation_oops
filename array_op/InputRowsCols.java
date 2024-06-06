package array_op;

import java.util.*;

 public class InputRowsCols extends SetElements {
    static Scanner in = new Scanner(System.in);
    public int rows , col;
    public int[][] arr;
    public int[][] storedArr;
    public void getRowsCols() {

        System.out.print("Enter the number of rows: ");
         rows = Integer.parseInt(in.next());
        System.out.print("Enter the number of cols: ");
         col = Integer.parseInt(in.next() );
    
        SetElements obj = new SetElements();
        obj.SetRowsCol(rows, col);
        obj.SetElementsArr();

        storedArr = obj.getArr();
    }
}
