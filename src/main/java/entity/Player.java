package entity;

import java.util.Scanner;

public class Player extends Entity {

    // region | Member Variables ---------------------------------------------------------------------------------------

    String name;
    String lastCommand;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Player(String name) {
        this.name = name;
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    public void move() {
        userInput();

        if (lastCommand == null) return;

        switch (lastCommand) {
            case "w" -> position.set(0, -1);
            case "s" -> position.set(0, 1);
            case "a" -> position.set(-1, 0);
            case "d" -> position.set(1, 0);
            default -> position.set(0, 0);
        }
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        lastCommand = scanner.nextLine();
    }

    // endregion
}
