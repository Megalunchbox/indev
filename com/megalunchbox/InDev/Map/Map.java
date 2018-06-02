package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.InDev.Tile.TileManager;
import com.megalunchbox.InDev.Tile.TileType;

import java.util.LinkedList;

public class Map {

    static int scale = 0;
    static int height = 1080 / 16;
    static int width = 1920 / 16 ;
    static TileManager manager = new TileManager(new LinkedList<TileType>());


    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }

    public static int getScale() {
        return scale;
    }
}
