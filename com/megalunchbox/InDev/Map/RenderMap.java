package com.megalunchbox.InDev.Map;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Graphics.RenderGraphics;
import com.megalunchbox.InDev.Tile.TileType;


public class RenderMap {

    static SpriteBatch batch;

    //TODO: implement my own coordinate system.

    
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

        TileType tile;
        RenderMap.batch.begin();
        for (int y = 0; y < Map.height; y++) {

            for (int x = 0; x < Map.width; x++) {

                tile = Map.manager.getTileByCoordinate(x, y);
                RenderGraphics.draw(RenderMap.batch, tile.getTexture(), x, y);
            }
        }
        RenderMap.batch.end();

    }

    public void dispose() {
    RenderMap.batch.dispose();
    }
}
