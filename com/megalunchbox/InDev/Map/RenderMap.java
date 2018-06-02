package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Graphics.RenderGraphics;
import com.megalunchbox.InDev.Tile.TileType;


public class RenderMap {

    static SpriteBatch batch;


    public void create() {
        RenderMap.batch = new SpriteBatch();
        }


    public void render() {

        //Todo: Render map by location of the camera
        
        TileType tile;
        RenderMap.batch.begin();

        for (int y = 0; y < Map.height; y++) {

            for (int x = 0; x < Map.width; x++) {

                tile = Map.manager.getTileByCoordinate(x, y);
                if (tile.getName() != TileType.AIR.getName()) {
                    RenderGraphics.draw(RenderMap.batch, tile.getTexture(), x, y);

                }
            }
        }
        RenderMap.batch.end();

    }

    public void dispose() {
    RenderMap.batch.dispose();
    }
}
