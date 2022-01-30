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

    public Entity(Sprite sprite, Position position, int health, int strength, int defenese) {
        this.sprite = sprite;
        this.position = position;
        this.health = health;
        this.strength = strength;
        this.defense = defenese;

        isAlive = health > 0;
    }

    // endregion

    // region | Utility Methods ----------------------------------------------------------------------------------------

    public void setHealth(int desiredHealth) {
        health = desiredHealth;
        isAlive = health > 0;
    }
}
