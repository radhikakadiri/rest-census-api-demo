package com.population.demo.repository;

import com.population.demo.model.Country;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {

    //Country findByIsbn(String isbn);
	
	List<Country> findAll();
}