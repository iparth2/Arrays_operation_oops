package array_op.Operations;

import array_op.GetResultantMatrix;
import array_op.InputRowsCols;

public class Diagonals {
    

    public int[][] fArr;
    
    public void diagonals(InputRowsCols m1) {

        int[][] finalArr1 = m1.storedArr;
        fArr = new int[m1.rows][m1.col];


        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.col; j++) {
                if(i==j){
                fArr[i][j] = finalArr1[i][j] ;
            }else{
                break;
            }
            }
        }


        GetResultantMatrix obj = new GetResultantMatrix();
        obj.GetResultMatrix(fArr);
    }
}
