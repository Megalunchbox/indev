package com.megalunchbox.InDev.Entity;

import com.badlogic.gdx.graphics.Texture;
import com.megalunchbox.InDev.Tile.Tile;

abstract class Entity {
    
    float x, y, health;
    int maxHealth, maxSpeed, mass;
    float speed = 0;
    boolean alive;
    Texture texture;
    float width, height;



    public Entity (Texture texture, int health, int maxHealth, int mass, int maxSpeed) {

        this.texture = texture;
        this.health = health;
        this.maxHealth = maxHealth;
        this.mass = mass;
        this.alive = true;
        this.texture = texture;
        this.maxSpeed = maxSpeed;

    }


    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Texture getTexture() {
        return texture;
    }

    public float getHealth() {
        return health;  
}
    
    public int getMaxSpeed() {
     return maxSpeed;   
    }
    
    public int getMass() {
     return mass;   
    }

    public int getMaxHealth() {
     return maxHealth;   
    }
    
    public float getSpeed() {
     return speed;   
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getX() {
     return x;   
    }

    public float getY() {
     return y;   
    }

    public boolean isLiving() {
     return alive;   
    }
    
    public void setHealth(int health) {
     this.health = health;   
    }
    public void setHealth(float health) {
        this.health = health;
    }
    
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public void kill() {
     alive = false;   
    }

    public void setLoc(int x, int y) {
     this.x = x;
     this.y = y;
    }

    public void setLoc(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
     this.x = x;
    }

    public void setY(float y) {
    this.y = y;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean checkDeath() {
        if (alive) {
            if (health > 0) {
                return true;
            }
        }
        return false;
    }

    public static float DistanceFromEntity(Entity thisEntity, Entity otherEntity) {

        float xDist = thisEntity.x - otherEntity.x;
        float yDist = thisEntity.y - otherEntity.y;

        return (xDist * xDist) + (yDist * yDist);
    }

    public static float DistanceFromBlock(Entity thisEntity, Tile tile) {

        float xDist = thisEntity.x - tile.getX();
        float yDist = thisEntity.y - tile.getY();

        return (xDist * xDist) + (yDist * yDist);
    }
}
