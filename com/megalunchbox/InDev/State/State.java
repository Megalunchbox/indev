package com.megalunchbox.InDev.State;

import java.util.HashMap;

public enum State {

    MENU(0, "Menu"), //The title screen
    GAME(1, "Game"), //Where you play the game :)
    SETTING(2, "Setting"); //For changing things such as controls, resolution, and graphics (if your pc is that bad lmao)


    static State currentState;

    int id;
    String name;

     State(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static State getCurrentState() {
        return currentState;
    }

    public static void setCurrentState(State currentState) {
        State.currentState = currentState;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    private static HashMap<Integer, State> stateMap;

    static {
        stateMap = new HashMap<Integer, State>();
        for (State state : State.values()) {
            stateMap.put(state.getId(), state);
        }
    }

    public static State getStateModeById (int id) {
        return stateMap.get(id);
    }



}
