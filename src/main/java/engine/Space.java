package engine;

import entity.Player;
import utilities.Position;
import utilities.RenderingUtility;

import java.util.Arrays;

public class Space {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private final int maxColumns, maxRows;

    private final Sprite defaultSprite = new Sprite(',');
    private final Sprite wallSprite = new Sprite('#');

    private Sprite previousSprite;

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
        previousSprite = new Sprite(space[position.x][position.y].sprite);
        space[position.y][position.x] = sprite;

        return this;
    }

    public void movePlayer(Player player) {
        Position previousPosition = new Position(player.position.x, player.position.y);
        player.userInput();
        modify(previousPosition, previousSprite);
        modify(player.position, player.sprite);
    }

    // endregion

    // region | Creation Methods ---------------------------------------------------------------------------------------

    public Space withOuterWall() {
        Arrays.fill(space[0], wallSprite);
        Arrays.fill(space[maxColumns - 1], wallSprite);

        for (Sprite[] spriteArray : space) {
            spriteArray[0] = wallSprite;
            spriteArray[maxRows - 1] = wallSprite;
        }

        return this;
    }

    // endregion

    // region | Rendering Methods --------------------------------------------------------------------------------------

    public void renderSpace() {
        RenderingUtility.render2DSpriteArray(space);
    }

    // endregion
}
