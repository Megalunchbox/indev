package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.InDev.Tile.TileManager;
import com.megalunchbox.InDev.Tile.TileType;

import java.util.LinkedList;

public class Map {

    final static int height = Gdx.graphics.getHeight() / 16;
    final static int width = Gdx.graphics.getWidth() / 16;
    final static int tileSize = TileType.getTileSize();
    static TileManager manager = new TileManager(new LinkedList<TileType>());

    public static int getHeight() {
        return height;

    }
    public static int getWidth() {
        return width;
    }

}
