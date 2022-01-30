// [x] TODO: Create a basic game map -- 2D array?
// [x] TODO: Create Sprite class
// [] TODO: Create Print/Rendering class
// [] TODO: Create entities -- each entity will have a sprite
// [] TODO: Create player class
// [] TODO: Create movement in the player class
// [] TODO: Create basic wall collision -- maybe?
// [] TODO: Create entity/sprite collision
// [] TODO: Enemy/NPC creation
// [] TODO: Create user input system
// [] TODO: Combat logic
// [] TODO: Create items?
// [] TODO: Create basic inventory
// [] TODO: Game Map -- dynamically created

import engine.Space;

public class Main {

    public static void main(String[] args) {
        Space world = new Space(10, 10);
        world.renderSpace();
    }
}
