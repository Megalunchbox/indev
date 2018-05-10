package com.megalunchbox.InDev.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.megalunchbox.InDev.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		System.out.println();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Indev";
		config.height = LwjglApplicationConfiguration.getDesktopDisplayMode().height;
		config.width = LwjglApplicationConfiguration.getDesktopDisplayMode().width;
		config.resizable = false;
		config.fullscreen = true;
		config.initialBackgroundColor = Color.BLACK;
		config.foregroundFPS = 60;
		new LwjglApplication(new Main(), config);
	}
}
