public class Space {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private final int maxColumns, maxRows;

    public char[][] space;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Space(int desiredColumns, int desiredRows) {
        maxColumns = desiredColumns;
        maxRows = desiredRows;

        space = initializeSpace();
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    private char[][] initializeSpace() {
        for (int column = 0; column < maxColumns; column++) {
            for (int row = 0; row < maxRows; row++) {
                space[column][row] = ',';
            }
        }
    }
}
