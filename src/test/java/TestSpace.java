import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSpace {

    @Test
    void testModifySpace() {
        Space space = new Space(2, 2);

        Assertions.assertEquals('$', space.modify(1, 1, '$').space[1][1]);
    }
}
