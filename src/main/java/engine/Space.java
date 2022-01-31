package engine;

import entity.Player;
import utilities.Position;
import utilities.RenderingUtility;

import java.util.Arrays;

public class Space {

    // region | Member Variables ---------------------------------------------------------------------------------------

    public final int maxColumns, maxRows;
    public final int outerColumnBounds, outerRowBounds;

    private final Sprite defaultSprite = new Sprite(',');
    private final Sprite wallSprite = new Sprite('#');
    private Sprite previousSprite;

    private Player player;

    public final int maxEntityAmount;

    public Sprite[][] space;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Space(int columns, int rows, Player player) {
        maxColumns = columns;
        maxRows = rows;
        outerColumnBounds = maxColumns - 1;
        outerRowBounds = maxRows - 1;
        maxEntityAmount =  maxColumns * maxRows;
        space = new Sprite[maxColumns][maxRows];

        this.player = player;

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

    public void movePlayer() {
        Position previousPosition = new Position(player.position.x, player.position.y);
        player.userInput();

        if (!collidedWithWall()) {
            modify(previousPosition, previousSprite);
            modify(player.position, player.sprite);
        }
    }

    // endregion

    // region | Collision Handling -------------------------------------------------------------------------------------

    private boolean collidedWithWall() {
        if (willCollide(wallSprite)) {
            player.position = player.previousPosition;

            return true;
        }

        return false;
    }

    private boolean collidedWithSprite(Sprite sprite) {
        return willCollide(sprite);
    }

    private boolean willCollide(Sprite sprite) {
        return space[player.position.y][player.position.x] == sprite;
    }

    // endregion

    // region | Creation Methods ---------------------------------------------------------------------------------------

    public Space withOuterWall() {
        Arrays.fill(space[0], wallSprite);
        Arrays.fill(space[outerColumnBounds], wallSprite);

        for (Sprite[] spriteArray : space) {
            spriteArray[0] = wallSprite;
            spriteArray[outerRowBounds] = wallSprite;
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
