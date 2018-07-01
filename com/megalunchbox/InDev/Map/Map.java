package com.megalunchbox.InDev.Map;

import com.megalunchbox.InDev.Tile.Tile;
import com.megalunchbox.InDev.Tile.TileManager;

import java.util.LinkedList;

public class Map {


    /*
    TODO: Add map loading...

    try serialization maybe :D
    */

    private static Map currentMap;
    private int height;
    private int width;
    private TileManager manager;


    public Map() {
        this.width = 1920 / Tile.getTileSize();
        this.height = 1080 / Tile.getTileSize();
        this.manager = new TileManager(new LinkedList<Tile>());
    }

    public Map(int height, int width) {

        this.height = height / Tile.getTileSize();
        this.width = width / Tile.getTileSize();
        this.manager = new TileManager(new LinkedList<Tile>());
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

    public void setCurrentMap(Map currentMap) {
        this.currentMap = currentMap;
    }

    public static Map getCurrentMap() {
        return currentMap;
    }


}
