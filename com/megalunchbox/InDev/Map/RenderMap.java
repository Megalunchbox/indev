package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Tile.TileType;

public class RenderMap {



    static SpriteBatch batch;
    final TileType[] tiles = TileType.values();

    public void create() {

        batch = new SpriteBatch();

        }



    public void render() {


    for (int y = 0; y <= Gdx.graphics.getHeight() - 16; y +=16) {

        for (int x = 0; x <= Gdx.graphics.getWidth(); x += 16) {

            RenderMap.batch.begin();
            RenderMap.batch.draw(tiles[1].getTexture(), x, y);
            RenderMap.batch.end();


        }
        }
    }

    public void dispose() {
    RenderMap.batch.dispose();
    }
}
