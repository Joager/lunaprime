package com.cubesouls.engine.entity;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Tile extends Entity {
	
	private int[] size = new int[3]; // xyz
	private Sprite sprite;
	
/* -- tile list --
 * ar, collidable false
 * agua e etc, coisas que fluem, implementam flowable
 * quase-agua, tipo magma e molho barbecue, implementam flowable mas lento
 * solidos
 */
	
	private String[] tiles = {
			"air", "void", "abyss", 
			"water", "lava", "acid", 
			"magma",
			"barrier", "stone", "stonebrick", "cobblestone"
			};
	
	// criacao de tile
	public Tile(String id, boolean collidable, double[] coords) {
		super(id, collidable);
		if (validateEntity(id, tiles) == false) {
			// printar isso aqui no futuro console ("Illegal entity being created: (" + id + ") is not registered.\nI should add modding support later.");
			id = "air";
		}
	}
	
	public String[] getTiles() {
		return tiles;
	}
	
	public int[] getSize() {
		return size;
	}

	public void setSize(int[] size) {
		this.size = size;
	}
	
}
