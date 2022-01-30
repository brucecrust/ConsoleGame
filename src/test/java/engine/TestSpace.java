package engine;

import engine.Space;
import engine.Sprite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.Position;

public class TestSpace {

    @Test
    void test_modifySpace() {
        Space space = new Space(2, 2);
        Sprite actualSprite = space.modify(new Position(1, 1), new Sprite('$')).space[1][1];

        Assertions.assertEquals('$', actualSprite.sprite);
    }
}
