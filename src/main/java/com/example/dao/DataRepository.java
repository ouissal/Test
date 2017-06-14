package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Data;
import com.example.entities.Produit;

public interface DataRepository extends JpaRepository<Data, Long>{
		
}
