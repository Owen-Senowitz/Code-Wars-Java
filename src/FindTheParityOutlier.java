public class FindTheParityOutlier {
    static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (evenCount == 1) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    return integers[i];
                }
            }
        } else {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    return integers[i];
                }
            }
        }
        return 0;
    }
}
