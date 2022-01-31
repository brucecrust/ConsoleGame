package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.Position;

public class TestEntity {

    Entity entity = new Entity();

    @Test
    void test_setHealth() {
        System.out.println("Verify that entity health can be set");

        entity.setHealth(10);

        Assertions.assertEquals(10, entity.health);
    }

    @Test
    void test_isAlive() {
        System.out.println("Verify that entity is alive");

        entity.setHealth(10);

        Assertions.assertTrue(entity.isAlive);
    }

    @Test
    void test_isDead() {
        System.out.println("Verify that entity is dead");

        entity.setHealth(0);

        Assertions.assertFalse(entity.isAlive);
    }

    @Test
    void test_hasSamePosition() {
        System.out.println("Verify that two entities have the same position");

        entity.position = new Position(3, 3);
        Entity otherEntity = new Entity();
        otherEntity.position = new Position(3, 3);

        Assertions.assertTrue(entity.hasSamePosition(otherEntity.position));
    }

    @Test
    void test_hasDifferentPosition() {
        System.out.println("Verify that two entities have different positions");

        entity.position = new Position(5, 5);
        Entity otherEntity = new Entity();
        otherEntity.position = new Position(3, 3);

        Assertions.assertFalse(entity.hasSamePosition(otherEntity.position));
    }
}
