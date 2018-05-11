package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.InDev.Tile.TileManager;
import com.megalunchbox.InDev.Tile.TileType;

public class CreateMap {

    int width = Gdx.graphics.getWidth()/16;
    int height = Gdx.graphics.getHeight()/16;
    int tileSize = TileType.getTileSize();

    public void createMap() {
        for (int y = 0; y <= Gdx.graphics.getHeight() - 16; y += tileSize)

        {

            for (int x = 0; x <= Gdx.graphics.getWidth(); x += tileSize) {


                if (y < height/5) {

                    Map.manager.createTile(TileType.DIRT, x, y);

                }




            }

        }
    }
}
