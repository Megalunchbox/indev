package com.megalunchbox.InDev.Input;

import com.megalunchbox.InDev.State.State;
import com.megalunchbox.InDev.State.ViewMode;

public abstract class InputListener {

    int keycode;

    public InputListener(int keycode) {

        this.keycode = keycode;


        if(State.getCurrentState() == State.SETTING) {
            onSettingState();
        }

        if (State.getCurrentState() == State.MENU) {
            onMenuState();
        }

        if (State.getCurrentState() == State.GAME) {
            if (ViewMode.getCurrentMode().getId() == ViewMode.MAP.getId()) {
                onMapView();
            }

            if (ViewMode.getCurrentMode().getId() == ViewMode.TERRITORY.getId()) {
                onTerritoryView();
            }
        }
    }

    public InputListener() {

        if(State.getCurrentState() == State.SETTING) {
            onSettingState();
        }

        if (State.getCurrentState() == State.MENU) {
            onMenuState();
        }

        if (State.getCurrentState() == State.GAME) {
            if (ViewMode.getCurrentMode() == ViewMode.MAP) {
                onMapView();
            }

            if (ViewMode.getCurrentMode() == ViewMode.TERRITORY) {
                onTerritoryView();
            }
        }
    }

    public abstract void onSettingState();

    public abstract void onMenuState();

    public abstract void onMapView();

    public abstract void onTerritoryView();


}
