package com.cubesouls.engine;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class AssetFunctions {
	
	public final AssetManager manager = new AssetManager();
	private final String tileSprites = "sprites/triste.png";
	
	public void loadSprites() {
		manager.load(tileSprites, TextureAtlas.class);
	}
	
	public String getTileSpriteSheet() {
		return tileSprites;
	}
	
}
