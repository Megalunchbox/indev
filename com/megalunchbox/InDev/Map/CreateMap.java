package com.megalunchbox.InDev.Map;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.InDev.Tile.TileType;

public class CreateMap {

    /*
    Method: createMap()
    Creates new map,
    TODO: add noise and random generation
    */


    public void createMap() {
        for (int y = 0; y <  Map.height; y++)

        {

            for (int x = 0; x < Map.width; x++) {



                if (x == 4) {
                    Map.manager.createTile(TileType.STRAIGHT_WALL, x, y);
                } else {
                    Map.manager.createTile(TileType.AIR, x, y);
                }


            }

        }
    }
}
