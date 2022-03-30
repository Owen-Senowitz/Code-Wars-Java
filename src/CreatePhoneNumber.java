public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(numbers[0]);
        sb.append(numbers[1]);
        sb.append(numbers[2]);
        sb.append(") ");
        sb.append(numbers[3]);
        sb.append(numbers[4]);
        sb.append(numbers[5]);
        sb.append("-");
        sb.append(numbers[6]);
        sb.append(numbers[7]);
        sb.append(numbers[8]);
        sb.append(numbers[9]);
        return sb.toString();
    }
}
