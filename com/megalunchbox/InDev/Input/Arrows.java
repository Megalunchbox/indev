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
    public static void update() {
        camEdgeDistance = (Gdx.graphics.getWidth() / 2) * Camera.cam.zoom;
    }
    public boolean checkPressed(int keycode) {
        return Gdx.input.isKeyPressed(keycode);
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
        if (Gdx.input.isKeyPressed(upKey)) {
            Camera.moveCamUp(1);
        }

        if (Gdx.input.isKeyPressed(downKey)) {
            Camera.moveCamDown(1);
        }

        if (Gdx.input.isKeyPressed(leftKey)) {
            if (Camera.getPosXInGameWorld(Camera.getCam().position.x - 1) - camEdgeDistance > 0)
                Camera.moveCamLeft(1);
        }
        if (checkPressed(rightKey)) {
            if (Camera.getPosXInGameWorld(Camera.getCam().position.x) + camEdgeDistance + 1 < (Map.getWidth() * Tile.getTileSize()))

                Camera.moveCamRight(1);
        }
        if (checkPressed(zoomInKey)) {
            if (Camera.cam.zoom > 0) {
                Camera.cam.zoom = Camera.cam.zoom - 0.01f;
            }
        }
        if (checkPressed(zoomOutKey)) {
            if (Camera.getCamZoom() != Camera.maxZoomLevel) {
                if (Camera.cam.zoom <= Camera.maxZoomLevel)

                    Camera.cam.zoom = Camera.cam.zoom + 0.01f;
                    Camera.updateCam();
                    update();
                    if (Camera.getCamXPosInWorld() - camEdgeDistance > 0) {
                        Camera.getCam().position.x = 0 + camEdgeDistance;
                    } else
                            if (Camera.getCamXPosInWorld() + camEdgeDistance < Map.getWidth() * Tile.getTileSize()) {
                                Camera.getCam().position.x = Map.getWidth() * Tile.getTileSize() - camEdgeDistance;

                }
            }
        }
            if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
                System.out.println("Clicked X: " + Camera.getPosAtMouseInWorld().x + "  Clicked Y: " + Camera.getPosAtMouseInWorld().y);
            }
        }
    }

