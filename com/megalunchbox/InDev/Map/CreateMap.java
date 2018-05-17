package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.InDev.Tile.TileType;

public class CreateMap {

    int tileSize = TileType.getTileSize();

    /*
    Method: createMap()
    Creates new map,
    TODO: add noise and random generation
    */


    public void createMap() {
        for (int y = 0; y <  Map.height; y++)

        {

            for (int x = 0; x < Map.width; x++) {



                        if (y < 3) {
                            Map.manager.createTile(TileType.DIRT, x, y);

                        }
                        if (y > 3 && y < 6) {
                            Map.manager.createTile(TileType.GRASS, x, y);
                        }
                        if (y > 6) {
                            Map.manager.createTile(TileType.AIR, x, y);
                        }





            }

        }
    }
}
