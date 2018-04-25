package com.cubesouls.engine.render;

import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.cubesouls.engine.entity.Tile;

public class TileRender {

	public void renderTile(Tile tile) {
		ModelBuilder mb = new ModelBuilder();
		model = mb.createBox(5f, 5f, 5f, material, attributes);
	}
}
