import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOf3Or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }

}