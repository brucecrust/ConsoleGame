package utilities;

public class RenderingUtility {

    // region | Rendering Methods --------------------------------------------------------------------------------------

    public void render2DCharArray(char[][] array) {
        for (int column = 0; column < array.length; column++) {
            for (int row = 0; row < array[column].length; row++) {
                System.out.printf(" %c ", array[column][row]);
            }
            System.out.println();
        }
    }

    // endregion
}
