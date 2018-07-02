package com.megalunchbox.InDev.Map;

import com.megalunchbox.InDev.Tile.Tile;
import com.megalunchbox.InDev.Tile.TileManager;

import java.util.LinkedList;

public class Map {


    /*
    TODO: Add map loading...

    try serialization maybe :D
    */

    static Map currentMap;
    private int height;
    private int width;
    private TileManager manager;


    public Map() {
        this.width = 1920 / Tile.getTileSize();
        this.height = 1080 / Tile.getTileSize();
        this.manager = new TileManager(new LinkedList<Tile>(), this);
    }

    public Map(int height, int width) {

        this.height = height / Tile.getTileSize();
        this.width = width / Tile.getTileSize();
        this.manager = new TileManager(new LinkedList<Tile>(), this);
    }

    public Map(int width, int height, TileManager manager) {
        this.width = width / Tile.getTileSize();
        this.width = width / Tile.getTileSize();
        this.manager = manager;

    }




    public  int getHeight() {
        return height;
    }

    public  int getWidth() {
        return width;
    }

    public  TileManager getManager() {
        return manager;
    }

    public static void setCurrentMap(Map m) {
        currentMap = m;
    }

    public static Map getCurrentMap() {
        return currentMap;
    }


}
