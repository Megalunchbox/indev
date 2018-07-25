package com.megalunchbox.InDev;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.megalunchbox.InDev.Game.Create;
import com.megalunchbox.InDev.Game.Dispose;
import com.megalunchbox.InDev.Game.Render;
import com.megalunchbox.InDev.Game.Update;
import com.megalunchbox.InDev.Game.Camera;
import com.megalunchbox.InDev.Input.Input;
import com.megalunchbox.InDev.Map.CreateMap;
import com.megalunchbox.InDev.Map.Map;
import com.megalunchbox.InDev.State.State;
import com.megalunchbox.InDev.State.ViewMode;

public class Main extends ApplicationAdapter {

	public static Map testMap;

	@Override
	public void create () {

		testMap = new Map();
		new Create().create();
        testMap = CreateMap.createMap(testMap);
		Camera.cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		State.setCurrentState(State.MENU);
		ViewMode.setCurrentMode(ViewMode.TERRITORY);
		Map.setCurrentMap(testMap);

	}

	@Override
	public void render () {

        g();
		Input.checkInput();
        new Update().update();
        new Render().render();



        }



	
	@Override
	public void dispose () {
	    new Dispose().dispose();

	}

	public void g() {

        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

}
