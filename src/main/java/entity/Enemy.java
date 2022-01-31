package entity;

import engine.Sprite;
import utilities.Position;

public class Enemy extends Entity {

    public Enemy(String name, Sprite sprite, Position position, int health, int strength, int defense) {
        super(name, sprite, position, health, strength, defense);
    }
}
