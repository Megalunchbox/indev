package com.megalunchbox.InDev.Input;

import java.util.ArrayList;

public class ListenerList {

    private static ArrayList<InputListener> list = new ArrayList<InputListener>();

    static public void addListener(InputListener o) {
        list.add(o);
    }

    static public void delListener(InputListener o) {
        list.remove(o);
    }

    static public InputListener getListenerAtIndex(int i) {
        return list.get(i);
    }

    public static ArrayList<InputListener> getList() {
        return list;
    }
}
