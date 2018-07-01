package com.megalunchbox.InDev.Map;

import com.megalunchbox.InDev.Tile.Tile;

public class CreateMap {


    /**
     * @param map The map you are wanting to generate
     * @return The new generated map
     */

    public Map createMap(Map map) {

        Map newMap = map;

        for (int y = 0; y <  newMap.getHeight(); y++) {

            for (int x = 0; x < newMap.getWidth(); x++) {

                if (y < 30) {
                    newMap.getManager().createTile(Tile.DIRT, x, y);

                } else {
                    newMap.getManager().createTile(Tile.AIR, x, y);
                }


            }

        }

        return newMap;
    }


}
