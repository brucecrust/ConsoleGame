import utilities.RenderingUtility;

public class Space {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private final int maxColumns, maxRows;

    public char[][] space;

    // endregion

    // region | Components ---------------------------------------------------------------------------------------------

    RenderingUtility render = new RenderingUtility();

    // region | Constructor --------------------------------------------------------------------------------------------

    public Space(int desiredColumns, int desiredRows) {
        maxColumns = desiredColumns;
        maxRows = desiredRows;
        space = new char[maxColumns][maxRows];

        initializeSpace();
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    private void initializeSpace() {
        for (int column = 0; column < maxColumns; column++) {
            for (int row = 0; row < maxRows; row++) {
                space[column][row] = ',';
            }
        }
    }

    public Space modify(int column, int row, char sprite) {
        space[column][row] = sprite;
        return this;
    }

    // endregion

    // region | Rendering Methods --------------------------------------------------------------------------------------

    public void renderSpace() {
        render.render2DCharArray(space);
    }

    // endregion
}
