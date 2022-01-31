package engine;

import entity.Entity;
import entity.Player;
import utilities.Position;
import utilities.RenderingUtility;

public class Engine {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private final Space space;
    private final Player player;
    private Entity[] entities;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Engine() {

        this.player = new Player(
                "Test", new Sprite('P'), new Position(5, 4), 50, 10, 10);

        Entity blueFrog = new Entity(
                "Blue Frog", new Sprite('F'), new Position(5, 5), 15, 10, 10);
        Entity redFrog = new Entity(
                "Red Frog", new Sprite('F'), new Position(10, 5), 15, 10, 10);
        Entity greenFrog = new Entity(
                "Green Frog", new Sprite('F'), new Position(4, 9), 15, 10, 10);

        this.entities = new Entity[] {blueFrog, redFrog, greenFrog};

        this.space = new Space(20, 20)
                .withPlayer(player)
                .withEntities(entities)
                .withOuterWall();

        loop();
    }

    // region | Game Loop ----------------------------------------------------------------------------------------------

    public void loop() {
        while (!player.lastCommand.equals("q")) {
            RenderingUtility.clearScreen();

            space.renderSpace();
            space.movePlayer();
        }
    }

    // endregion
}
