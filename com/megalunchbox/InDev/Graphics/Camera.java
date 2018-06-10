package com.megalunchbox.InDev.Graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class Camera {

    public static OrthographicCamera cam;

    public static OrthographicCamera getCam() {
        return cam;
    }

    public static void moveCam(int x, int y) {
        cam.translate(x, y);
    }

    public static void moveCamLeft(int distance) {
        cam.translate(distance * -1, 0);
    }

    public static void moveCamRight(int distance) {
        cam.translate(distance, 0);
    }

    public static void moveCamDown(int distance) {
        cam.translate(0, distance * -1);
    }

    public static void moveCamUp(int distance) {
        cam.translate(0, distance);
    }

    public static void updateCam() {
        cam.update();
   }

}
