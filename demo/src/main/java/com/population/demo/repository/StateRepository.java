package com.population.demo.repository;

import com.population.demo.model.Country;
import com.population.demo.model.State;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StateRepository extends CrudRepository<State, Long> {

    List<State> findByCountry(Country country, Sort sort);
    //State save(State state);
}