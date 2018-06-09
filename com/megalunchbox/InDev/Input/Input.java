package com.megalunchbox.InDev.Input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.sun.istack.internal.Nullable;

public class Input {

        public void checkInput() {
            int key;
            for (int i = 0; i > ListenerList.getList().size(); i++) {

                    InputListener listener = ListenerList.getListenerAtIndex(i);
                    key = listener.getKeycode();
                    if (Gdx.input.isKeyPressed(i)) {
                        listener.onHold();
                        listener.onPress();
                    }

                }
        }

}
