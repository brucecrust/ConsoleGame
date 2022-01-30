package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEntity {

    Entity entity = new Entity();

    @Test
    void test_setHealth() {
        entity.setHealth(10);

        Assertions.assertEquals(10, entity.health);
    }

    @Test
    void test_isAlive() {
        entity.setHealth(10);

        Assertions.assertTrue(entity.isAlive);
    }

    @Test
    void test_isDead() {
        entity.setHealth(0);

        Assertions.assertFalse(entity.isAlive);
    }
}
