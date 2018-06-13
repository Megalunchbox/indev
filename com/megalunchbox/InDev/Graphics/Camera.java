package com.megalunchbox.InDev.Graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;

public class Camera {

    public static OrthographicCamera cam;
    public static Vector3 defaultPos;
    public static float maxZoomLevel;

    public static void createCam() {
        cam = new OrthographicCamera();
        maxZoomLevel = cam.zoom;
        defaultPos = cam.position;
    }


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

   public static Vector3 getPosAtMouseInWorld() {
        return Camera.cam.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
   }

   public static Vector3 getPosInGameWorld(int x, int y) {
        return Camera.cam.unproject(new Vector3(x, y, 0));
   }

   public static float getPosXInGameWorld(int x) {
        Vector3 vector = Camera.cam.unproject(new Vector3(x,0,0));
        return vector.x;
   }
    public static float getPosXInGameWorld(float x) {
        Vector3 vector = Camera.cam.unproject(new Vector3(x,0,0));
        return vector.x;
    }

    public static float getPosYInGameWorld(float y) {
        Vector3 vector = Camera.cam.unproject(new Vector3(0,y,0));
        return vector.y;
    }

    public static float getPosYInGameWorld(int y) {
        Vector3 vector = Camera.cam.unproject(new Vector3(0,y,0));
        return vector.y;
    }

    public static float getCamX() {
        return cam.position.x;
    }

    public static float getCamY() {
        return cam.position.x;
    }

    public static void setCamX(float x) {
        cam.position.x = x;
    }

    public static void setCamY(float y) {
        cam.position.y = y;
    }


    public static void setCamPos(Vector3 pos) {

    }

    public static float getCamZoom() {
        return cam.zoom;
    }

    public static void setCamZoom(float zoom) {
        cam.zoom = zoom;
    }

    public static float getDefaultX() {
        return defaultPos.x;
    }

    public static float getDefaultY() {
        return defaultPos.y;
    }

    public static void setDefaultPos(Vector3 pos) {
        defaultPos = pos;
    }

    public static void setDefaultPosX(float x) {
        defaultPos.x = x;
    }

    public static void setDefaultPosY(float y) {
        defaultPos.y = y;
    }

    public static Vector3 getDefaultPos() {
        return defaultPos;
    }

    public static Vector3 getCamPos() {
        return cam.position;
    }

    public static float getCamXPosInWorld() {
        return getPosXInGameWorld(Camera.getCam().position.x);
    }

    public static float getCamYPosInWorld() {
        return getPosYInGameWorld(Camera.getCam().position.y);
    }

}


