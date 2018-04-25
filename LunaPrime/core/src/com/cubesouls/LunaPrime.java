package com.cubesouls;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cubesouls.engine.AssetFunctions;

public class LunaPrime extends ApplicationAdapter {
	/* GAMESTATE
	 * Define o estado atual do jogo
	 * 0 = load antes do menu (mostrando nosso logo)
	 * 1 = menu
	 * 2 = load novo jogo
	 * 3 = load save game
	 * 4 = pause
	 */
	public final int GAMESTATE = 0;
	
	/* LOADSTATE
	 * Define o estado atual da loadscreen
	 * 0 = nd
	 * 1 = sprites
	 * 2 = musica
	 * 3 = sons
	 * 4 = fontes
	 */
	private final int LOADSTATE = 0;
	
	SpriteBatch batch;
	Texture logo;
	AssetFunctions af = new AssetFunctions();
	BitmapFont font;
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		logo = new Texture("badlogic.jpg");
		font = new BitmapFont(Gdx.files.internal("riven.fnt"), false);
		font.setColor(Color.RED);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
//		batch.draw(img, 0, 0);
		font.draw(batch, "amo a lulu", 200, 200);
		batch.end();
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		logo.dispose();
		font.dispose();
		af.manager.dispose();
	}

	protected int getLoadState() {
		return LOADSTATE;
	}
}
