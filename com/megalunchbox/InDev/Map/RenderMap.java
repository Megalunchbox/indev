package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Tile.TileType;

public class RenderMap {



    static SpriteBatch batch;
    final TileType[] tiles = TileType.values();


    private int width  = Gdx.graphics.getWidth()/16;
    private int height = Gdx.graphics.getHeight()/16;
    private int tileSize = TileType.getTileSize();

    public void create() {

        RenderMap.batch = new SpriteBatch();

        }



    public void render() {


    for (int y = 0; y <= Gdx.graphics.getHeight() - 16; y += TileType.getTileSize()) {

        for (int x = 0; x <= Gdx.graphics.getWidth(); x += TileType.getTileSize()) {

            RenderMap.batch.begin();
            RenderMap.batch.draw(tiles[0].getTexture(), x, y);
            RenderMap.batch.end();


        }
        }
    }

    public void dispose() {
    RenderMap.batch.dispose();
    }
}
