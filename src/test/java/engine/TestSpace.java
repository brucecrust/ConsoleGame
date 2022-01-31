package engine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.Position;

public class TestSpace {

    @Test
    void test_modifySpace() {
        System.out.println("Verify that the sprite is updated in the space when the space is modified");

        Space space = new Space(2, 2);
        Sprite actualSprite = space.modify(new Position(1, 1), new Sprite('$')).space[1][1];

        Assertions.assertEquals('$', actualSprite.sprite);
    }

    @Test
    void test_withOuterWall() {
        System.out.println("Verify that the outer edges of a space are filled with the appropriate sprite");

        Space space = new Space(5, 5)
                .withOuterWall();

        for (int i = 0; i < space.space[0].length; i++) {
            Assertions.assertEquals('#', space.space[0][i].sprite);
        }

        for (int i = 0; i < space.space[space.outerColumnBounds].length; i++) {
            Assertions.assertEquals('#', space.space[space.outerColumnBounds][i].sprite);
        }

        for (int i = 0; i < space.space[space.outerColumnBounds].length; i++) {
            Assertions.assertEquals('#', space.space[space.outerColumnBounds][i].sprite);
        }

        for (Sprite[] spriteArray : space.space) {
            Assertions.assertEquals('#', spriteArray[0].sprite);
            Assertions.assertEquals('#', spriteArray[space.outerRowBounds].sprite);
        }
    }
}
