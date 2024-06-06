package array_op.Operations;
import array_op.*;

public class Multipication {
    public int[][] fArr; 

    public void multipication(InputRowsCols m1, InputRowsCols m2) {
        int[][] finalArr1 = m1.storedArr;
        int[][] finalArr2 = m2.storedArr;

        // Check if the dimensions of the matrices are the same
        if (m1.col != m2.rows) {
            throw new IllegalArgumentException("Matrices dimensions do not match for Multiplication.");
        }

        // Initialize fArr with the same dimensions as the input matrices
        fArr = new int[m1.rows][m2.col];
        int sum =0;

        for (int i = 0; i <m1.rows ; i++) {
            for (int j = 0; j < m2.col; j++) {

                for (int j2 = 0; j2 < m1.rows-1; j2++) {
                    sum+= finalArr1[i][j] * finalArr2[j][i];
                }
                fArr[i][j] = sum;
                sum =0;
            }
        }
        
        System.out.println("Resultant Matrix of (x,y)-->("+ m1.rows + "," + m2.col + ") is: ");   
        GetResultantMatrix obj = new GetResultantMatrix();
        obj.GetResultMatrix(fArr); 
    }
    

}
