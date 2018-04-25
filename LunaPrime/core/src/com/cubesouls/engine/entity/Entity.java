package com.cubesouls.engine.entity;

public class Entity implements WorldInfo {
	private double[] coords = new double[3];
	private String id;
	private boolean collidable = false;
	
	// criar entidade, sem espaco no mapa
	public Entity(String id, boolean collidable) {
		this.id = id;
		this.collidable = collidable;
	}
	
	// criar entidade, geralmente em ui
	public Entity(String id) {
		this.id = id;
	}
	
	// criar entidade, espaco no mapa, sem collidable. geralmente p item
	public Entity(String id, double[] coords) {
		this.id = id;
		this.coords = coords;
	}
	
	// criar entidade full. geralmente pra monstros e etc
	public Entity(String id, boolean collidable, double[] coords) {
		this.id = id;
		this.collidable = collidable;
		this.coords = coords;
	}
	
	protected boolean validateEntity(String id, String[] ids) {
		for (int x = 0; x < ids.length; x++) {
			if (ids[x] == id) {
				return true;
			}
		}
		return false;
	}

	// coordenadas do tile
	public double[] getCoords() {
		return coords;
	}
	
	public void setCoords(double[] coords) {
		this.coords = coords;
	}
	
	// nome do tile
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	// tem colisao?
	public boolean isCollidable() {
		return collidable;
	}
	
	public void setCollidable(boolean collidable) {
		this.collidable = collidable;
	}
}
