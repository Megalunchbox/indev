package com.megalunchbox.InDev.Graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Tile.Tile;

public class RenderGraphics {

/*
TODO: implement coordinate system so this method doesn't draw incorrectly.
*/

  /**
   * @param batch
   * @param texture
   * @param x
   * @param y
   *
   *
   * Draws using SpriteBatch, must use batch.begin() and batch.end() before this
   *The reason i made it this way is to increase performance
   */

  public static void draw(SpriteBatch batch, Texture texture, float x, float y) {
    batch.draw(texture, x * Tile.getTileSize(), y * Tile.getTileSize());
  }


}
