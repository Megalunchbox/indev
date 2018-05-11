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

    static SpriteBatch batch;
    final TileType[] tiles = TileType.values();

    //TODO: implement my own coordinate system.
    private int width  = Gdx.graphics.getWidth()/16;
    private int height = Gdx.graphics.getHeight()/16;
    private int tileSize = TileType.getTileSize();

    
    /*
    
    creates sprite batch
    create() -> Create.create() -> Main.create()
    */
    public void create() {

        RenderMap.batch = new SpriteBatch();


        }


     /* 
     RenderMap render() method will get all tiles from TileManager, any tiles that are empty will be filled with air.
     render() will not modify tiles in any way, only display
     */
    public void render() {

        TileManager clonedManager = Map.manager;
        //TODO: Fill empty tiles with air and fix multiple tile rendering.
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
