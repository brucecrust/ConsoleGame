package entity;

import engine.Sprite;
import utilities.Position;
import java.util.Arrays;
import java.util.Scanner;

public class Player extends Entity {

    // region | Member Variables ---------------------------------------------------------------------------------------

    public String lastCommand = "";

    private final String[] movementCommands = {"w", "s", "d", "a"};
    private final String[] utilityCommands = {"q"};

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Player() {}

    public Player(String name, Sprite sprite, Position position, int health, int strength, int defense) {
        super(name, sprite, position, health, strength, defense);
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    private void handleInput() {
        if (Arrays.asList(movementCommands).contains(lastCommand)) move();
    }

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        lastCommand = scanner.nextLine();
        handleInput();
    }

    // endregion

    // region | Action Methods -----------------------------------------------------------------------------------------

    public void combat() {

    }

    private void move() {
        switch (lastCommand) {
            case "w" -> {
                previousPosition = new Position(position.x, position.y);
                position.set(position.x, position.y - 1);
            }
            case "s" -> {
                previousPosition = new Position(position.x, position.y);
                position.set(position.x, position.y + 1);
            }
            case "a" -> {
                previousPosition = new Position(position.x, position.y);
                position.set(position.x - 1, position.y);
            }
            case "d" -> {
                previousPosition = new Position(position.x, position.y);
                position.set(position.x + 1, position.y);
            }
            default -> {
                position.set(position.x, position.y);
            }
        }
    }

    // endregion
}
