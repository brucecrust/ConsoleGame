// [x] TODO: Create a basic game map -- 2D array?
// [x] TODO: Create Sprite class
// [x] TODO: Create Print/Rendering class
// [x] TODO: Create entities -- each entity will have a sprite
// [x] TODO: Create player class
// [x] TODO: Create movement in the player class
// [] TODO: Modify the map to display player and entities
// [] TODO: Integrate movement into spaces
// [] TODO: Create wall outline method for space
// [] TODO: Create basic wall collision -- maybe?
// [] TODO: Create entity/sprite collision
// [] TODO: Create enemies/npcs
// [] TODO: Create user input system
// [] TODO: Combat logic
// [] TODO: Create items?
// [] TODO: Create basic inventory
// [] TODO: Game Map -- dynamically created
// [] TODO: Create engine class, which will handle the game loop

import engine.Space;
import engine.Sprite;
import entity.Player;
import utilities.Position;

public class Main {

    public static void main(String[] args) {
        Space world = new Space(10, 10);
        Player player = new Player("Test", new Sprite('P'), new Position(2, 2), 10, 10, 10);

        world.modify(player.position, player.sprite);
        world.renderSpace();
    }
}
