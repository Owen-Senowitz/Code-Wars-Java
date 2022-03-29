import java.util.ArrayList;

public class FindOdd {
    public static int findIt(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum ^= A[i];
        }
        return sum;
    }
}