package engine;

import entity.Entity;
import entity.Player;
import utilities.Position;

public class Engine {

    // region | Member Variables ---------------------------------------------------------------------------------------

    private Space space;
    private Player player;
    private Entity[] entities;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Engine() {
        this.space = new Space(10, 10);
        this.player = new Player(
                "Test", new Sprite('P'), new Position(2, 2), 10, 10, 10);
        this.entities = new Entity[space.maxEntityAmount];

        space.modify(player.position, player.sprite);

        loop();
    }

    // region | Game Loop ----------------------------------------------------------------------------------------------

    public void loop() {
        while (!player.lastCommand.equals("q")) {
            space.renderSpace();
            player.userInput();
        }
    }

    // endregion
}
