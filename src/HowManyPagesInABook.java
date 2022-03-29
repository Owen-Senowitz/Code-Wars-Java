import java.util.ArrayList;

public class HowManyPagesInABook {

    public static int amountOfPages(int summary) {
        int nums = 0;
        int digits = 0;

        while (nums < summary) {
            digits++;
            nums += String.valueOf(digits).length();
        }
        return digits;
    }
}