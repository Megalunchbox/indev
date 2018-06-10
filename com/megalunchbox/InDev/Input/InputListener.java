package com.megalunchbox.InDev.Input;

public abstract class InputListener {

    int keycode;

    public InputListener(int keycode) {
        this.keycode = keycode;
        onSettingState();
        onMenuState();
        onMapView();
        onTerritoryView();
    }

    public abstract void onSettingState();

    public abstract void onMenuState();

    public abstract void onMapView();

    public abstract void onTerritoryView();


}
