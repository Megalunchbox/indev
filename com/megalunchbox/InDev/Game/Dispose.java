package com.megalunchbox.InDev.Game;

public class Dispose {


    public void dispose() {

        new Render().dispose();
        new Update().dispose();
    }

}
