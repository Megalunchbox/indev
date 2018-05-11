package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Tile.TileManager;
import com.megalunchbox.InDev.Tile.TileType;

import java.util.ArrayList;
import java.util.LinkedList;

public class RenderMap {


    TileType[] a;
    static SpriteBatch batch;
    final TileType[] tiles = TileType.values();


    private int width  = Gdx.graphics.getWidth()/16;
    private int height = Gdx.graphics.getHeight()/16;
    private int tileSize = TileType.getTileSize();

    public void create() {

        RenderMap.batch = new SpriteBatch();


        }



    public void render() {

        TileManager clonedManager = Map.manager;

        RenderMap.batch.begin();
           for (int i = 0; i < Map.manager.getList().size(); i++) {
                RenderMap.batch.draw(Map.manager.getList().get(i).getTexture(), Map.manager.getList().get(i).getX(), Map.manager.getList().get(i).getY());
            }
        RenderMap.batch.end();

        System.out.println("manager size: " + Map.manager.getList().size());
        System.out.println(Map.manager.getList());
        System.out.println(Map.manager.getList().size());

    }

    public void dispose() {
    RenderMap.batch.dispose();
    }
}
