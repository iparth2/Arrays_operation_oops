package array_op;

import java.util.*;

 class InputRowsCols {
    static Scanner in = new Scanner(System.in);
    public int rows;
    public void getRowsCols() {
        
        System.out.print("Enter the number of rows====>: ");
        int rows = Integer.parseInt(in.next());
        System.out.print("Enter the number of cols: ");
        int col = Integer.parseInt(in.next() );
        System.out.println("U Enter Rows: " + rows + " and Cols: " + col);
        SetElements obj = new SetElements();
        obj.SetRowsCol(rows, col);
        obj.SetElementsArr();
          
    }
}
