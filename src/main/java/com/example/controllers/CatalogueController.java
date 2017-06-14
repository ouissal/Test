package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.DataRepository;
import com.example.dao.ProduitRepository;
import com.example.entities.Data;
import com.example.entities.Produit;

@RestController
public class CatalogueController {
	@Autowired
	private ProduitRepository produitRepository;

	@Autowired 
	private DataRepository dataRepository;
	
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}

	@RequestMapping("/produits")
	public List<Produit> getProduits() {
		return produitRepository.findAll();
	}

	@RequestMapping("/save")
	public Produit save(Produit p) {
		return produitRepository.save(p);
	}
	
	@RequestMapping("/data")
	public Data saveData(Data data) {
		return dataRepository.save(data);
	}
}
