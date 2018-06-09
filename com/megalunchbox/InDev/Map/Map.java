package com.megalunchbox.InDev.Map;

import com.megalunchbox.InDev.Graphics.Camera;
import com.megalunchbox.InDev.Tile.Tile;
import com.megalunchbox.InDev.Tile.TileManager;

import java.util.LinkedList;

public class Map {

    private static int scale = 1;
    private static int height = 1080 / Tile.getTileSize();
    private static int width = 1920 / Tile.getTileSize() ;
    private static TileManager manager = new TileManager(new LinkedList<Tile>());

    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }

    public static int getScale() {
        return scale;
    }

    public static void setScale(int scale) {
        Map.scale = scale;
    }

    public static TileManager getManager() {
        return manager;
    }
}
