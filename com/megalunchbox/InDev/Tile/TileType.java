package com.megalunchbox.InDev.Tile;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public enum TileType {


     AIR("Air", 0, false, false, new Texture("Air.png")),
    GRASS("Grass", 0, true, false, new Texture("Grass.png")),
    DIRT("DIRT", 2, true, false, createTexture("Dirt.png"));




    //String values
    private Texture texture;
    private String name;

    //Integer values
    private int id;
    private int tileSize = 16;

    //Booleans
    private boolean collidable;
    private boolean hazard;

    private TileType(String name, int id, boolean collidable, Texture texture) {
        this(name,id, true, false, texture);

    }
    private TileType(String name, int id, boolean collidable, boolean hazard, Texture texture) {
        this.name = name;
        this.id = id;
        this.collidable = collidable;
        this.hazard = hazard;
        this.texture = texture;
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
        return texture;

    }


    private static HashMap<Integer, TileType> tileMap;

    static {
        tileMap = new HashMap<Integer, TileType>();
        for (TileType tileType : TileType.values()) {
            tileMap.put(tileType.getId(), tileType);
        }
    }

    public static TileType getTileTypeById (int id) {
        return tileMap.get(id);
    }

}
