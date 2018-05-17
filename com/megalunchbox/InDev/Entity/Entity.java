package com.megalunchbox.InDev.Entity;

import com.badlogic.gdx.graphics.Texture;

public class Entity {

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
}
