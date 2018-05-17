package com.megalunchbox.InDev.Tile;

import com.megalunchbox.InDev.Map.Map;
import java.util.LinkedList;


public class TileManager {

  LinkedList<TileType> tileList;

  public TileManager (LinkedList<TileType> tileList) {
    this.tileList = tileList;
  }

  public void createTile(TileType tileType, int x, int y) {
    tileList.add(tileType);
    tileType.setX(x);
    tileType.setY(y);
  }

  //Gets the X by the element in the list
  public int getX(int i) {
    return tileList.get(i).getX();
  }

  //Gets the Y by the element in the list
  public int getY(int i) {
    return tileList.get(i).getY();
  }
  

  public LinkedList<TileType> getList() {
    return tileList;
  }

  /**
   *  Gets a tile by its coordinates within the map
   *
   * @param x
   * @param y
   * @return TileType
   */
  public TileType getTileByCoordinate(int x, int y) {
    int expression = (y - 1) * Map.getWidth() + x;
    if (expression >= tileList.size()) {
      TileType tile = TileType.AIR;
      tile.setLoc(x, y);
      return tile;
    }
    if (y != 0) {
      return tileList.get(expression);
    }
    else return tileList.get(x);
  }
  
}
