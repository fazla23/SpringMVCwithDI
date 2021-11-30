package com.cafeteria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cafeteria.model.Item;
import com.cafeteria.service.CafeteriaService;

@Controller
public class CafeteriaController {

	CafeteriaService cafeteriaService;

	public CafeteriaController(CafeteriaService cafeteriaService) {
		super();
		this.cafeteriaService = cafeteriaService;
	}

	@GetMapping("/getItemList")
	public ModelAndView getAllItems() {
		ModelAndView modelAndView = new ModelAndView("itemList");
		modelAndView.addObject("itemList", this.cafeteriaService.getAllItems());
		return modelAndView;
	}

	@GetMapping("/showNewItemForm")
	public String showNewCafeteriaForm(Model model) {
		Item item = new Item();
		model.addAttribute("item", item);
		return "addItem";
	}

	@PostMapping("/saveItem")
	public ModelAndView addItem(@ModelAttribute Item item) {
		cafeteriaService.addItem(item);
		ModelAndView modelAndView = new ModelAndView("itemList");
		modelAndView.addObject("itemList", this.cafeteriaService.getAllItems());
		return modelAndView;

	}

	@GetMapping("/updateItem/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Item item = cafeteriaService.getItemById(id);
		model.addAttribute("item", item);
		return "updateItem";
	}

	@PostMapping("updateItem/{id}")
	public ModelAndView updateItem(@PathVariable(value = "id") long id,

			@ModelAttribute("item") Item item) {
		cafeteriaService.updateItem(item);
		ModelAndView modelAndView = new ModelAndView("itemList");
		modelAndView.addObject("itemList", this.cafeteriaService.getAllItems());
		return modelAndView;
	}

	@GetMapping("/deleteItem/{id}")
	public ModelAndView DeleteEmployee(@PathVariable(value = "id") long id, Model model) {
		cafeteriaService.deleteItemById(id);
		ModelAndView modelAndView = new ModelAndView("itemList");
		modelAndView.addObject("itemList", this.cafeteriaService.getAllItems());
		return modelAndView;
	}

}
