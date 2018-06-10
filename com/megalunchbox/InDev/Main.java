package com.megalunchbox.InDev;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Game.Create;
import com.megalunchbox.InDev.Game.Dispose;
import com.megalunchbox.InDev.Game.Render;
import com.megalunchbox.InDev.Game.Update;
import com.megalunchbox.InDev.Graphics.Camera;
import com.megalunchbox.InDev.Input.Input;
import com.megalunchbox.InDev.Map.CreateMap;

public class Main extends ApplicationAdapter {

	OrthographicCamera cam;
    SpriteBatch skyBatch;
    Texture texture;
	@Override
	public void create () {

		new Create().create();
        new CreateMap().createMap();
		Camera.cam = new OrthographicCamera();
		Camera.cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		skyBatch = new SpriteBatch();
		texture = new Texture("core/assets/sky.png");
	}

	@Override
	public void render () {

        g();


        skyBatch.begin();
        skyBatch.draw(texture, 0,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        skyBatch.end();

        Input.checkInput();
        new Update().update();
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

	public OrthographicCamera getCam() {
		return cam;
	}
}
