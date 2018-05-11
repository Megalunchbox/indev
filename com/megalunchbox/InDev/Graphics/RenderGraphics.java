package com.megalunchbox.InDev.Graphics;

public class RenderGraphics {

/*
TODO: implement coordinate system so this method doesn't draw incorrectly.
*/

  //Draws using SpriteBatch, must use batch.begin() and batch.end() before this
  //The reason i made it this way is to increase performance
  public static void draw(SpriteBatch batch, Texture texture, int x, int y) {
    batch.draw(texture, x / TileType.getTileSize(), y / TileType.getTileSize());
  }


}
