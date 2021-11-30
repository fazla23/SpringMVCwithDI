package com.cafeteria.service;

import java.util.List;

import com.cafeteria.model.Item;

public interface CafeteriaService {
	List<Item> getAllItems();

	String addItem(Item item);

	Item getItemById(long id);

	String updateItem(Item item);

	String deleteItemById(long Id);

}
