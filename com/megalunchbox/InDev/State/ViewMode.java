package com.megalunchbox.InDev.State;

import java.util.HashMap;

public enum ViewMode {

    TERRITORY(0, "Territory"),  //View for one area
    MAP(1, "Map"), //Visual for all territories in the game world
    OVERVIEW(2, "Overview"), //Score, etc
    Diplomacy(3, "Diplomacy"); //Negotiations, relationships and etc with other civilizations



    private static ViewMode currentMode;

    int id;
    String name;

    ViewMode(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    private static HashMap<Integer, ViewMode> viewMap;

    static {
        viewMap = new HashMap<Integer, ViewMode>();
        for (ViewMode view : ViewMode.values()) {
            viewMap.put(view.getId(), view);
        }
    }

    public static ViewMode getViewModeById (int id) {
        return viewMap.get(id);
    }

    public static ViewMode getCurrentMode() {
        return currentMode;
    }

    public static void setCurrentMode(ViewMode currentMode) {
        ViewMode.currentMode = currentMode;
    }
}
