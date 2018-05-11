package com.megalunchbox.InDev.Tile;

import java.util.ArrayList;



public class TileManager {


  ArrayList<TileType> tileList = new ArrayList<TileType>();

  public TileManager () {

  }

  public void createTile(TileType tileType) {

    tileList.add(tileType);

  }

  public void getTileCoords () {

  }

}
