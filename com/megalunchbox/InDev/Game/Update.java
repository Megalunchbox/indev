package com.megalunchbox.InDev.Game;

import com.megalunchbox.InDev.Input.Arrows;

public class Update {

    public void create() {


    }


    public void update() {

        Camera.updateCam();
        Arrows.update();
    }

    public void dispose() {




    }
}
