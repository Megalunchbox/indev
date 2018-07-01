package com.megalunchbox.InDev.Tile;

import com.megalunchbox.InDev.Map.Map;
import java.util.LinkedList;


public class TileManager {

  LinkedList<Tile> tileList;

  public TileManager (LinkedList<Tile> tileList) {
    this.tileList = tileList;
  }

  public void createTile(Tile tile, int x, int y) {
    tile.setLoc(x, y);
    tileList.add(tile);
  }

  //Gets the X by the element in the list
  public int getX(int i) {
    return tileList.get(i).getX();
  }

  //Gets the Y by the element in the list
  public int getY(int i) {
    return tileList.get(i).getY();
  }
  

  public LinkedList<Tile> getList() {
    return tileList;
  }

  /**
   *  Gets a tile by its coordinates within the map
   *
   * @param x
   * @param y
   * @return Tile
   */
  public Tile getTileByCoordinate(int x, int y) {
    int expression = (y - 1) * Map.getWidth() + x;
    if (expression >= tileList.size()) {
      Tile tile = Tile.AIR;
      tile.setLoc(x, y);
      return tile;
    }
    if (y != 0) {
      return tileList.get(expression);
    }
    else return tileList.get(x);
  }
  
  public void copyTileInList(Tile tile, int x, int y) {
     tileList.set((y - 1) * Map.getWidth() + x, tile);
     tile.setX(x);
     tile.setY(y);
  }
  
  public void replaceTileInList(Tile replace, Tile with) {
    tileList.set((replace.getY()) * Map.getWidth() + replace.getX(), with);
  }
  
  
  public void moveTileInList(int fromX, int fromY, int toY, int toX) {
    Tile fromTile = getTileByCoordinate(fromX, fromY);
    Tile toTile = getTileByCoordinate(toY, toX);
    Tile air = Tile.AIR;
    air.setLoc(fromX, fromY);
    if (fromTile.getName().equals(Tile.AIR.getName())) return;
    if (!toTile.getName().equals(Tile.AIR.getName())) return;
    
    tileList.set((fromY - 1) * Map.getWidth() + fromX, air);
    tileList.set((toY - 1) * Map.getWidth() + toX, fromTile);
    
    
  }
  
}
