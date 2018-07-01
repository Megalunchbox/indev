package com.megalunchbox.InDev.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Graphics.Graphics;
import com.megalunchbox.InDev.Main;
import com.megalunchbox.InDev.Map.Map;
import com.megalunchbox.InDev.State.State;
import com.megalunchbox.InDev.State.ViewMode;
import com.megalunchbox.InDev.Tile.Tile;

public class Render {

    private static SpriteBatch batch;
    private static SpriteBatch backgroundBatch;
    private static SpriteBatch overlayBatch;
    static BitmapFont font;
    private static Texture skyTexture;

    public void create () {
        font = new BitmapFont();
        batch = new SpriteBatch();
        backgroundBatch = new SpriteBatch();
        overlayBatch = new SpriteBatch();
        Camera.createCam();
        skyTexture = new Texture("core/assets/sky.png");

    }


    public void render () {
        State currentState = State.getCurrentState();

        if(currentState == State.MENU) {
            batch.begin();
            batch.draw(new Texture("core/assets/button_base.png"), 100,100, 1000, 100);
            batch.end();
        }
         else if (currentState == State.GAME) {
            if (ViewMode.getCurrentMode() == ViewMode.TERRITORY) {
                renderMap(Main.testMap, batch);
            }
        } else if (currentState == State.SETTING) {

        }

    }

    public void dispose() {

    }


    public void renderMap(Map currentMap, SpriteBatch batch) {

        if (ViewMode.getCurrentMode().equals(ViewMode.TERRITORY)) {
            Tile tile;
            batch.begin();
            batch.setProjectionMatrix(Camera.cam.combined);

            for (int y = 0; y < currentMap.getHeight(); y++) {

                for (int x = 0; x < currentMap.getWidth(); x++) {

                    tile = currentMap.getManager().getTileByCoordinate(x, y);
                    if (!tile.getName().equals(Tile.AIR.getName())) {
                        Graphics.draw(batch, tile.getTexture(), x, y);
                    }
                }
            }

            batch.end();
        }
    }


    public void renderSky(SpriteBatch batch, Texture texture) {
        if (State.getCurrentState() == State.GAME && ViewMode.getCurrentMode() == ViewMode.TERRITORY) {
            batch.begin();
            batch.draw(texture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
            batch.end();
        }
    }

    public void renderOverlay(SpriteBatch batch) {
        if (State.getCurrentState() == State.GAME && ViewMode.getCurrentMode() == ViewMode.TERRITORY) {
            batch.begin();
            font.draw(batch, "X Pos: " + Camera.getPosXInGameWorld(Camera.cam.position.x) + " Y Pos: " + Camera.getCamYPosInWorld(), 10, Gdx.graphics.getHeight() - 20);
            font.draw(batch, "FPS: " + Integer.toString( Gdx.graphics.getFramesPerSecond()), 10, Gdx.graphics.getHeight() - 50);
            batch.end();
        }
    }


}
