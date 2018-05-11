package com.megalunchbox.InDev.Tile;

import java.util.ArrayList;
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

  public TileType getTileByCoordinate(int x, int y) {
    for (int i = 0; i < tileList.size(); i++ ) {
      TileType tile = tileList.get(i);
      if (int x == tile.getY()) {
        if (int y == tile.getX()) {
          return tile;
        }
      }
    }
    
    return TileType.AIR
    
  }
  
}
