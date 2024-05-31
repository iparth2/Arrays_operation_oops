package array_op.Operations;
import array_op.*;

public class Multipication {
    public int[][] fArr; 

    public void multipication(InputRowsCols m1, InputRowsCols m2) {
        int[][] finalArr1 = m1.storedArr;
        int[][] finalArr2 = m2.storedArr;

        // Check if the dimensions of the matrices are the same
        if (finalArr1.length != finalArr2.length || finalArr1[0].length != finalArr2[0].length) {
            throw new IllegalArgumentException("Matrices dimensions do not match.");
        }

        // Initialize fArr with the same dimensions as the input matrices
        fArr = new int[finalArr1.length][finalArr1[0].length];

        for (int i = 0; i < finalArr1.length; i++) {
            for (int j = 0; j < finalArr1[0].length; j++) {
                fArr[i][j] = finalArr1[i][j] * finalArr2[i][j];
            }
        }

        GetResultantMatrix obj = new GetResultantMatrix();
        obj.GetResultMatrix(fArr); 
    }
    

}
