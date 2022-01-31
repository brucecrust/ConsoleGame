package engine;

import entity.Entity;
import entity.Player;
import utilities.Position;
import utilities.RenderingUtility;

public class Engine {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private Space space;
    private Player player;
    private Entity[] entities;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Engine() {

        this.player = new Player(
                "Test", new Sprite('P'), new Position(2, 2), 10, 10, 10);
        this.space = new Space(25, 25, player)
                .withOuterWall();
        this.entities = new Entity[space.maxEntityAmount];

        space.modify(player.position, player.sprite);

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
