package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.Position;

public class TestPlayer {

    Player player = new Player();

    @Test
    void test_moveNorth() {
        player.position = new Position(2, 2);
        player.lastCommand = "w";

        player.move();

        Assertions.assertEquals(2, player.position.x);
        Assertions.assertEquals(1, player.position.y);
    }

    @Test
    void test_moveSouth() {
        player.position = new Position(2, 2);
        player.lastCommand = "s";

        player.move();

        Assertions.assertEquals(2, player.position.x);
        Assertions.assertEquals(3, player.position.y);
    }


    @Test
    void test_moveWest() {
        player.position = new Position(2, 2);
        player.lastCommand = "a";

        player.move();

        Assertions.assertEquals(1, player.position.x);
        Assertions.assertEquals(2, player.position.y);
    }


    @Test
    void test_moveEast() {
        player.position = new Position(2, 2);
        player.lastCommand = "d";

        player.move();

        Assertions.assertEquals(3, player.position.x);
        Assertions.assertEquals(2, player.position.y);
    }

    @Test
    void test_noMovement() {
        player.position = new Position(2, 2);
        player.lastCommand = "test";

        player.move();

        Assertions.assertEquals(2, player.position.x);
        Assertions.assertEquals(2, player.position.y);
    }
}
