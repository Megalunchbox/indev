package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.megalunchbox.InDev.Graphics.Camera;
import com.megalunchbox.InDev.Graphics.RenderGraphics;
import com.megalunchbox.InDev.Tile.Tile;


public class RenderMap {

    static SpriteBatch batch;

    public void create() {
        RenderMap.batch = new SpriteBatch();
        }


    public void render() {
        Tile tile;
        RenderMap.batch.begin();
        RenderMap.batch.setProjectionMatrix(Camera.cam.combined);
        for (int y = 0; y < Map.getHeight(); y++) {

            for (int x = 0; x < Map.getWidth(); x++) {

                tile = Map.getManager().getTileByCoordinate(x, y);
                if (tile.getName() != Tile.AIR.getName()) {
                    RenderGraphics.draw(batch, tile.getTexture(), x, y);
                }
            }
        }

        RenderMap.batch.end();
    }

    public void dispose() {
    RenderMap.batch.dispose();
    }
}
