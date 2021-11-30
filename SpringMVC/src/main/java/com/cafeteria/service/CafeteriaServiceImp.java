package com.cafeteria.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cafeteria.model.Item;

public class CafeteriaServiceImp implements CafeteriaService {
	private List<Item> itemList = new ArrayList<Item>();

	public CafeteriaServiceImp() {
		super();
		this.itemList.add(new Item(1, "Barger", 70, 7));
		this.itemList.add(new Item(2, "Pizza", 100, 10));
		this.itemList.add(new Item(1, "Sandwitch", 70, 7));
		this.itemList.add(new Item(2, "Singara", 100, 10));

	}

	public List<Item> getAllItems() {
		return this.itemList;
	}

	public String addItem(Item item) {
		try {
			this.itemList.add(item);

		} catch (Exception e) {
			return "Error adding new Item";
		}
		return "Item added successfully";
	}

	public Item getItemById(long id) {
		return this.itemList.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
	}

	public String updateItem(Item item) {
		try {
			this.itemList.set((int) (item.getId() - 1), item);
		} catch (Exception ex) {
			return "Error updating item information";
		}

		return "Successfully update item information";
	}

	@Override
	public String deleteItemById(long Id) {
		try {
			this.itemList.remove(getItemById(Id));
		} catch (Exception ex) {
			return "Error deleting item information";
		}
		return "item deleted successfully";
	}

}
