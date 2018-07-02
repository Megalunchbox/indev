package com.megalunchbox.InDev.Input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector3;
import com.megalunchbox.InDev.Game.Camera;
import com.megalunchbox.InDev.Graphics.Button;
import com.megalunchbox.InDev.Map.Map;
import com.megalunchbox.InDev.State.State;
import com.megalunchbox.InDev.State.ViewMode;
import com.megalunchbox.InDev.Tile.Tile;

public class Arrows extends InputListener{


    static int upKey = Input.Keys.UP;
    static int downKey = Input.Keys.DOWN;
    static int leftKey = Input.Keys.LEFT;
    static int rightKey = Input.Keys.RIGHT;
    static int zoomOutKey = Input.Keys.Q;
    static int zoomInKey = Input.Keys.E;
    static float camEdgeDistance = (Gdx.graphics.getWidth() / 2);
    static float camBottomDistance = (Gdx.graphics.getHeight() / 2);


    public Arrows() {
        super();
    }


    public static void update() {
        camEdgeDistance = (Gdx.graphics.getWidth() / 2) * Camera.cam.zoom;
        camBottomDistance = (Gdx.graphics.getHeight() / 4) * Camera.cam.zoom;
        Camera.cam.update();

    }

    public boolean checkPressed(int keycode) {
        return Gdx.input.isKeyPressed(keycode);
    }

    @Override
    public void onSettingState() {

    }

    @Override
    public void onMenuState() {
        if (Gdx.input.justTouched()) {
            Button b;
            for(int i = 0; i > Button.buttons.size(); i++) {
                b = Button.buttons.get(i);
                Vector3 mouseVector = Camera.getPosAtMouseInWorld();

                if (b.getName() == "button-new-game") {
                    if (b.areCoordsWithinButton(mouseVector.x, mouseVector.y)) {

                        System.out.println("Log: clicked within button");
                        State.setCurrentState(State.GAME);
                        ViewMode.setCurrentMode(ViewMode.TERRITORY);

                    }

                }
            }
        }
    }

    @Override
    public void onMapView() {

    }

    @Override
    public void onTerritoryView() {
        if (Gdx.input.isKeyPressed(upKey)) {
            if(Camera.getCamYPosInWorld() + camBottomDistance + 1 < Map.getCurrentMap().getHeight() * Tile.getTileSize()) {
                Camera.moveCamUp(1f);
            }
        }

        if (Gdx.input.isKeyPressed(downKey)) {
            if (Camera.getCamYPosInWorld() - camBottomDistance - 1 > 0) {
                Camera.moveCamDown(1f);
            }
        }

        if (Gdx.input.isKeyPressed(leftKey)) {
            if (Camera.getCamXPosInWorld() - 1 - camEdgeDistance > 0) {
                Camera.moveCamLeft(1f);
            }
        }
        if (checkPressed(rightKey)) {
            if (Camera.getCamXPosInWorld() + camEdgeDistance + 1 < (Map.getCurrentMap().getWidth() * Tile.getTileSize())) {
                Camera.moveCamRight(1f);
            }
        }
        if (checkPressed(zoomInKey)) {
            if (Camera.cam.zoom - 0.1f > 0) {
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
                        Camera.getCam().position.x = camEdgeDistance;
                    } else
                            if (Camera.getCamXPosInWorld() + camEdgeDistance < Map.getCurrentMap().getWidth() * Tile.getTileSize()) {
                                Camera.getCam().position.x = Map.getCurrentMap().getWidth() * Tile.getTileSize() - camEdgeDistance;

                }
            }
        }
            if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
                System.out.println("Cam edge distance: " + camEdgeDistance);
                System.out.println("Cam Xpos: " + Camera.getCamXPosInWorld());
            }
        }
    }

