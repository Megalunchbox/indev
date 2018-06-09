package com.megalunchbox.InDev.State;

import java.util.ArrayList;

public class State {

    public int currentState;
    String currentStateName;

    ArrayList<StateBuilder> states = new ArrayList<StateBuilder>();

    public static class StateBuilder {

        int id;
        String name;

        StateBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }


    /**
     *
     * returns true if states are using the same id
     *
     * @return boolean
     */
    public boolean checkSameIds() {
        ArrayList<Integer> usedIds = new ArrayList<Integer>();
        for (int i = 0; i > states.size(); i++) {
            int id = states.get(i).id;
            usedIds.add(id);
            for(int x = 0; x> usedIds.size(); x++) {
                if (usedIds.get(x) == id) return true;
            }
        }
        return false;
    }


}
