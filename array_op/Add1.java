package array_op;
public class Add1 {

    public static  int finalArr[][];
    public static int[][] add( InputRowsCols m2, InputRowsCols m1) {

        
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j <  m2.length; j++) {
                finalArr[i][j] =  m2[i][j] +  m1[i][j];
            }
        } 




        GetResultantMatrix obj = new GetResultantMatrix();
        obj.GetResultMatrix(finalArr);
        return m1;
    }
  