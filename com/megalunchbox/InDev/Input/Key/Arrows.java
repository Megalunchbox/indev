package com.megalunchbox.InDev.Input.Key;


import com.badlogic.gdx.Input;
import com.megalunchbox.InDev.Input.InputListener;

public class Arrows {


    public static class ArrowUp extends InputListener{

        ArrowUp() {
            super(Input.Keys.UP);
        }

        @Override
        public void onPress() {

        }

        @Override
        public void onHold() {

        }
    }

    public static class ArrowDown extends InputListener{


        public ArrowDown() {
            super(Input.Keys.DOWN);
        }

        @Override
        public void onPress() {

        }

        @Override
        public void onHold() {

        }
    }

    public static class ArrowLeft extends InputListener{


        public ArrowLeft() {
            super(Input.Keys.LEFT);
        }

        @Override
        public void onPress() {

        }

        @Override
        public void onHold() {

        }
    }

    public static class ArrowRight extends InputListener{

        ArrowRight() {
            super(Input.Keys.RIGHT);
        }


        @Override
        public void onPress() {

        }

        @Override
        public void onHold() {

        }
    }



}
