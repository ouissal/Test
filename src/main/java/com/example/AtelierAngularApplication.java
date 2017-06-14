package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.DataRepository;
import com.example.dao.ProduitRepository;
import com.example.entities.Data;
import com.example.entities.Produit;

@SpringBootApplication
public class AtelierAngularApplication implements CommandLineRunner {

	
	@Autowired
	private ProduitRepository produitRepository;
	
	
	@Autowired
	private DataRepository dataRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AtelierAngularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		produitRepository.save(new Produit("hp",900,6));
		produitRepository.save(new Produit("samsung",800,60));
		produitRepository.save(new Produit("iphone",1000,10));
		produitRepository.save(new Produit("dell",9000,20));
		produitRepository.save(new Produit("sony",8000,30));
		
		dataRepository.save(new Data("quel est votre premier choix ?","samsung"));

	}
}
