package utilities;

import engine.Sprite;

public class RenderingUtility {

    // region | Rendering Methods --------------------------------------------------------------------------------------

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static < E > void render2DArray(E[][] array) {
        for (E[] i : array) {
            for (E j : i) {
                System.out.printf(" %h ", j);
            }
            System.out.println();
        }
    }

    public static void render2DSpriteArray(Sprite[][] array) {
        for (Sprite[] spriteArray : array) {
            for (Sprite sprite : spriteArray) {
                System.out.printf(" %c ", sprite.sprite);
            }
            System.out.println();
        }
    }

    // endregion
}
