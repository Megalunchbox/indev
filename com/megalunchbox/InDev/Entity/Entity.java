package com.megalunchbox.InDev.Entity;

import com.badlogic.gdx.graphics.Texture;

public class Entity {
    
    int x, y;
    int health;
    int maxHealth;
    int maxSpeed;
    int mass;
    int speed = 0;
    boolean alive;
    
    Texture texture;
    
    public Entity(int health, int maxSpeed, int mass, Texture texture, int maxHealth) {
        
        this.health = health;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.texture = texture;
        this.maxHealth = maxHealth;
        this.alive = true;
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
}
