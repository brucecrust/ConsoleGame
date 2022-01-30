package utilities;

import engine.Sprite;

public class RenderingUtility {

    // region | Rendering Methods --------------------------------------------------------------------------------------

    public static < E > void render2DArray(E[][] array) {
        for (int column = 0; column < array.length; column++) {
            for (int row = 0; row < array[column].length; row++) {
                System.out.printf(" %h ", array[column][row]);
            }
            System.out.println();
        }
    }

    // endregion
}
