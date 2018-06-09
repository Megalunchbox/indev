package com.megalunchbox.InDev.Graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.megalunchbox.InDev.Map.Map;

public class Camera {

    OrthographicCamera cam  = new OrthographicCamera();

    static int width;
    static int height;

    static int xLeftEdge = 0;
    static int yBottomEdge = 0;
    static int yTopEdge;
    static int xRightEdge;


    public Camera() {
        updateWidth();
        updateHeight();
    }

    public static void updateHeight() {
        if (Map.getScale() == 0) {
            height = Gdx.graphics.getHeight() / 16;
            yTopEdge = height;
            return;
        }
        height = Gdx.graphics.getWidth() / (16 * Map.getScale());
        yTopEdge = height;
        return;
    }

    public static void  updateWidth() {
        if (Map.getScale() == 0) {
            width = Gdx.graphics.getWidth() / (16);
            width = xRightEdge;
            return;
        }
        width = Gdx.graphics.getWidth() / (16 * Map.getScale());
        width = xRightEdge;
        return;
    }

    public static int getxLeftEdge() {
        return xLeftEdge;
    }

    public static int getxRightEdge() {
        return xRightEdge;
    }

    public static int getyBottomEdge() {
        return yBottomEdge;
    }

    public static int getyTopEdge() {
        return yTopEdge;
    }
}
