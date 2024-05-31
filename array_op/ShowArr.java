package array_op;
import java.util.Arrays;
public class ShowArr {
    public void getMatrix(int [][]finalArr){
            System.out.println("Your Matrix: "); 
            for (int i = 0; i < finalArr.length; i++) {
            System.out.println(Arrays.toString(finalArr[i]));
        }
        System.out.println("");
        }
}
