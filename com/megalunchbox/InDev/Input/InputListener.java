package com.megalunchbox.InDev.Input;

import com.badlogic.gdx.Input;
import com.megalunchbox.InDev.Interface.InputInterface;


public abstract class InputListener implements InputInterface {

    int keycode;

    public InputListener(int keycode) {
    this.keycode = keycode;
    ListenerList.addListener(this);
    }


    public void onPress() {

    }


    public void onHold() {

    }


    public void listenFor() {

    }

    public int getKeycode() {
        return keycode;
    }

}
