package com.megalunchbox.InDev;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megalunchbox.InDev.Graphics.Render;
import com.megalunchbox.InDev.Map.RenderMap;
import com.megalunchbox.InDev.Util.Font.Font;
import jdk.jfr.events.ErrorThrownEvent;

public class Main extends ApplicationAdapter {

	Texture img;
	OrthographicCamera cam;
	BitmapFont font;
	RenderMap rMap;
	Render render;
	@Override
	public void create () {

		font = new BitmapFont();
		rMap = new RenderMap();
		rMap.create();
		render = new Render();

	}

	@Override
	public void render () {

		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		rMap.render();
		render.render();
		cam = new OrthographicCamera();
		cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}
	
	@Override
	public void dispose () {

		font.dispose();
		rMap.dispose();
	}
}
