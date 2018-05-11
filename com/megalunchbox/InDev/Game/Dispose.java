package com.megalunchbox.InDev.Game;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class Dispose {


    public void dispose() {

        new Render().dispose();
        new Update().dispose();
    }

}
