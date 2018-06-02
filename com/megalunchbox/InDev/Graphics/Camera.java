package com.megalunchbox.InDev.Graphics;

import com.badlogic.gdx.Gdx;
import com.megalunchbox.InDev.Map.Map;

public class Camera {

    static int width;
    static int height;

    int xLeftEdge;
    int yBottomEdge;
    int yTopEdge;
    int xRightEdge;


    public Camera() {
        updateWidth();
        updateHeight();
    }

    public static void updateHeight() {
        if (Map.getScale() == 0) {
            height = Gdx.graphics.getHeight() / 16;
            return;
        }
        height = Gdx.graphics.getWidth() / (16 * Map.getScale());
        return;
    }

    public static void  updateWidth() {
        if (Map.getScale() == 0) {
            width = Gdx.graphics.getWidth() / (16);
            return;
        }
        width = Gdx.graphics.getWidth() / (16 * Map.getScale());
        return;
    }


}
