package com.bradleybossard.libgdxgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainActivity extends ApplicationAdapter {
	SpriteBatch batch;
    BitmapFont font;
	//Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
        font = new BitmapFont();
        font.setColor(Color.RED);
        //font.setScale(30.0f);
		//img = new Texture("badlogic.jpg");
	}

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }


    @Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(img, 0, 0);
        font.draw(batch, "Hello World", 200, 200);
		batch.end();
	}

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

}
