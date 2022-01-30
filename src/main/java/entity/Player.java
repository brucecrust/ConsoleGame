package entity;

import engine.Sprite;
import utilities.Position;

import java.util.Scanner;

public class Player extends Entity {

    // region | Member Variables ---------------------------------------------------------------------------------------

    String name;
    String lastCommand;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Player() {}

    public Player(String name, Sprite sprite, Position position, int health, int strength, int defense) {
        super(sprite, position, health, strength, defense);
        this.name = name;
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    public void move() {
        switch (lastCommand) {
            case "w" -> position.set(position.x, position.y - 1);
            case "s" -> position.set(position.x, position.y + 1);
            case "a" -> position.set(position.x - 1, position.y);
            case "d" -> position.set(position.x + 1, position.y);
            default -> position.set(position.x, position.y);
        }
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        lastCommand = scanner.nextLine();
    }

    // endregion
}
