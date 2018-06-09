package com.megalunchbox.InDev.Tile;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public enum Tile {


     AIR("Air", 0, false, false),
    DIRT("Dirt", 1, true, false, createTexture("core/assets/Dirt.png"));


    private Texture texture;
    private String name;
    private int id;
    static int tileSize = 16;
    private int x;
    private int y;
    private boolean collidable;
    private boolean hazard;
    private boolean textureOn;

    private Tile(String name, int id, boolean collidable, boolean hazard, Texture texture) {
        this.name = name;
        this.id = id;
        this.collidable = collidable;
        this.hazard = hazard;
        this.texture = texture;
        textureOn = true;
    }
    private Tile(String name, int id, boolean collidable, boolean hazard) {
        this(name,id,collidable,hazard,null);
        textureOn = false;
    }

    private static Texture createTexture(String texturePath) {
        return new Texture (texturePath);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isCollidable() {
        return collidable;
    }

    public boolean isHazard() {
        return hazard;
    }

    public Texture getTexture () {
        if (textureOn) {
            return texture;
        }
        return null;
    }


    private static HashMap<Integer, Tile> tileMap;

    static {
        tileMap = new HashMap<Integer, Tile>();
        for (Tile tile : Tile.values()) {
            tileMap.put(tile.getId(), tile);
        }
    }

    public static Tile getTileTypeById (int id) {
        return tileMap.get(id);
    }
     
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
     }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;    
    }
    public void setLoc(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setTexture(Texture texture) {
         this.texture = texture;
    }

    public static int getTileSize() {
        return tileSize;
    }

    public boolean hasTexture () {
        if (textureOn == false) {
            return false;
        }
        return true;
    }
}
