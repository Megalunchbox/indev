package com.megalunchbox.InDev.Map;

import com.megalunchbox.InDev.Tile.Tile;

public class CreateMap {

    /*
    Method: createMap()
    Creates new map,
    TODO: add noise and random generation
    */


    public void createMap() {

        for (int y = 0; y <  Map.getHeight(); y++) {

            for (int x = 0; x < Map.getWidth(); x++) {

                if (y > 30) {
                    Map.getManager().createTile(Tile.DIRT, x, y);

                } else {
                    Map.getManager().createTile(Tile.AIR, x, y);
                }


            }

        }
    }
}
