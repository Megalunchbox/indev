package com.megalunchbox.InDev.Entity;


import com.badlogic.gdx.graphics.Texture;

public class Player extends Entity {



    public Player(Texture texture, int health, int maxHealth, int mass, int maxSpeed) {
    super(texture, health, maxHealth, mass, maxSpeed);
    }

    public void moveUp(int distance) {
        setY(getY() + distance * speed);
    }

    public void moveUp(float distance) {
        setY(getY() + distance * speed);
    }

    public void moveDown(int distance) {
        setY(getY() - distance * speed);
    }

    public void moveDown(float distance) {
        setY(getY() - distance * speed);
    }

    public void moveRight(int distance) {
        setX(getX() + distance * speed);
    }

    public void moveRight(float distance) {
        setX(getX() + distance * speed);
    }

    public void moveLeft(int distance) {
        setX(getX() - distance * speed);
    }

    public void moveLeft(float distance) {
        setX(getX() - distance * speed);
    }

    public void damage(int amount) {
        setHealth(health - amount);
    }
}
