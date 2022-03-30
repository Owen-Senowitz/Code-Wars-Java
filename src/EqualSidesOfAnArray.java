public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int j : arr) {
            rightSum += j;
        }
        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
