package engine;

import entity.Player;
import utilities.Position;
import utilities.RenderingUtility;

public class Space {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private final int maxColumns, maxRows;

    private Sprite defaultSprite = new Sprite(',');

    public final int maxEntityAmount;

    public Sprite[][] space;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Space(int columns, int rows) {
        maxColumns = columns;
        maxRows = rows;
        maxEntityAmount =  maxColumns * maxRows;
        space = new Sprite[maxColumns][maxRows];

        initializeSpace();
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    private void initializeSpace() {
        for (int column = 0; column < maxColumns; column++) {
            for (int row = 0; row < maxRows; row++) {
                space[column][row] = defaultSprite;
            }
        }
    }

    public Space modify(Position position, Sprite sprite) {
        space[position.y][position.x] = sprite;
        return this;
    }

    public void movePlayer(Player player) {
        Position previousPosition = new Position(player.position.x, player.position.y);
        player.userInput();
        modify(previousPosition, defaultSprite);
        modify(player.position, player.sprite);
    }

    // endregion

    // region | Rendering Methods --------------------------------------------------------------------------------------

    public void renderSpace() {
        RenderingUtility.render2DSpriteArray(space);
    }

    // endregion
}
