package entity;

import engine.Sprite;
import utilities.Position;

public class Entity {

    // region | Member Variables ---------------------------------------------------------------------------------------

    public Sprite sprite;
    public Position position;

    public int health;
    public int strength;
    public int defense;

    public boolean isAlive;

    // endregion

    // region | Constructor --------------------------------------------------------------------------------------------

    public Entity() {}

    public Entity(Sprite sprite, Position position, int health, int strength, int defense) {
        this.sprite = sprite;
        this.position = position;
        this.health = health;
        this.strength = strength;
        this.defense = defense;

        isAlive = health > 0;
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    public void setHealth(int health) {
        this.health = health;
        isAlive = health > 0;
    }
}
