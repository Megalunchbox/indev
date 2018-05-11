package com.megalunchbox.InDev;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.megalunchbox.InDev.Game.Create;
import com.megalunchbox.InDev.Game.Dispose;
import com.megalunchbox.InDev.Game.Render;
import com.megalunchbox.InDev.Game.Update;
import com.megalunchbox.InDev.Map.CreateMap;

public class Main extends ApplicationAdapter {

	OrthographicCamera cam;

	@Override
	public void create () {
		new Create().create();
        new CreateMap().createMap();
	}

	@Override
	public void render () {

		    g();

		    new Update().update(cam);
            new Render().render(cam);

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
