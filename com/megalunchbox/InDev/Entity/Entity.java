package com.megalunchbox.InDev.Entity;

import com.badlogic.gdx.graphics.Texture;

abstract class Entity {
    
    int x, y;
    int health;
    int maxHealth;
    int maxSpeed;
    int mass;
    int speed = 0;
    boolean alive;
    Texture texture;
    
    public Entity() {
        
        health = 20;
        maxSpeed = 5;
        mass = 120;
        texture = null;
        maxHealth = 100;
        alive = true;
    }

    public Entity (Texture texture, int health, int maxHealth, int mass, int maxSpeed) {

        this.texture = texture;
        this.health = health;
        this.maxHealth = maxHealth;
        this.mass = mass;
        this.alive = true;
        this.texture = texture;
        this.maxSpeed = maxSpeed;

    }




    public int getHealth() {
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
    
    public int getSpeed() {
     return speed;   
    }

    public int getX() {
     return x;   
    }

    public int getY() {
     return y;   
    }

    public boolean isLiving() {
     return alive;   
    }
    
    public void setHealth(int health) {
     this.health = health;   
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void kill() {
     alive = false;   
    }

    public void setLoc(int x, int y) {
     this.x = x;
     this.y = y;
    }
    public void setX(int x) {
     this.x = x;
    }

    public void setY(int y) {
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
}
