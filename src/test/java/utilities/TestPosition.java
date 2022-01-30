package utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPosition {

    @Test
    void test_set() {
        Position position = new Position(0, 0);
        position.set(1, 2);

        Assertions.assertEquals(1, position.x);
        Assertions.assertEquals(2, position.y);
    }
}
