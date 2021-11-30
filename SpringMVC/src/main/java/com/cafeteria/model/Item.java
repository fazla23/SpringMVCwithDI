package com.cafeteria.model;

public class Item {

	private long id;
	private String ItemName;
	private double ItemPrice;
    private int quantity;
	
	
	public Item(long id, String itemName, double itemPrice, int quantity) {
		super();
		this.id = id;
		ItemName = itemName;
		ItemPrice = itemPrice;
		this.quantity = quantity;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public double getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	
    

}
