package com.megalunchbox.InDev.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.megalunchbox.InDev.Map.RenderMap;

public class Render {



    public void create () {

        new RenderMap().create();

    }


    public void render (OrthographicCamera cam) {

        new RenderMap().render();

        cam = new OrthographicCamera();
        cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    public void dispose() {

        new RenderMap().dispose();


    }



}
