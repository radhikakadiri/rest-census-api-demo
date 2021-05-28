package com.population.demo.controllers;

import com.population.demo.model.Country;
import com.population.demo.model.State;
import com.population.demo.repository.StateRepository;
import com.population.demo.service.CensusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/countries")
public class CensusController {
    @Autowired
    CensusService censusService;

    @GetMapping("")
    public List<Country> list() {
        return censusService.listAllCountries();
    }
    
    //addState(country_cd, state_cd, state_name, state_population)
    
    //@PostMapping("/{country_cd}{state_cd}{state_name}{state_population}")
    //public void add(@RequestBody State state) {
   /* public void add(@PathVariable String country_cd, @PathVariable String state_cd,@PathVariable String state_name, @PathVariable Integer state_population) {//,@RequestBody State state
    	State state = new State(country_cd,state_cd,state_name,state_population);
    	//State state = new State("BLD","CTR","CenterProvince",13987);
    	System.out.println("calling the addstate service from controller");
        censusService.addState(state);
    }*/
    
    @PostMapping("/")
    public void add(@RequestBody State state) {//,@RequestBody State state
    	//State state = new State(country_cd,state_cd,state_name,state_population);
    	//State state = new State("BLD","CTR","CenterProvince",13987);
    	System.out.println("calling the addstate service from controller");
    	// state = new State("BLD","CTR","CenterProvince",13987);
        censusService.addState(state);
    }
    
    
    
    //---------------------------
  /*  @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User user = userService.getUser(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody User user) {
        userService.saveUser(user);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
        try {
            User existUser = userService.getUser(id);
            user.setId(id);            
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        userService.deleteUser(id);
    }
    
    
    /* getAllCountryPopulations()
     * getAllCountryCurrencies()
     * validateState(country_code, state_code)
     * addState(country_cd, state_cd, state_name, state_population)
     */
    
}