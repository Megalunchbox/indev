package com.megalunchbox.InDev.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.megalunchbox.InDev.Graphics.Button;

public class Game {

    static Button newGameButton;
    static Button loadGameButton;
    static Button settingsButton;


    public static void create() {

        newGameButton = new Button(Gdx.graphics.getHeight()/10, Gdx.graphics.getWidth()/3, 0f, 0f, new Texture("button_new_game.png"), "new-game-button");
        newGameButton.setX(Gdx.graphics.getWidth()/2 - newGameButton.getWidth()/2);
        newGameButton.setY(Gdx.graphics.getHeight() * 0.6f);

        loadGameButton = new Button(Gdx.graphics.getHeight()/10, Gdx.graphics.getWidth()/3, 0f, 0f, new Texture("button_load_game.png"), "load-game-button");
        loadGameButton.setX(Gdx.graphics.getWidth()/2 - newGameButton.getWidth()/2);
        loadGameButton.setY(Gdx.graphics.getHeight() * 0.5f);

        settingsButton = new Button(Gdx.graphics.getHeight()/10, Gdx.graphics.getWidth()/3, 0f, 0f, new Texture("button_settings.png"), "settings-menu-button");
        settingsButton.setX(Gdx.graphics.getWidth()/2 - newGameButton.getWidth()/2);
        settingsButton.setY(Gdx.graphics.getHeight() * 0.4f);

    }

    public static Button getLoadGameButton() {
        return loadGameButton;
    }

    public static Button getNewGameButton() {
        return newGameButton;
    }

    public static Button getSettingsButton() {
        return settingsButton;
    }

}
