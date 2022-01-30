import engine.Space;
import engine.Sprite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSpace {

    @Test
    void testModifySpace() {
        Space space = new Space(2, 2);
        Sprite actualSprite = space.modify(1, 1, new Sprite('$')).space[1][1];

        Assertions.assertEquals('$', actualSprite.sprite);
    }
}
