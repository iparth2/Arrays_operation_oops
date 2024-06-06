package array_op.Operations;
import array_op.*;

public class TransposeMatrix {
    public int[][] fArr;

    public void inverse(InputRowsCols m1) {

        int[][] finalArr1 = m1.storedArr;
        fArr = new int[m1.col][m1.rows];
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.col; j++) {
                fArr[i][j] = finalArr1[j][i] ;
            }
        }
        GetResultantMatrix obj = new GetResultantMatrix();
        obj.GetResultMatrix(fArr);
    }
}
