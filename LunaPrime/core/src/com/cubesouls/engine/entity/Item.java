package com.cubesouls.engine.entity;

public class Item extends Entity {

	
	private int quantity;

/* -- item list --
 * 
 */	
	private String[] items = {"air"};
	
	public String validateId(String id) {
		if (validateEntity(id, items) == false) {
			// printar isso aqui no futuro console ("Illegal entity being created: (" + id + ") is not registered.\nI should add modding support later.");
			id = "air";
		}
		return id;
	}
	
	// item no inventario ou seila
	public Item(String id, int quantity) {
		super(id);
		this.quantity = quantity;
	}
	
	// item no mundo
	public Item(String id, double[] coords, int quantity) {
		super(id, coords);
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
