package com.megalunchbox.InDev.Input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.megalunchbox.InDev.Graphics.Camera;
import com.megalunchbox.InDev.Map.Map;
import com.megalunchbox.InDev.Tile.Tile;

public class Arrows extends InputListener{


    static int upKey = Input.Keys.UP;
    static int downKey = Input.Keys.DOWN;
    static int leftKey = Input.Keys.LEFT;
    static int rightKey = Input.Keys.RIGHT;
    static int zoomOutKey = Input.Keys.Q;
    static int zoomInKey = Input.Keys.E;
    static float camEdgeDistance = Gdx.graphics.getWidth() / 2;

    public Arrows() {

        //random number because this class will be using multiple keys, will try and change this in the future
        super(123123);

    }

    public boolean checkPressed(int keycode) {
        if (Gdx.input.isKeyPressed(keycode)) {
            return true;
        }
        return false;
    }

    @Override
    public void onSettingState() {

    }

    @Override
    public void onMenuState() {

    }

    @Override
    public void onMapView() {

    }

    @Override
    public void onTerritoryView() {
        System.out.println("Cam x: " + Camera.cam.position.x);
        if(Gdx.input.isKeyPressed(upKey)) {
            Camera.moveCamUp(1);
        }

        if (Gdx.input.isKeyPressed(downKey)) {
            Camera.moveCamDown(1);
        }

        if(Gdx.input.isKeyPressed(leftKey)) {
            if(Camera.getCam().position.x - camEdgeDistance > 0)
            Camera.moveCamLeft(1);
        }
        if(checkPressed(rightKey)) {
            if (Camera.getCam().position.x + camEdgeDistance < Map.getWidth() * Tile.getTileSize())

                Camera.moveCamRight(1);
        }
        if(checkPressed(zoomInKey)) {
            if (Camera.cam.zoom > 0) {
                Camera.cam.zoom = Camera.cam.zoom - 0.01f;
            }
        }
        if (checkPressed(zoomOutKey)) {
            Camera.cam.zoom = Camera.cam.zoom + 0.01f;
        }
    }
}
