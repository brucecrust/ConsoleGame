import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMath {

    @Test
    void test_square2() {
        Math math = new Math();

        Assertions.assertEquals(4, math.square(2));
    }

    @Test
    void test_square4() {
        Math math = new Math();

        Assertions.assertEquals(16, math.square(4));
    }
}
